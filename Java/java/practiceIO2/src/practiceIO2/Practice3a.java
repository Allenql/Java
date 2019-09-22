package practiceIO2;
/*
 * 3.创建两个线程输出1-100之间的数字,要求一个打印奇数,一个打印偶数
 */
public class Practice3a extends Thread {

	@Override
	public void run() {
		for(int i = 1; i<=100; i++){
			if(i%2 != 0){
				System.out.println("奇数线程:"+i);
			}
		}
		
	}
	
	
	
	
	
	
}
