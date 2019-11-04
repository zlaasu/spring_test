<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../elements/head.jsp"/>

<h1>Author</h1>

<div class="container">
    <div class="row">

        <form:form method="POST" modelAttribute="article">

            <form:hidden path="id"/>

            <div class="form-group">
                <label>
                    Ttile:
                    <form:input path="title" size="100"/>
                    <form:errors path="title" element="div" cssClass="error"/>
                </label>
            </div>

            <div class="form-group">
                <label>
                    Content:
                    <form:textarea path="content" rows="10" cols="100"/>
                    <form:errors path="content" element="div" cssClass="error"/>
                </label>
            </div>

            <div class="form-group">
                <label>
                    Author:
                    <form:select itemLabel="firstName" itemValue="id"
                                 path="author.id" items="${authors}"/>
                    <form:errors path="author.id" element="div" cssClass="error"/>
                </label>
            </div>

            <div class="form-group">
                <label>
                    Categories:
                    <form:select itemLabel="name" itemValue="id"
                                 path="categorys" items="${categories}"/>
                    <form:errors path="categorys" element="div" cssClass="error"/>
                </label>
            </div>

            <div class="form-group">
                <input type="submit" value="Save"/>
            </div>
        </form:form>

    </div>
</div>

</body>
</html>
