package practice_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 写一个方法,将一个文件分割为每份1MB大小的若干份,存储在一个temp的文件夹中,
        然后再写一个方法,将这若干份合并为一个文件.
 */
public class Method_Merge {
	public static void main(String[] args) {
		
		
	}
	public static void method(String fileName){
		FileInputStream in = null;
		FileOutputStream out = null;
		int i = 1;
		File f = new File("F:\\temp\\"+i+fileName);
		try {
			in = new FileInputStream(f);
			out = new FileOutputStream("F:\\"+fileName);
			int length = 0;
			int count = 0;
			byte[] b = new byte[1024];
			while((length=in.read(b))!=-1){
				count++;
				out.write(b, 0, length);
				if(count%length==0){
					i++;
					in = new FileInputStream("F:\\temp\\"+i+fileName);
				}
			}
//			f.delete();
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
		}
	}

}
