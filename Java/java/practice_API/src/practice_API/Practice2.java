package practice_API;

import java.util.Arrays;

/*
 * String s = "name=zhangsan age=18 No=90728"

		请输出为
		姓名:zhangsan
		年龄:18
		学号:90728
 */
public class Practice2 {
	
	public static void main(String[] args) {
		
		String s = "name=zhangsan age=18 No=90728";
		
		String [] s1 = s.split(" ");
		
		
		for(int num = 0; num<s1.length; num++){
			
			int i = s1[num].indexOf("=");
			
			String s2 = s1[num].substring(i);

			
			if(s1[num].substring(0, i).equals("name")){
				System.out.println("姓名"+s2.replace("=", ":"));
			}else if(s1[num].substring(0, i).equals("age")){
				System.out.println("年龄"+s2.replace("=", ":"));
			}else{
				System.out.println("学号"+s2.replace("=", ":"));
			}
			
		}
		
		
		
		
	}

}
