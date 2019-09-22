package practiceIO2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1.模拟 注册，登录。
  模仿学生管理案例: 输入1 进入注册功能,输入2进入登录功能,输入3退出
                     当登录成功后终止循环
  用户信息:用户名(userName),密码(password)
（1）注册功能：输入自己的个人信息，保存到文件 
  例如:userName=admin,passWord=123
     userName=jim,passWord=123
（2）登录：输入自己的个人信息，把文件里的信息读到一个集合里，将输入信息与集合里的元素比较，如果相同，登录成功，否则，登录失败。
 */
public class Practice1 {
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\student.txt");
		f.createNewFile();
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		Scanner s = new Scanner(System.in);
		boolean b = false;
		while(true){
			System.out.println("输入1 进入注册功能,输入2进入登录功能,输入3退出");
			int x = s.nextInt();
			switch (x) {
			case 1:
				System.out.println("用户选择了注册学生信息");
				System.out.println("输入用户名");
				String userName = s.next();
				System.out.println("输入密码");
				int passWord = s.nextInt();
				try {
					fw = new FileWriter(f,true);
					bfw = new BufferedWriter(fw);
					bfw.write("userName="+userName+",passWord="+passWord);
					bfw.newLine();
					bfw.flush();
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					if(bfw!=null){
						bfw.close();
					}
				}
				break;
			case 2:
				System.out.println("用户选择了登录");
				System.out.println("输入用户名");
				String userName1 = s.next();
				System.out.println("输入密码");
				String passWord1 = s.next();
				fr = new FileReader(f);
				bfr = new BufferedReader(fr);
				ArrayList<String> al = new ArrayList<String>();
				String str = null;
				while((str=bfr.readLine())!=null){
					al.add(str);
				}
				int count = 0;
				for(int i = 0; i<al.size(); i++){
					if(userName1.equals(al.get(i).substring(al.get(i).indexOf("=")+1, al.get(i).indexOf(",")))){
						if(passWord1.equals(al.get(i).substring(al.get(i).lastIndexOf("=")+1))){
							System.out.println("欢迎进入XXX");
							b = true;
							break;
						}else{
							System.out.println("密码错误");
						}
					}else{
						count++;
					}
					if(count==al.size()){
						System.out.println("账户不存在");
					}
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}
			if(b){
				break;
			}
		}
	}
}
