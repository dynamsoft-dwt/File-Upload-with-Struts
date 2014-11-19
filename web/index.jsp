<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
    <head>
        <title>Struts Upload File</title>
    </head>
    <body>
        <html:form action="fileupload" method="post" enctype="multipart/form-data">
            <html:file property="file"/><br/>
            <html:file property="file2"/><br/>
            <html:submit>Upload</html:submit>
        </html:form>
    </body>
</html>