<%-- 
    Document   : editnote
    Created on : Sep 27, 2022, 2:32:52 PM
    Author     : Sharon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>editNote</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            Title: <input type="text" name="title" value="${note.title}"><br>
            Content: <textarea name="content"  rows="10" cols="25">${note.content}</textarea><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
