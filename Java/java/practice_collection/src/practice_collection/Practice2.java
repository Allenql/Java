package practice_collection;

import java.util.ArrayList;
/*
 * 
	模拟登录  创建一个用户类(User)用户名(userName)密码(passWord)  在集合中初始化5个用户信息
	输入用户名和密码进行登录 成功提示  不成功提示用户名或密码错误
 */
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList();
		
		User u1 = new User("jim", 111);
		User u2 = new User("tom", 222);
		User u3 = new User("dog", 333);
		
		alist.add(u1);
		alist.add(u2);
		alist.add(u3);
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入账户名");
		String name = s.next();
		
		int count = 0;
		for(int i = 0; i<alist.size(); i++){
			String userName = ((User)alist.get(i)).getUserName();
			int passWord = ((User)alist.get(i)).getPassWord();
			
			if(userName.equals(name)){
				System.out.println("请输入密码");
				int pswd = s.nextInt();
				if(pswd == passWord){
					System.out.println("欢迎进入");
				}else{
					System.out.println("密码错误");
				}
			}else{
				if(++count == alist.size()){
					System.out.println("账户不存在");
				}
			}
			
		}
		
	}
}
