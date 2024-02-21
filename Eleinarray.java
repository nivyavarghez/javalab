import java.io.*;

class Eleinarray {
    public static void main(String args[]) {
        int i, searchele,name;
        DataInputStream value = new DataInputStream(System.in);

        try {
	   	System.out.println("Enter Your name:");
		name = value.readLine();
		System.out.println("Hello, " + name + "!");
            	System.out.println("Enter your size:");
            	int n = Integer.parseInt(value.readLine());

           	 int arr[] = new int[n];

            	for (i = 0; i < n; i++) {
                	System.out.println("Enter the element at index " + i + ":");
                	arr[i] = Integer.parseInt(value.readLine());
           	 }

            System.out.println("Enter the element to be searched: ");
            searchele = Integer.parseInt(value.readLine());

            boolean flag = false;
            for (i = 0; i < n; i++) {
                if (arr[i] == searchele) {
                    System.out.println("Element " + searchele + " found at index " + i);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("Element " + searchele + " not found in the array.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
