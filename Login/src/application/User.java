package application;

public class User {
	private String name;
	private String pass;

	public User(String name, String pass) throws Exception {
		this.name = name;
		Encriptador enc = new Encriptador();
		this.pass = enc.encriptar(pass);
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
} 