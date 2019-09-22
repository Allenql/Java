package practice_API;

import java.util.Arrays;

/*
 * 把一个字符串的首字母转成大写，其余为小写。hello world
 */
public class Practice3 {
	
	public static void main(String[] args) {
		
		String s = "hello world";
		String [] s1 = s.split(" ");
		
//		System.out.println(Arrays.toString(s1));
//		System.out.println(s1[0]);
		
		
		for(int i = 0; i<s1.length; i++){
			
			String s2 = s1[i].substring(0, 1);
			System.out.print(s1[i].replace(s2, s2.toUpperCase()));
			System.out.print(" ");
		}
	}

}
