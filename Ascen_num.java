import java.io.*;

class Ascen_num
{
	public static void main(String args[])
	{
		int i,j,n,temp;
		String name;
		int arr[];
		DataInputStream value = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter Your name:");
			name = value.readLine();
			System.out.println("Hello, " + name + "!");
            		System.out.println("Enter your size:");
            	 	n = Integer.parseInt(value.readLine());
			
			arr = new int[n];
			for (i = 0; i < n; i++) 
			{
                		System.out.println("Enter the element at index " + i + ":");
                		arr[i] = Integer.parseInt(value.readLine());
           	 	}
			
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(arr[i]<arr[j]){
						temp  = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}

			System.out.println("Array in ascending order:");
			for (i = 0; i < n; i++) 
			{
                		System.out.println(arr[i] + " ");
                		
           	 	}

		}
		catch(Exception e){
				System.out.println("Error: " +e);
		}	
	}
}