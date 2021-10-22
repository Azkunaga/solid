package main;

import isp.EmailSender;
import isp.GmailAccount;
import lsk.Project;
import lsk.ProjectFile;
import lsk.ReadOnlyProjectFile;

public class Main {

	public static void main(String[] args) {

		// ------------ISP-----------------------
		GmailAccount gmail = new GmailAccount();
		gmail.setEmailAddress("cuentaGmail@gmail.com");
		EmailSender.sendEmail(gmail, "hola");
		// --------------------------------------

		// ------------LSK-----------------------
		Project a= new Project();
		ProjectFile file1= new ProjectFile("file1");
		ReadOnlyProjectFile file2= new ReadOnlyProjectFile("file2");
		a.addLoadableProject(file1);
		a.addLoadableProject(file2);
		a.addStorableProject(file1);
		a.loadAllFiles();
		a.storeAllFiles();
		// --------------------------------------
		
		
		
	}

}
