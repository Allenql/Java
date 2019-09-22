/*
 * 统计某一个指定字母在整个字符串中出现的次数   (自己定义字符串)
 */
public class Practice1 {
	public static void main(String[] args) {
		
		String s = "ashafiayhavn";
		int count = 0;
		int index = s.indexOf("a");
		while(true){
			
			if(index>=0){
				count++;
				index = s.indexOf("a", index+1);
				
			}else{
				break;
			}
		}
		System.out.println(count);
	}

}
