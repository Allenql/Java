import java.util.Random;

/*
 * 得到一个25-100之间的随机数
 */
public class Practice4 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt(75)+25;
		System.out.println(num);
		
		
		
	}

}
