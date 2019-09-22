

//8.输出1--100之间的质数(只能被1和本身整除的数)
public class p8 {
	public static void main(String[] args) {
		
		for(int a = 2; a<=100; a++){
			int num = 0;
			for(int n = 2; n<a; n++){
				if(a%n == 0){
					num++;
				}
			}
			if(num==0){
				System.out.println(a);
			}
		}
		
	}

}
