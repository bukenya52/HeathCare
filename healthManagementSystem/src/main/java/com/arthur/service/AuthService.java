package com.arthur.service;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.arthur.pojo.User;

public class AuthService {

    private HibernateTemplate hibernateTemplate;
    private static Logger log = Logger.getLogger(AuthService.class);

    private AuthService() { }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @SuppressWarnings("deprecation")
    public boolean findUser(String uname, String upwd) {
        log.info("Checking the user in the database");
        boolean isValidUser = false;

        String hqlQuery = "from User u where u.name = :uname and u.password = :upwd";

        try {
            Collection<?> userObj = hibernateTemplate.findByNamedParam(hqlQuery, new String[]{"uname", "upwd"}, new Object[]{uname, upwd});

            if (userObj != null && !userObj.isEmpty()) {
                User user = (User) ((List<?>) userObj).get(0);
                log.info("Id= " + user.getId() + ", Name= " + user.getName() + ", Password= " + user.getPassword());
                isValidUser = true;
            }
        } catch (Exception e) {
            isValidUser = false;
            log.error("An error occurred while fetching the user details from the database", e);
        }

        return isValidUser;
    }
}
