<%@page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<jsp:useBean id="jbeans" class="com.sevenbits.jbeans.JBeans" scope="application" >
<jsp:setProperty name="jbeans" property="*" />
</jsp:useBean>


<html>
<head><title>Employees</title></head>
<body>

    <h2>Employees</h2>
    <table>
    <c:forEach var="list" items="${jbeans.employee}">
        <tr><td><c:out value="${list['firstName']}" /></td>
        <td><c:out value="${list['surName']}" /></td></tr>
    </c:forEach>
    </table>
</body>