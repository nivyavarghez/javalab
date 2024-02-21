import java.io.*;
import java.net.*;

class Clientside{
	public static void main(String args[]){

		Socket cs;
		DataInputStream sin;
		DataOutputStream sout;

		try{
			cs = new Socket("Localhost",1234);
			sin = new DataInputStream(cs.getInputStream());
			sout = new DataOutputStream(cs.getOutputStream());
			
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

			String ServerMessage;
			do {
                		ServerMessage = sin.readUTF();
                		System.out.println("Server Says: " + ServerMessage);
                		if (!ServerMessage.equalsIgnoreCase("Bye")) {
                    		System.out.print("Client: ");
                    		String response = userInput.readLine();
                    		sout.writeUTF(response);
                		}
            		} while (!ServerMessage.equalsIgnoreCase("Bye"));

		}catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}
