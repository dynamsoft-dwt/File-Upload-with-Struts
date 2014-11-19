package com.myapp.struts;

import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

public class UploadAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        UploadForm fileUploadForm = (UploadForm) form;
        FormFile file = fileUploadForm.getFile();
        FormFile file2 = fileUploadForm.getFile2();

        String filePath
                = getServlet().getServletContext().getRealPath("/") + "/upload";

        File folder = new File(filePath);
        if (!folder.exists()) {
            folder.mkdir();
        }

        String fileName = file.getFileName();

        if (!("").equals(fileName)) {
            File newFile = new File(filePath, fileName);

            if (!newFile.exists()) {
                FileOutputStream fos = new FileOutputStream(newFile);
                fos.write(file.getFileData());
                fos.flush();
                fos.close();
            }
	    request.setAttribute("uploadedFileName",newFile.getName());
        }
        
        fileName = file2.getFileName();

        if (!("").equals(fileName)) {
            File newFile = new File(filePath, fileName);

            if (!newFile.exists()) {
                FileOutputStream fos = new FileOutputStream(newFile);
                fos.write(file2.getFileData());
                fos.flush();
                fos.close();
            }
	    request.setAttribute("uploadedFileName2",newFile.getName());
        }

        return mapping.findForward("success");
    }
}
