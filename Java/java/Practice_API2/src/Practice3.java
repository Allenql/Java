/*
 * 以下是一段歌词，请从这段歌词中统计出"朋友"出现的次数
 String str = "这些年一个人，风也过，雨也走，有过泪，有过错 "+
	            "还记得坚持甚么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中"+
	            "朋友一生一起走，那些日子不再有，一句话，一辈子，一生情，一杯酒。"+
	            "朋友不曾孤单过，一声朋友你会懂，还有伤，还有痛，还要走，还有我";
 */
public class Practice3 {
	public static void main(String[] args) {
		String s = "这些年一个人，风也过，雨也走，有过泪，有过错 "+
	            "还记得坚持甚么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中"+
	            "朋友一生一起走，那些日子不再有，一句话，一辈子，一生情，一杯酒。"+
	            "朋友不曾孤单过，一声朋友你会懂，还有伤，还有痛，还要走，还有我";
		int count = 0;
		int index = s.indexOf("朋友");
		
		while(true){
			if(index>=0){
				count++;
				index = s.indexOf("朋友", index+1);
			}else{
				break;
			}
		}
		System.out.println(count);
			
			
		
		
	}

}
