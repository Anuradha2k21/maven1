<%-- 
    Document   : register
    Created on : 02-Sep-2023, 15:04:34
    Author     : anura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register Student</h1>
        <form action="student" method="post">
            <label for="name">Name:</label><br>
            <input name="name" type="text"/><br>
            
            <label for="age">Age:</label><br>
            <input name="age" type="number"/><br><br>
            
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
