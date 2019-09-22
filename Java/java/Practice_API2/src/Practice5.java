import java.util.Random;
import java.util.Scanner;

/*
 * 出拳游戏:1表示石头,2表示剪刀,3表示布
        接收用户输入的拳  并输出 ,然后电脑随机产生一个数 对比输赢
 */
public class Practice5 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("请出拳");
			int i = s.nextInt();  //出拳
			if(i == 1){
				System.out.println("你是石头");
			}else if(i == 2){
				System.out.println("你是剪刀");
			}else{
				System.out.println("你是布");
			}
			Random r = new Random();
			int num = r.nextInt(3)+1;  //电脑随机出拳
			if(num == 1){
				System.out.println("电脑是石头");
			}else if(num == 2){
				System.out.println("电脑是剪刀");
			}else{
				System.out.println("电脑是布");
			}
			if(i<1 || i>3){
				System.out.println("请输入有效数字");
			}else{
				if(i == num){
					System.out.println("和局");
				}else if(i == 1&&num == 2 || i == 2&&num == 3 || i == 3&&num == 1){
					System.out.println("你赢了");
				}else{
					System.out.println("你输了");
				}
			}
		}
		
		
		
	}

}
