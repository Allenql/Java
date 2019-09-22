package practice_collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 利用Map，完成下面的功能：
	从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
	如果该年没有举办世界杯，则输出：没有举办世界杯。
	历届世界杯冠军
举办年份	 1930年1934年1938年1950年1954年1958年1962年1966年1970年1974年1978年
		 1982年1986年1990年1994年1998年2002年2006年2010年2014年2018年
冠军 乌拉圭 意大利 意大利 乌拉圭 西德 巴西 巴西 英格兰 巴西 西德 阿根廷 意大利 阿根廷 西德 巴西 法国 巴西 意大利 西班牙 德国 法国

 */
public class Practice3 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("1930","乌拉圭");
		m.put("1934","意大利");
		m.put("1938","意大利");
		m.put("1950","乌拉圭");
		m.put("1954","西德");
		m.put("1958","巴西");
		m.put("1962","巴西");
		m.put("1966","英格兰");
		m.put("1970","巴西");
		m.put("1974","西德");
		m.put("1978","阿根廷");
		m.put("1982","意大利");
		m.put("1986","阿根廷");
		m.put("1990","西德");
		m.put("1994","巴西");
		m.put("1998","法国");
		m.put("2002","巴西");
		m.put("2006","意大利");
		m.put("2010","西班牙");
		m.put("2014","德国");
		m.put("2018","法国");

//		System.out.println(m.keySet());
		//拿到key年份  存入key集合中
		ArrayList<String> key = new ArrayList<String>();
		key.addAll(m.keySet());
		
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("输入1根据年份查询冠军,2查看国家获得冠军的年份,3退出");
			int choose = s.nextInt();
			switch (choose) {
			case 1:
				System.out.println("输入年份");
				String year = s.next();
				if(m.keySet().contains(year) == true){
					System.out.println(year+"年世界杯冠军是"+m.get(year));
				}else{
					System.out.println(year+"年没有举办世界杯");  
				}
				break;
			case 2:
				System.out.println("输入国家名称");
				String country = s.next();
				ArrayList<String> champion = new ArrayList<String>();
				int count = 0;
				for(int i = 0; i<m.size(); i++){
					if(m.get(key.get(i)).equals(country)){
						champion.add(key.get(i));
						count++;
					}
				}
				if(count==0){
					System.out.println(country+"没有获得过冠军");
				}else{
					
					System.out.println(country+"获得冠军年份为:"+champion);
				}
				break;
			case 3:
				System.exit(0);
			default:
				break;
			}
		}
		
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
