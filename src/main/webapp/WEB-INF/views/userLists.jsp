<%--
  Created by IntelliJ IDEA.
  User: thangnguyen
  Date: 3/30/15
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Home</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel='stylesheet' href='/assets/css/bootstrap.min.css'>
</head>
<body>
<c:forEach var="user" items="${userList}" varStatus="status">
    <tr>
        <td>${status.index + 1}</td>
        <td>${user.username}</td>
        <td>${user.email}</td>
        <td>
            <a href="edit?id=${user.id}">Edit</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="delete?id=${user.id}">Delete</a>
        </td>
    </tr>
</c:forEach>
<div class="jumbotron">
  <h1>Hello, world!</h1>
  <p>...</p>
  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
</div>
<script type="text/javascript" src="/assets/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
</body>
</html>
