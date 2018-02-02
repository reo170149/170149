import java.io.*;
import java.net.*;
import java.util.*;

class MyServer01{
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		ServerSocket servsock = null;
		Socket sock;
		OutputStream out;
		InputStream in;
		
		int i;
		Date d;

		try{
			servsock = new ServerSocket(6000,300);
			
			while(true){
				sock = servsock.accept();

				d = new Date();

				
				out = sock.getOutputStream();

				out.write('\n');
				sock.close();
			}
		}
		catch (IOException e){
			System.exit(1);
		}
	}
}