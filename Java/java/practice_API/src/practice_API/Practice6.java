package practice_API;

import java.util.Scanner;

/*
 * 写一个方法用于获取文件后缀名,方法有一个String类型的参数,用于接收文件名,在方法中将文件后缀名截取出来,
  再定义一个String类型的返回值,用于将后缀名返回.
 "demo.jpg"  png gif  bmp
 */
public class Practice6 {
	public static void main(String[] args) {
		
//		Scanner sca = new Scanner(System.in);
//		System.out.println("输入文件名");
		String s = "demo.peng";
		
		System.out.println(Practice6.test(s));
		
		
		
		
	}
	public static String test(String s){
		
		return s.substring(s.indexOf(".")+1);
		
	}

}
