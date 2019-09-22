package practice_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 模仿剪切功能,将一个文件从一个目录 读写到另一个目录后 将原来文件删除
 */
public class Practice1 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		File f = new File("F:\\demo.txt");
		try {
			in = new FileInputStream(f);
			out = new FileOutputStream("G:\\demo.txt");
			int i = 0;
			while((i=in.read())!=-1){
				out.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out!=null){
				try {
					out.flush();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			f.delete();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
