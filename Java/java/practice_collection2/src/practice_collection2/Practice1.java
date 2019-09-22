package practice_collection2;

import java.util.ArrayList;
import java.util.Random;

/*
 * 1.	模仿双色球摇奖
		红色球号码从1—33中选择  6个
		蓝色球号码从1—16中选择 1个

 */
public class Practice1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> red = new ArrayList<Integer>();
		ArrayList<Integer> blue = new ArrayList<Integer>();
		Random r = new Random();
		ArrayList<Integer> red1 = new ArrayList<Integer>();

		for(int i = 1 ; i<=33; i++){
			red.add(i);
		}
		for(int i = 1 ; i<=16; i++){
			blue.add(i);
		}
		
		for(int i = 1; i<=6; i++){
			int j = r.nextInt(red.size());
			red1.add(red.get(j));
			red.remove(j);
		}
		
		System.out.print(red1);
		System.out.println(blue.get(r.nextInt(16)));
	}

}
