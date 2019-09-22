import java.util.Scanner;

				/*2.判断某一年是否为闰年
				通过Scanner 输入一个年份，然后判断概念是否是闰年
				闰年判断标准(满足任何一个)
				1. 如果能够被4整除，但是不能被100整除
				2. 能够被400整除*/
public class p2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("输入查询年份：");
		int year = s.nextInt();
		if(year%4==0 && year%100!=0 ||year%400==0){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}

}
