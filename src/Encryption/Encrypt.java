package Encryption;

public class Encrypt {
	/**
	 * Encrypts a string with a base ID of 1
	 * @param x - A String to be Encrypted
	 * @return - The encrypted version of a string
	 */
	private String Encryption(String x){
		String y = "";
		String tempY = x;
		tempY = reverse(tempY);
		tempY = insideOut(tempY);
		
		for(int i = 0; i < x.length(); i++){
			String temp = "" + tempY.charAt(i);
			char changed = letterChange(1, temp);
			y = y + changed;
		}
		return y;
	}
	/**
	 * Encrypts a string with an ID indicating the letter change
	 * @param x - A String to be Encrypted
	 * @return - The encrypted version of a string
	 */
	private String EncryptionID(int id, String x){
		String y = "";
		String tempY = x;
		tempY = reverse(tempY);
		tempY = insideOut(tempY);
		id = id % 5;
		
		for(int i = 0; i < x.length(); i++){
			String temp = "" + tempY.charAt(i);
			char changed = letterChange(id, temp);
			y = y + changed;
		}
		return y;
	}
	/**
	 * Takes a String and reverses the order completely
	 * @param x - A String variable that will be reversed
	 * @return - A String variable that is the complete reverse of the given String
	 */
	public static String reverse(String x){
		String reversed = "";
		for(int i = 0; i < x.length(); i++){
			reversed = reversed + x.charAt(x.length()-(i+1)); 
		}
		return reversed;
	}
	/**
	 * Takes a String and starts from the inside and gives a inside out version of the String
	 * @param x - A String variable that will be inside out
	 * @return - A String variable that is an inside out version of the given String
	 */
	public static String insideOut(String x){
		String insideOut = "";
		int count = 0;
		
		if(x.length() % 2 == 0){
			for(int i = 0; i < x.length(); i++){
				if(i % 2 == 0)
					insideOut = insideOut + x.charAt((x.length()/2) + count); 
				else{
					count ++;
					insideOut = insideOut + x.charAt((x.length()/2) - count);
				}
			}
		}
		else{
			for(int i = 0; i < x.length()-1; i++){
				if(i % 2 == 0)
					insideOut = insideOut + x.charAt((x.length()/2 + 1) + count); 
				else{
					count ++;
					insideOut = insideOut + x.charAt((x.length()/2 + 1) - count);
				}
			}
			insideOut = insideOut + x.charAt(0);
		}
		return insideOut;
	}
	/**
	 * Takes a String letter and returns the character of the ASCII value of that String a specified number of values away based on the given ID
	 * @param id - The value of the ASCII character the String will be changed by
	 * @param letter - The letter to be changed
	 * @return A letter that 
	 */
	protected static char letterChange(int id, String letter){
		int ascii = (int) letter.charAt(0) + id;
		return (char)ascii;
	}
}
