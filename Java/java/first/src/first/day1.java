package first;

public class day1 {
	
	public static void main(String[] args) {
		
		
		/*标识符    英文 数字 下划线 美元符号$
		 *  不可是关键字
			数字不可开头  区分大小写  
			类首字母大写  变量 方法首字母小写  驼峰原则
			
		*/
		int age = 15;
		String name = "张三";
		int price = 998;
		String type = "F5700";
		
		System.out.println("姓名："+name+"，年龄："+age+"，型号："+type+"，价格："+price);
		
		
		int x = 4;
		System.out.println((x++)+(++x)+(x*10));
		
	}

}
