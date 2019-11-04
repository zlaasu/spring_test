<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zlasu
  Date: 2019-10-28
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Article</title>
</head>
<body>

<h1>Recent article</h1>

<c:forEach items="${articles}" var="article">
    <p><b>Id:</b> ${article.id}</p>
    <p><b>title:</b> ${article.title}</p>
    <p>${article.content}</p>
</c:forEach>

<h1>Categories:</h1>

<c:forEach items="${categorys}" var="category">
    <p><a href="/article/list/${category.id}">${category.name}</a></p>
</c:forEach>

</body>
</html>
