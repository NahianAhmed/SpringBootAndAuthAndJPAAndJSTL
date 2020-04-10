<!DOCTYPE html>
<html>

<%@ include file="partials/head.jsp" %>

<body class="container" >
<%@ include file="partials/navbar.jsp" %>


<%-- this will be injected--%>
<jsp:include page="${content}" />
<%--<%@ include file="${content}" %>--%>
<%-- this will be injected--%>

<%@ include file="partials/footer.jsp" %>
</body>
</html>