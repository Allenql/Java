//	定义一个Student类，
//	属性有学号，姓名，年龄，性别，语文成绩，数学成绩，英语成绩，
//	方法有:学习(打印输出学习即可)，考试，
//	创建两个学生对象，并给属性赋值和调用方法


public class Student {
	
	String name;
	int age;
	String sex;
	int chineseGrade;
	int mathGrade;
	int englishGrade;
	
	public void study(){
		System.out.println("学习");
	}
	public void exam(){
		
		System.out.println("考试");
	}

}
