import java.io.*;
import java.util.*;
import java.sql.*;

class Login {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("1.Login \n  If you don't have account then \n 2.Register \n Choose your Option:");
	
	int choose = s.nextInt();
	s.nextLine();
	
		switch (choose) {
            	case 1:
                	login();
                	break;
            	case 2:
                	register();
                	break;
            	default:
                	System.out.println("Invalid option.");
        	}
	}

	public static void login(){
    try{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter UserName:");
        String username = s.nextLine().trim(); // Trim the input
        System.out.print("Enter Password:");
        String password = s.nextLine().trim(); // Trim the input
        
        Connection con;
        Statement st;
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver"); 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8", "root", ""); 
        st = con.createStatement();
        String str = "SELECT * FROM emp WHERE username = '" + username + "' AND password = '" + password + "'";
		// System.out.println(str);
        rs = st.executeQuery(str);
        if (rs.next()) {
            System.out.println("Login successfully");
        } else {
            System.out.println("Invalid user..!");
        }
        rs.close();
        st.close();
        con.close();
    }catch(Exception e){
        System.out.println("Error: "+e);
    }
}


	public static void register(){
		try{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter UserName:");
            		String username = scan.nextLine();
            		System.out.print("Enter Password:");
            		String password = scan.nextLine();

			Connection con;
			Statement st;
			
			Class.forName("com.mysql.jdbc.Driver"); 
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8", "root", ""); 
            		st = con.createStatement();
			String ins = "INSERT INTO emp(username,password) values('" + username +"', '" + password.trim() + "')";
			int rows= st.executeUpdate(ins);
			if(rows>0){
				System.out.println("Registration Successful");
			}else{
				System.out.println("Registration Failed");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}



        
