package application;

public class Login {
	private Almacen almacen;

	public Login(Almacen almacen){
		this.almacen = almacen;
	}
	public boolean validar(String name, String pass) throws Exception {
		String password = almacen.getUserPass(name);
		if(password != null) {
			Encriptador enc = new Encriptador();  
			String myPass = enc.encriptar(pass);
			return password.equals(myPass);
		}
		return false;   
	}
} 