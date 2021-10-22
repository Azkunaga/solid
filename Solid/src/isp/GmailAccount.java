package isp;

public class GmailAccount implements IEmail {
	String name, emailAddress;

	@Override
	public void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}
}
