package Com_framework;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class encrypt_decrypt 
{
	static String encrypt(String password, String key)
	{
		StandardPBEStringEncryptor en=new StandardPBEStringEncryptor();
		en.setPassword(password);
		String encpwd=en.encrypt(key);
		return encpwd;
		
	}
	
	 static String decrypt(String password, String encrypted)
	{
		 StandardPBEStringEncryptor de=new StandardPBEStringEncryptor();
		 de.setPassword(password);
		 String decrypted=de.decrypt(encrypted);
		 return decrypted;
		
	}
	 
	 
	 static String decryptstring(String pwd)
	 {
		String d= decrypt("password", pwd);
		return d;
	 }
	 public static void main(String[] args) 
	 {
		 System.out.println("encrypted is: ----- "+encrypt("password", "Test1234!"));   
// tyRSdCPeQPQJCljDZsFNqDfaT40wgMHb    RA7Z866PV1ubo4kpBcD8MwPFV2Ml7ZaL   n9JjLA4Pg+AwaFEqG4JBVjVK5KF+1j+W  lTLg5mpOmzYRd6fDK56kWxV4Y0ATmnru  pNXEdGNHwZcoybYkM3YWgxGbmshnLcEl
System.out.println("decrypted is:------------ "+decryptstring(encrypt("password", "Test1234!")));

/*
 * encrypted is: ----- Vfo9CUpMY5rD26DELF/hPqmq8cLuw/TJ
decrypted is:------------ Test1234! 
 * 
 */
		
	}

}
