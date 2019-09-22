package practice_API;
/*
 * 将一个字符串逆序输出  abcd  dcba
 */
public class Practice4 {
	public static void main(String[] args) {
		
		String s = "abcd";
		String s1 = "";
//		String s2 = "";
		for(int i = 0; i<s.split("").length; i++){
			s1 += s.split("")[s.split("").length - i -1];
			
//			s2 = s.charAt(i)+"";
//			s1 = s.replace(s.charAt(i),s.charAt(s.length()-1-i));
//			s1 = s.replace(s.charAt(s.length()-1-i)+"",s2);
//			
//			System.out.println(s.replace(s.charAt(i), s.charAt(s.length()-1-i)));
			
		}
		System.out.println(s1);
	}

}
