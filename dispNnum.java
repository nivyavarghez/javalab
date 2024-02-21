import java.io.*;

class dispNnum
{
	public static void main(String args[])
	{
		DataInputStream value = new DataInputStream(System.in);
		int m,n;
		String name; 
		try
		{	
			System.out.println("Enter Your name:");
	    		name = value.readLine();
  			System.out.println("Hello, " + name + "!");

		 	System.out.println("Enter your starting num(m):");
			m = Integer.parseInt(value.readLine());

			System.out.println("Enter your Last num(n):");
			n = Integer.parseInt(value.readLine());	

			System.out.println("Numbers from " + m + " to " + n + ":");
			
			while(m<=n)
			{
				System.out.print(m + " ");
				m++;	
			}
		
		}
		catch (Exception e) {
           		 System.out.println("Error: " + e);
        	}	
	}
}