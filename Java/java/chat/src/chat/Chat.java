package chat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Chat {
	
	public Boolean test(String ip) throws UnknownHostException, IOException{
		
		Socket s = new Socket(ip,8888);
		OutputStream out = s.getOutputStream();
		out.write("aaaas".getBytes("utf-8"));
		
		return null;
	}

}
