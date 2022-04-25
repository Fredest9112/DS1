package application;

import java.security.MessageDigest;
import java.math.*;

public class Encriptador {
	public Encriptador() {

	}
	public String encriptar(String input) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] messageD = md.digest(input.getBytes());
		BigInteger bi = new BigInteger(1, messageD);
		return bi.toString(16);
	}
} 