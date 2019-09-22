import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 制作一个工具类:DateUtil,进行日和字符串之间的格式转换.
    定义两个方法:
	一个用于将字符串日期转为Date类型,并返回该Date类型
	一个用于将Date类型转为指定格式的字符串形式,并返回该字符串
 */
public class Practice7 {
	public static void main(String[] args) throws ParseException {
		
		String s = "2019-08-26";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.parse(s));
		
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(d));
		
	}
	
	

}
