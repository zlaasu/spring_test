<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../elements/head.jsp"/>

<h1>Author list:</h1>

<div class="container">
    <div class="row">

        <table class="table  table-dark">
            <thead>
            <tr>
                <th>Id</th>
                <th>First name</th>
                <th>Last Name</th>
                <th>Actions</th>
            </tr>
            </thead>

            <c:forEach items="${authors}" var="author">
                <tr>

                    <td>${author.id}</td>
                    <td>${author.firstName}</td>
                    <td>${author.lastName}</td>
                    <td>
                        <a href="/author/edit/${author.id}">EDIT</a> |
                        <a href="#" onclick="confirmDelete(${author.id}, '${author.firstName}')">DELETE</a>
                    </td>

                </tr>
            </c:forEach>
        </table>

    </div>
</div>

<script>
    function confirmDelete(id, name) {
        if (confirm("Do you want to delete a author '" + name + "'?")) {
            window.location.href = "/author/delete/" + id;
        }
    }
</script>

</body>
</html>
