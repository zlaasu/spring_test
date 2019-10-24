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
    <style>
        .zui-table {
            border: solid 1px #DDEEEE;
            border-collapse: collapse;
            border-spacing: 0;
            font: normal 13px Arial, sans-serif;
        }

        .zui-table thead th, .first {
            background-color: #DDEFEF;
            border: solid 1px #DDEEEE;
            color: #336B6B;
            padding: 10px;
            text-align: left;
            text-shadow: 1px 1px 1px #fff;
        }

        .zui-table tbody td {
            border: solid 1px #DDEEEE;
            color: #333;
            padding: 10px;
            text-shadow: 1px 1px 1px #fff;
        }
    </style>
</head>
<body>

<table class="zui-table">
    <thead>
    <th>x</th>
    <c:forEach var="j" begin="1" end="${cols}">
        <th><c:out value="${j}"/></th>
    </c:forEach>
    </thead>
    <tbody>
    <c:forEach var="i" begin="1" end="${rows}">
        <tr>
            <td class="first"><b>${i}</b></td>
            <c:forEach var="j" begin="1" end="${cols}">
                <td><c:out value="${i * j}"/></td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
