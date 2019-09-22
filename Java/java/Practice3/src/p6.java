
//6.猴子吃桃问题。猴子第一天摘下若干个桃子，当时就吃了一半，还不过瘾，
//就又吃了一个。第二天又将剩下的桃子吃掉一半，又多吃了一个。以后每天都吃
//前一天剩下的一半零一个。到第 10 天在想吃的时候就剩一个桃子了,求第一天共
//摘下来多少个桃子？
public class p6 {
	public static void main(String[] args) {
		
		int n = 1;
		for(int a = 2; a<=10; a++){
			
			n = (n+1)*2    ;
			
		}
		System.out.println(n);
		
	}
	
}