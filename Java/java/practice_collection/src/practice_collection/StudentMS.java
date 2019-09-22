package practice_collection;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 完成对学生信息的增 删 改 查操作
 */
public class StudentMS {
	 public static void main(String[] args) {
			System.out.println("欢迎使用XXX学生管理系统");
			ArrayList<Student> list= new ArrayList<Student>();
			while(true) {
				System.out.println("请选择相应的功能：1.增加学生信息 2.删除学生信息 3.修改学生信息 4.查询指定学生信息 5.查询所有学生信息 6.退出系统");
				//接收用户输入的数据
				Scanner sc = new Scanner(System.in);
				String choose = sc.next();
				switch (choose) {
				case "1":
					System.out.println("用户选择了增加学生信息");
					System.out.println("请输入学号");
					int num = sc.nextInt();
					System.out.println("请输入姓名");
					String name = sc.next();
					Student stu = new Student(num, name);
					list.add(stu);
					break;
				case "2":
					System.out.println("用户选择了删除学生信息");
					break;
				case "3":
					System.out.println("用户选择了修改学生信息");
					break;
				case "4":
					System.out.println("用户选择了查询指定学生信息");
				
					break;
				case "5":
					System.out.println("用户选择了查询所有学生信息");
					for(Student s : list){
						System.out.println(s);
					}
					break;
				case "6":
					System.out.println("用户选择退出系统");
					System.exit(0);
					return;
				default:
					System.out.println("您的输入有误，请选择1-6之间的数字");
					break;
				}
			}
		}

}
