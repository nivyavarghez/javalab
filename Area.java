import java.io.*;
class Area 
{
	static void calculateArea(){
			DataInputStream  value = new DataInputStream(System.in);
	try {
            System.out.print("Enter the radius of the circle: ");
            int radius = Integer.parseInt(value.readLine());

            
            double area = Math.PI * radius * radius;

            System.out.println("The area of the circle with radius " + radius + " is: " + area);
       	 } 
	
	catch (Exception e) {
            System.out.println("Error: " + e);
        }
			
	}
	public static void main(String args[])
	{
		DataInputStream  value = new DataInputStream(System.in);
		int r;
		String name;
 		try
		{
			System.out.println("Enter Your name:");
	    		name = value.readLine();
  	   		System.out.println("Hello, " + name + "!");
			
			calculateArea();
			
		}
		catch (Exception e) {
           	 System.out.println("Error: " + e);
        	}
	}
}		