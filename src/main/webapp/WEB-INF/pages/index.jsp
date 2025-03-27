<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type=" text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
<div class="container-fluid mt-3">
    <c:url value="/departments/listDepartments" var="departmentUrl"/>
    <a href="${departmentUrl}" class="link-primary fs-4">Department</a>
</div>
</body>
</html>