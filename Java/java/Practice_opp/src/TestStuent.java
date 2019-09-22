//	定义一个Student类，
//	属性有学号，姓名，年龄，性别，语文成绩，数学成绩，英语成绩，
//	方法有:学习(打印输出学习即可)，考试，
//	创建两个学生对象，并给属性赋值和调用方法
public class TestStuent {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "Tim";
		s.age = 20;
		s.sex = "男";
		s.chineseGrade = 100;
		s.mathGrade = 99;
		s.englishGrade = 98;
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.chineseGrade);
		System.out.println(s.mathGrade);
		System.out.println(s.englishGrade);
		s.study();
		s.exam();
		
		System.out.println("===================");
		
		s.name = "MIMI";
		s.age = 22;
		s.sex = "女";
		s.chineseGrade = 80;
		s.mathGrade = 90;
		s.englishGrade = 85;
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.chineseGrade);
		System.out.println(s.mathGrade);
		System.out.println(s.englishGrade);
		s.study();
		s.exam();
		
	}

}
