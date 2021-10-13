<%--
  Created by IntelliJ IDEA.
  User: k.lagunchik
  Date: 11.10.2021
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Регистрация</title>
</head>
<body>
    <h3>Регистрация: </h3>
    <form:form method="POST" action="/BNExpress_war/email-login" modelAttribute="partnerEmailAddress">
        <table>
            <tr>
                <td><form:label path="partnerEmailAddress">Email</form:label></td>
                <td><form:input path="partnerEmailAddress"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Подтвердить"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
