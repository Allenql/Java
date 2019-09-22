//9.水仙花数是指一个 3 位数，它的每个位上的数字的3次幂之和等于它本身。
// （例如：1^3 + 5^3 + 3^3 = 153）。编程求出1-1000以内的水仙花数。
public class p9 {
	public static void main(String[] args) {
		
		for(int a = 100; a<1000; a++){
			int z = a%10;
			int y = (a%100-z)/10;
			int x = (a-y-z)/100;
			if(a==x*x*x+y*y*y+z*z*z){
				System.out.println(a);
			}
			
			
			
		}
	}

}
