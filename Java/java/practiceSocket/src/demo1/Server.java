package demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//服务器
		ServerSocket ss = new ServerSocket(7777);
		Socket s = ss.accept();
		
		InputStream in = s.getInputStream();
		
		byte[] b = new byte[100];
		int length = in.read(b);
		String message = new String(b,0,length,"utf-8");
		System.out.println(message);
		
	}
	
}
