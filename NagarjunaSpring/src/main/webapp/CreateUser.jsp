<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 3/27/2017
  Time: 8:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CREATE USER</title>
</head>
<body>

<form action="#">
    <table>
        <tr>
            <td>Username : </td>
            <td><input type="text" name="userName"/> </td>
        </tr>
        <tr>
            <td>Password : </td>
            <td><input type="text" name="password"/></td>
        </tr>
        <tr>
            <td>Confirm Password : </td>
            <td><input type="text" name="confirmPassword"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Create User"/></td>
            <td></td>
        </tr>
    </table>
</form>
</body>
</html>
