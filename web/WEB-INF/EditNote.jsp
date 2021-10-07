<%-- 
    Document   : EditNote
    Created on : 6-Oct-2021, 4:24:55 PM
    Author     : Daniel Wong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note JSP</title>
    </head>
    <body>
        <form method="POST" action="note">
            <div>
            <h1>Simple Note Keeper</h1>
        </div>
        <div>
            <h3>Edit Note</h3>
        </div>
        <div>
            <label>Title:</label>
            <input name="title" type="text" value="${Note.title}">
        </div>
        <div> 
            <label>Content:</label>
            <textarea name="content">${Note.content}</textarea>
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
        </form>
    </body>
</html>
