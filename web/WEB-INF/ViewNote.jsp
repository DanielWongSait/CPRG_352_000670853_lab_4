<%-- 
    Document   : ViewNote
    Created on : 6-Oct-2021, 4:24:47 PM
    Author     : Daniel Wong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note JSP</title>
    </head>
    <body>
        <div>
            <h1>Simple Note Keeper</h1>
        </div>
        <div>
            <h3>View Note</h3>
        </div>
        <div>
            <strong>Title:</strong>${Note.title}
            
        </div>
            <br>
            
        <div>
            <strong>Content:</strong>
            <br>
            ${Note.content}
        </div>
        <br>
        <div>
            <a href="note?edit">Edit</a>
        </div>
    </body>
</html>
