package demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//客户端
		
		Socket s = new Socket("192.168.0.112",7777);
		
		OutputStream out = s.getOutputStream();
		
		out.write("你好服务器".getBytes("utf-8"));
		
	}

}
