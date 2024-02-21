import java.io.*;
import java.net.*;

class Serverside{
	public static void main(String args[]){
		ServerSocket ss;
		Socket as;
		DataInputStream sin;
		DataOutputStream sout;

		try{
			ss = new ServerSocket(1234);
			as = ss.accept();
			sin = new DataInputStream(as.getInputStream());
			sout = new DataOutputStream(as.getOutputStream());
			sout.writeUTF("welcome client");
			
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

			String clientMessage;
			
			 do {
                		clientMessage = sin.readUTF();
                		System.out.println("Client Says: " + clientMessage);
                		if (!clientMessage.equalsIgnoreCase("Bye")) {
                    		System.out.print("Server: ");
                    		String response = userInput.readLine();
                    		sout.writeUTF(response);
                		}
            		} while (!clientMessage.equalsIgnoreCase("Bye"));

		}catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}
