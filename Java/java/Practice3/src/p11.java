					//11.打印下面形状
					//    *
					//   **
					//  ***
					// ****
					//*****
public class p11 {
	public static void main(String[] args) {
		
		for(int x = 1; x<=5; x++){
			for(int y = 1; y<=5; y++){
				if(y<(6-x)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
