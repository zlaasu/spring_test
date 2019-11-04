<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../elements/head.jsp" />

<h1>All article</h1>

<c:forEach items="${articles}" var="article">
    <p><b>Id:</b> ${article.id}</p>
    <p><b>title:</b> ${article.title}</p>
    <p>${article.content}</p>
</c:forEach>

</body>
</html>
