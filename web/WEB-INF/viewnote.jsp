<%-- 
    Document   : viewnote
    Created on : Sep 27, 2022, 2:32:43 PM
    Author     : Sharon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>viewNote</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        Title: <input type="text" name="title" value="${note.title}"><br>
        Content: <input type ="text" name="title" value="${note.content}"><br>
        <a href="note?edit" name="edit">Edit</a>
    </body>
</html>
