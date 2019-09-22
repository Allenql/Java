package practice_API;
/*
 * 判断一个字符串是否对称
     例如判断一个字符串是否对称
     例如"abccba"
 */
public class Practice5 {
	public static void main(String[] args) {
		String s = "sabcfcbas";
		String [] s1 = s.split("");
		int count = 0;
		for(int i = 0;i<s1.length/2; i++){
			
			if(s1[i].equals(s1[s1.length-1])){
				
				count++;
			}
			
		}
		if(count != 0){
			System.out.println("对称");
		}else {
			System.out.println("不对称");
		}
	}

}
