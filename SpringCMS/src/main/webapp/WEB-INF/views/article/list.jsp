<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../elements/head.jsp" />


<h1>Article list:</h1>

<div class="container">
    <div class="row">

        <table class="table  table-dark">
            <thead>
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Actions</th>
            </tr>
            </thead>

            <c:forEach items="${articles}" var="article">
                <tr>

                    <td>${article.id}</td>
                    <td>${article.title}</td>
                    <td>
                        <a href="/article/edit/${article.id}">EDIT</a> |
                        <a href="#" onclick="confirmDelete(${article.id}, '${article.title}')">DELETE</a>
                    </td>

                </tr>
            </c:forEach>
        </table>

    </div>
</div>

<script>
    function confirmDelete(id, name) {
        if (confirm("Do you want to delete a article '" + name + "'?")) {
            window.location.href = "/article/delete/" + id;
        }
    }
</script>

</body>
</html>
