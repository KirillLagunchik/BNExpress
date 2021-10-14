<%--
  Created by IntelliJ IDEA.
  User: k.lagunchik
  Date: 12.10.2021
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Аутентификация</title>
</head>
<body>
    <h1>Аутентификация</h1>
    <p ${emailLoginRequest.partnerEmailAddress}/>
</body>
</html>
