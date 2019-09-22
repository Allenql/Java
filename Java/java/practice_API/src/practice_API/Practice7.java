package practice_API;
/*
 * String s =  "罗霄:上机成绩=88,笔试成绩=78;"
				+ "刘苗苗:上机成绩=68,笔试成绩=98;"
				+ "郝笑:上机成绩=48,笔试成绩=58;"
				+ "李昊阳:上机成绩=55,笔试成绩=11;"
				+ "雷鸣:上机成绩=44,笔试成绩=55;"
				+ "李文龙:上机成绩=22,笔试成绩=55;"
				+ "赵璧辉:上机成绩=44,笔试成绩=66;" ;
	1）找出总成绩(笔试+机试)最高的同学。
	2）计算出上机成绩和笔试成绩的平均分。
 */
public class Practice7 {
	public static void main(String[] args) {
		String s =  "罗霄:上机成绩=88,笔试成绩=78;"
				+ "刘苗苗:上机成绩=68,笔试成绩=98;"
				+ "郝笑:上机成绩=48,笔试成绩=58;"
				+ "李昊阳:上机成绩=55,笔试成绩=11;"
				+ "雷鸣:上机成绩=44,笔试成绩=55;"
				+ "李文龙:上机成绩=22,笔试成绩=55;"
				+ "赵璧辉:上机成绩=44,笔试成绩=66;" ;
		String [] array = s.split(";");
		int sjtotal = 0;
		int bstotal = 0;
		for(int i = 0; i<array.length; i++){
			
			String name = array[i].substring(0, array[i].indexOf(":"));
			String sjscore = array[i].substring(array[i].indexOf("=")+1, array[i].indexOf(","));
			String bsscore = array[i].substring(array[i].lastIndexOf("=")+1);
			int sj = Integer.parseInt(sjscore);
			int bs = Integer.parseInt(bsscore);
			sjtotal += sj;
			bstotal += bs;
			
			
		}
	}

}
