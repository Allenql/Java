package practice_collection2;

import java.util.HashMap;
import java.util.Map;

/*
 * 2.	有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 				第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 				将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
 * 				如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 */
public class Practice2 {
	public static void main(String[] args) {
		
		String [] province = {"黑龙江省","浙江省","江西省","广东省","福建省"};
		String [] city = {"哈尔滨","杭州","南昌","广州","福州"};
		
		Map<String, Object> m = new HashMap<String, Object>();
		
		for(int i = 0; i <province.length; i++){
			m.put(province[i], city[i]);
		}
		System.out.println(m);
		
		
		
	}

}
