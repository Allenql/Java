//  定义长方形类，含：
//
//  属性：宽、长（整型）；
//
//  方法：求周长、面积；
//
//  进行测试。


//长方形类
public class Rectangle {
	
	int x;
	int y;
	
	public void c(){
		System.out.println("长为"+x+"宽为"+y+"的长方形周长为"+(x+y)*2);
	}
	public void s(){
		System.out.println("长为"+x+"宽为"+y+"的长方形面积为"+x*y);
	}

}
