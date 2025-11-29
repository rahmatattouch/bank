package Project;

public class Admin {
	enum Activite{
		Active,
		Inactive
	}
	
	private Activite activ;
	private static int Admin_ID = 96878;
	private String Password;
	private String User;
	
	
	public Admin(String user,String pass) {
		Admin_ID++;
		this.User= user;
		this.Password = pass;
		System.out.println("Admin cree    ID: " + Admin_ID + "    Username: " + User + "    Mot de pass: " + Password);
	}
	
	
	public Activite getActiv() {
		return activ;
	}

	public void setActiv(Activite activ) {
		this.activ = activ;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public int getID() {
		return Admin_ID;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	

}
