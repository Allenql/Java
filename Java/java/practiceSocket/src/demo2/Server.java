package demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		System.out.println(in.read());
		
		//FileInputStream in = new FileInputStream("F:\\demo.txt");
		//FileOutputStream out = new FileOutputStream("F:\\demo.txt");
		
	}
	
}
