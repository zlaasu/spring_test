<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../elements/head.jsp" />

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
