/*
 * String与StringBuffer的性能区别
  先使用String连接10000个字符串,计算消耗的时间
  再使用StringBuffer连接10000个随机字符串,计算各自消耗的时间
 */
public class Practice6 {
	public static void main(String[] args) {
		
		String s = "a";
		StringBuffer sb = new StringBuffer("a");
		
		long t = System.currentTimeMillis();
		for(int i = 0; i<=10000; i++){
			s = s+i;
		}
		System.out.println(System.currentTimeMillis()-t);
		
		long t1 = System.currentTimeMillis();
		for(int i = 0; i<=10000; i++){
			sb = sb.append(i);
		}
		System.out.println(System.currentTimeMillis()-t1);
		
	}

}
