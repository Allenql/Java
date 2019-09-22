


//4.求1到100的和，但是跳过能被3整除的数

public class p4 {
	public static void main(String[] args) {
		
		int n = 0;
		for(int a = 1; a<=100; a++){
			if(a%3 == 0){
				continue;
			}
			n+=a;
		}
		System.out.println(n);
	}
}
