/*
 * 给出一个随机字符串，统计有多少字母？多少数字？
 */
public class Practice2 {
	public static void main(String[] args) {
		
		String s = "as4d5f42fvs5";
		char [] c = s.toCharArray();
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			int x = c[i];
			if(x>=48 && x<=57){
				count++;
			}
		}
		System.out.println("数字有"+count+"个");
		System.out.println("字母有"+(s.length()-count)+"个");
		
	}

}
