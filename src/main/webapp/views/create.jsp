<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
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
    <div class="container d-flex align-items-center justify-content-center p-3">
        <div class="card w-50">
            <img alt="bg" class="card-img-top" src="../resources/images/R.jpg"/>
            <form name="createForm" class="card-body">
                <table class="w-100">
                    <tbody>
                    <tr>
                        <td>First name:</td>
                        <td>
                            <input name="firstName" aria-label=""
                                   class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Last name:</td>
                        <td>
                            <input name="lastName" aria-label=""
                                   class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Gender:</td>
                        <td>
                            <select name="gender" aria-label=""
                                    class="form-control">
                                <option selected value="">Gender</option>
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Telephone:</td>
                        <td>
                            <input name="phone" aria-label=""
                                   class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td>
                            <input name="email" aria-label=""
                                   class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td>You are in:</td>
                        <td>
                            <div class="d-flex align-items-center gap-3">
                                <div>
                                    <input name="area" aria-label="area"
                                           value="Europe" type="radio"/> Europe
                                </div>
                                <div>
                                    <input name="area" aria-label="area"
                                          value="Asia" type="radio"/> Asia
                                </div>
                                <div>
                                    <input name="area" aria-label="area"
                                           value="Africa" type="radio"/> Africa
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>Hobbies:</td>
                        <td>
                            <div class="d-flex align-items-center gap-3">
                                <div>
                                    <input name="hobbies" aria-label="area"
                                           type="checkbox" value="Badminton"/> Badminton
                                </div>
                                <div>
                                    <input name="hobbies" aria-label="area"
                                           type="checkbox" value="Volleyball"/> Volleyball
                                </div>
                                <div>
                                    <input name="hobbies" aria-label="area"
                                           type="checkbox" value="Football"/> Football
                                </div>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>Description:</td>
                        <td>
                            <textarea class="form-control" aria-label="" name="description"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <div class="w-100 text-center">
                                <button type="submit" class="btn btn-success">Register</button>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
</div>
<jsp:include page="import-js.jsp"/>
</body>
</html>