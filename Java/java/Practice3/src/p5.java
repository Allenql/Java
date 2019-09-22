//5.输出奇数100以内最大的5个奇数
public class p5 {
	public static void main(String[] args) {
		
		int n = 0;
		for(int a = 100; a>=0; a--){
			
			if(a%2 != 0){
				System.out.println(a); 
				
				n++;
				if(n==5){
					break;
				}
			}
		}
	}
}
