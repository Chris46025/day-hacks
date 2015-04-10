package Encryption;

public class Decrypt extends Encrypt{
	private String Decryption(String x){
		String y = "";
		
		for(int i = 0; i < x.length(); i++){
			String temp = "" + x.charAt(i);
			char changed = letterChange(-1, temp);
			y = y + changed;
		}
		y = outsideIn(y);
		y = reverse(y);
		
		return y;
	}
	
	private String DecryptionID(int id, String x){
		String y = "";
		
		for(int i = 0; i < x.length(); i++){
			String temp = "" + x.charAt(i);
			char changed = letterChange(-id, temp);
			y = y + changed;
		}
		y = outsideIn(y);
		y = reverse(y);
		
		return y;
	}
	
	private static String outsideIn(String x){
		String outsideIn = "";
		int count = 0;
		
		if(x.length() % 2 == 0){
			for(int i = 0; i < x.length()/2; i++){
					outsideIn = outsideIn + x.charAt((x.length()-1 - count));
					count += 2;
			}
			count = 0;
			for(int i = 0; i < x.length()/2; i++){
				outsideIn = outsideIn + x.charAt(count);
				count += 2;
			}
		}
		else{
			outsideIn = outsideIn + x.charAt(x.length()-1);
			for(int i = 0; i < x.length()/2; i++){
				outsideIn = outsideIn + x.charAt(((x.length()-2) - count));
				count += 2;
			}
			count = 0;
			for(int i = 0; i < x.length()/2; i++){
				outsideIn = outsideIn + x.charAt(count);
				count += 2;
			}
		}
		return outsideIn;
	}	
}
