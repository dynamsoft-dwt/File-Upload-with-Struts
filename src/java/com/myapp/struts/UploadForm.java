package com.myapp.struts;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;
 
public class UploadForm extends ActionForm{
 
	private FormFile file, file2;
 
	public FormFile getFile() {
		return file;
	}
 
	public void setFile(FormFile file) {
		this.file = file;
	}
        
        public FormFile getFile2() {
		return file2;
	}
 
	public void setFile2(FormFile file) {
		this.file2 = file;
	}
}
