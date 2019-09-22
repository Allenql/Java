package practice_collection;

import java.util.ArrayList;
import java.util.Random;

/*
 * 已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组,每组4只球队。采用List集合和随机数
 2008 北京奥运会男足参赛国家： 
     科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
 */
public class Practice3 {

	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList();
		alist.add("科特迪瓦");
		alist.add("阿根廷");
		alist.add("澳大利亚");
		alist.add("塞尔维亚");
		alist.add("荷兰");
		alist.add("尼日利亚");
		alist.add("日本");
		alist.add("美国");
		alist.add("中国");
		alist.add("新西 兰");
		alist.add("巴西");
		alist.add("比利时");
		alist.add("韩国");
		alist.add("喀麦隆");
		alist.add("洪都拉斯");
		alist.add("意大利");
//		System.out.println(alist);
		Random r = new Random();
		
		ArrayList alist1 = new ArrayList();
		for(int i = 0; i<4; i++){
			alist1.add(alist.get(r.nextInt(alist.size())));
			alist.removeAll(alist1);
		}
		System.out.println("第一组:"+alist1);
		alist.removeAll(alist1);
		
		ArrayList alist2 = new ArrayList();
		for(int i = 0; i<4; i++){
			alist2.add(alist.get(r.nextInt(alist.size()-4)));
			alist.removeAll(alist2);
		}
		System.out.println("第二组:"+alist2);
		alist.removeAll(alist2);
		
		ArrayList alist3 = new ArrayList();
		for(int i = 0; i<4; i++){
			alist3.add(alist.get(r.nextInt(alist.size()-4)));
			alist.removeAll(alist3);
		}
		System.out.println("第三组:"+alist3);
		alist.removeAll(alist3);
		
		System.out.println("第四组:"+alist);
	}
}
