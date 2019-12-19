<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="common/header.jsp">
    <jsp:param name="pageTitle" value="Main page"/>
</jsp:include>
<div>
    Main page content
    <c:if test="${user} != null">
        HELLO ${user}!
    </c:if>
    <c:if test="${user} == null">
         Login button
    </c:if>
</div>
<jsp:include page="common/footer.jsp"/>