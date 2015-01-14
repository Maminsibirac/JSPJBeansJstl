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
        <c:forEach var="map" items="${jbeans.map}">
            <tr><td><c:out value="${map.key}" /></td>
            <td><c:out value="${map.value}" /></td></tr>
        </c:forEach>
    </c:forEach>
    </table>
</body>