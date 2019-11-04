<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="../elements/head.jsp"/>

<h1>Category</h1>

<div class="container">
    <div class="row">

        <form:form method="POST" modelAttribute="category">

            <form:hidden path="id"/>

            <div class="form-group">
                <label>
                    Name:
                    <form:input path="name"/>
                        <%--        <form:errors path="firstName" element="div" cssClass="error"/>--%>
                </label>
            </div>

            <div class="form-group">
                <label>
                    Description:
                    <form:textarea path="description"/>
                        <%--        <form:errors path="lastName" element="div" cssClass="error"/>--%>
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
