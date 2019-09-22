import java.util.Scanner;

//7.猜数字游戏,在程序中设定一个值(例如50),让用户输入一个数,程序给予提示 大了或小了,直到用户输入的值与设定值一致,
//提示:猜对了,结束猜数字游戏,记录总共猜了多少次.   (也可以考虑只能猜10次,10次之内没有猜到结束游戏)


public class p7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			System.out.println("请猜数字");
			int a = 0;
			while(true){
				int num = s.nextInt();
				if(num==50){
					System.out.println("恭喜你猜对啦");
					break;
				}else if(num>50){
					System.out.println("猜错了，大了");
					a++;
				}else{
					System.out.println("猜错了，小了");
					a++;
				}
				if(a==10){
					System.out.println("十次机会已经用完，游戏结束");
					break;
				}
				
			}
		
	}

}
