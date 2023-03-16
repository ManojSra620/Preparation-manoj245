package Com_framework;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;

public class Encode_Decode 
{
	@Test
	public void en_de()
	{
		String s="MaNOJS*123";
		Base64 b=new Base64();
		byte[] by=b.encodeBase64(s.getBytes());
		
		// cant we encode and convert string instead of byte
	/*	
		int[] i=new int[9];
		i[0]=2;
		i[2]=3;
		System.out.println(i[0]);
		*/
		/*
		 * [B@49d3c823
encoded value is: TWFOT0pTQDEyMw==
[B@436bc36
decode value is: MaNOJS@123
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println(by);
		System.out.println("encoded value is: "+ new String(by));
		
		
		byte[] dec=b.decodeBase64(by);
		System.out.println(dec);
		//String m=
		System.out.println("decode value is: "+new String(dec));
	}

}
