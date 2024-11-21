package dao;

public class User {
	private String accoount;
	private String pwd;
	private String mail;
	public User(String accoount, String pwd, String mail) {
		super();
		this.accoount = accoount;
		this.pwd = pwd;
		this.mail = mail;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getAccoount() {
		return accoount;
	}
	public void setAccoount(String accoount) {
		this.accoount = accoount;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
