<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
    <jsp:include page="import-style.jsp"/>
    <style>
        tr, td, th {
            padding: 10px 20px !important;
        }
    </style>
</head>
<body>
<div>
    <jsp:include page="header.jsp"/>
    <div class="container-fluid d-flex align-items-center justify-content-center p-3">
        <div class="card w-100">
            <img alt="bg" class="card-img-top" style="height: 300px; object-fit: cover" src="../resources/images/R.jpg"/>
            <div class="card-body">
                <form name="searchForm" method="get" class="d-flex align-items-center gap-3 mb-3">
                    <p class="mb-0">First Name:</p>
                    <input name="key" aria-label="" class="form-control w-25"/>
                    <button class="btn btn-secondary">Search</button>
                </form>
                <table class="table-bordered w-100">
                    <thead class="bg-dark text-light">
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Gender</th>
                        <th>Telephone</th>
                        <th>You're in</th>
                        <th>Hobbies</th>
                        <th>Description</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.personals}" var="item">
                        <tr>
                            <td>${item.firstName}</td>
                            <td>${item.lastName}</td>
                            <td>${item.gender}</td>
                            <td>${item.mobile}</td>
                            <td>${item.area}</td>
                            <td>${item.hobbies}</td>
                            <td>${item.description}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<jsp:include page="import-js.jsp"/>
</body>
</html>