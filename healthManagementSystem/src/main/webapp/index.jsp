<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	    
    <title>User Login</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/Login.css">
</head>
<body>
    <div class="login-container">
        <h3 class="login-heading">HEALTH MANAGEMENT SYSTEM</h3>

        <!-- User input form to validate a user -->
        <c:url var="validateUrl" value="/user/validate" />
        <form class="login-form" action="${validateUrl}" method="POST">
            <label for="name">Username:</label>
            <input type="text" id="name" placeholder="Enter username" name="username">

            <label for="pwd">Password:</label>
            <input type="password" id="pwd" placeholder="Enter password" name="password">

            <button type="submit">Confirm Identity</button>
        </form>
    </div>
</body>
</html>
