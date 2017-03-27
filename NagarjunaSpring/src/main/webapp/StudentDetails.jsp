<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 3/24/2017
  Time: 9:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:errors path="student.*"/>

<form action="studentSucess" method="get">
    Student Name : <input type="text" name="studentName" id="studentName"/></br>
    Address : <input type="text" name="address.street" placeholder="Street"/>
    <input type="text" name="address.city" placeholder="City"/>
    <input type="text" name="address.country" placeholder="Country"/>
    <input type="number" name="address.pincode" placeholder="PinCode"/>/br>
    Mobile Number : <input type="text" name="mobile" id="mobile"/></br>
    Student DOB : <input type="text" name="studentDob" id="studentDob"/></br>
    Course : <select name="course">
    <Option value="bsc_csit">Bsc.CSIT</Option>
    <Option value="bim">BIM</Option>
    <Option value="bba">BBA</Option>
    <Option value="bca">BCA</Option>
</select></br>

    <input type="submit" value="Submit Details..."/>
</form>
</body>
</html>
