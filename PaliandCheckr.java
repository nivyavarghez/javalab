//Write a Java program to check whether a string is palindrome or not. 
import java.util.Scanner;

public class PaliandCheckr{
	public static void main(String args[]){
		Scanner check = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String in = check.nextLine();

		if(isPaian(in)){
			System.out.println("The string is paliandrome");
		}else{
			System.out.println("The string is not paliandrome");
		}

	}
	private static boolean isPaian(String args[]){
		str = str.replaceAll("\\s","").toLowerCase();
		int len = str.length();
		if(int i = 0; i<len/2; i++){
			if(str.charAt(i)!= str.chatAt(length -1 -i)){
				return false
			}
		}
		return true;
	}
}