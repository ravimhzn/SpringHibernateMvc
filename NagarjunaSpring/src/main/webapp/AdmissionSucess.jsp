<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 3/24/2017
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h1>${details}</h1>--%>
Name : ${student.getStudentName()} </br>
Address : Street : ${student.getAddress().getStreet()} City : ${student.getAddress().getCity()} Country : ${student.getAddress().getCountry()} PinCode : ${student.getAddress().getPincode()} </br>
Mobile Number : ${student.getMobile()}</br>
Date of birth : ${student.getStudentDob()}</br>
Course : ${student.getCourse()}</br>
</body>
</html>
