<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zlasu
  Date: 2019-10-24
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiply</title>
</head>
<body>

<table>
    <thead>
    <th>x</th>
    <c:forEach var="j" begin="1" end="${size}">
        <th><c:out value="${j}"/></th>
    </c:forEach>
    </thead>
    <tbody>
    <c:forEach var="i" begin="1" end="${size}">
        <tr>
            <td><b>${i}</b></td>
            <c:forEach var="j" begin="1" end="${size}">
                <td><c:out value="${i * j}"/></td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
