//10.使用for循环编写程序输出九九乘法口诀表。
//1*1=1
//1*2=2 2*2=4
//1*3=3 2*3=6 3*3=9
public class p10 {
	public static void main(String[] args) {
		
		
		for(int x = 1; x<=9; x++){
			for(int y = 1; y<=x; y++){
				System.out.print(y+"*"+x+"="+y*x+",");
			}
			System.out.println();
		}
		
	}

}
