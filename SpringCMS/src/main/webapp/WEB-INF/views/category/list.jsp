<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../elements/head.jsp"/>

<h1>Categorie list:</h1>

<div class="container">
    <div class="row">

        <table class="table  table-dark">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Description</th>
                <th>Actions</th>
            </tr>
            </thead>

            <c:forEach items="${categories}" var="categorie">
                <tr>

                    <td>${categorie.id}</td>
                    <td>${categorie.name}</td>
                    <td>${categorie.description}</td>
                    <td>
                        <a href="/category/edit/${categorie.id}">EDIT</a> |
                        <a href="#" onclick="confirmDelete(${categorie.id}, '${categorie.name}')">DELETE</a>
                    </td>

                </tr>
            </c:forEach>
        </table>

    </div>
</div>

<script>
    function confirmDelete(id, name) {
        if (confirm("Do you want to delete a category '" + name + "'?")) {
            window.location.href = "/category/delete/" + id;
        }
    }
</script>

</body>
</html>
