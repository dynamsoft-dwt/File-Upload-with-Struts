<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <h1>File Uploaded! Congratulations</h1>
	<a href="upload/<%= request.getAttribute("uploadedFileName") %>">
        Download <%= request.getAttribute("uploadedFileName") %></a><br>
        <a href="upload/<%= request.getAttribute("uploadedFileName2") %>">
        Download <%= request.getAttribute("uploadedFileName2") %></a>
    </body>
</html>
