import java.util.Scanner;

	/*
	 * 
	 * 1.使用Scanner收集你的身高体重，并计算出你的BMI值是多少
  			BMI的计算公式是 体重(kg) / (身高*身高)
			  比如张三的体重是72kg, 身高是1.69，那么这位同学的BMI就是
			  72 / (1.69*1.69) = ?
		BMI标准:
	   BMI<18.5      体重过轻
	   18.5<=BMI<24  正常范围
	   24<=BMI<27     体重过重
	   27<=BMI<30     轻度肥胖
	   30<=BMI<35     中度肥胖
	   35<=BMI        重度肥胖
	 */


public class p1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入身高");
		long height = s.nextLong();
		System.out.println("请输入体重");
		int weight = s.nextInt();
		double bmi =weight/(height*height*0.0001);
		System.out.println("BMI为："+bmi);
		if(bmi<18.5){
			System.out.println("体重过轻");
		}else if(bmi>=18.5 && bmi<24){
			System.out.println("正常范围");
		}else if(bmi>=24 && bmi<27){
			System.out.println("体重过重");
		}else if(bmi>=27 && bmi<30){
			System.out.println("轻度肥胖");
		}else if(bmi>=30 && bmi<35){
			System.out.println("中度肥胖");
		}else{
			System.out.println("重度肥胖");
		}
	}

}
