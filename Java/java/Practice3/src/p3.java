import java.util.Scanner;

			/*3.输入一个月份，判断该月份所属的季节，3,4,5春季
			  6,7,8夏季 9,10,11秋季,12,1,2冬季*/
public class p3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("输入月份");
		int month = s.nextInt();
		if(month>=3 && month<6){
			System.out.println("春季");
		}else if(month>=6 && month<9){
			System.out.println("夏季");
		}else if(month>=9 && month<12){
			System.out.println("秋季");
		}else if(month==12 || month==1 || month==2){
			System.out.println("冬季");
		}else{
			System.out.println("请输入有效月份");
		}
	}

}
