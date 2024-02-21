import java.io.*;

class DispEven{
	private static int num;
	public static void evenNum(int n){
		
		System.out.println("Even num up to "+n+":");
		for(int i=0;i<=n;i+=2){
			System.out.print(i + " ");
		}	
		System.out.println();	
	}
	
	public static void main(String args[]){
		try{            
			BufferedReader display = new BufferedReader(new InputStreamReader(System.in));
			String name;
			System.out.println("Enter Your name:");
            		name = display.readLine();
            		System.out.println("Hello, " + name + "!");
			System.out.println("Enter the value of 'n':");
			num = Integer.parseInt(display.readLine());
			evenNum(num);		
		}catch(Exception e){
			System.out.println("Error : "+e);
		}
	}
}