package demo2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//客户端
		
		Socket s = new Socket("127.0.0.1",7777);
		
//		FileInputStream in = new FileInputStream("F:\\demo.txt");
//		BufferedInputStream br = new BufferedInputStream(in);
		OutputStream out = s.getOutputStream();
		PrintWriter pw = new PrintWriter(out);
		FileReader fr = new FileReader("F:\\demo.txt");
		BufferedReader br =new BufferedReader(fr);
		System.out.println(br.readLine());
//		int b= 0 ;
		
	    while(null != br.readLine()){
	    	pw.write(br.readLine());
	    	
	    }
		
	}

}
