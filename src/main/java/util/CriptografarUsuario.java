package util;

import java.security.MessageDigest;
import entity.Usuario;

public class CriptografarUsuario {

	public void criptografarSenha(Usuario u) throws Exception {

		MessageDigest md = MessageDigest.getInstance("MD5");

		md.update(u.getSenha().getBytes());
		byte[] hash = md.digest();
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			if ((0xff & hash[i]) < 0x10)
				hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
			else
				hexString.append(Integer.toHexString(0xFF & hash[i]));
		}
		String criptografado = hexString.toString();
		u.setSenha(criptografado);
	}
}
