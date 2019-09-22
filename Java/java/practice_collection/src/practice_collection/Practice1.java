package practice_collection;

import java.util.ArrayList;

/*
 * 定义一个String类型的集合,去除ArrayList中的重复元素
 */
public class Practice1 {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("a");
		alist.add("a");
		alist.add("b" );
		alist.add("a");
		alist.add("c");
		alist.add("d");
		alist.add("a");
		alist.add("c");
		alist.add("c");
		alist.add("d");
		alist.add("d");
		
		System.out.println(alist);
		for(int i = 0; i<alist.size(); i++){
			for(int j = i+1; j<alist.size(); j++){
				if(alist.get(i) == alist.get(j)){
					alist.remove(j);
					j--;
				}
			}
		}
		System.out.println(alist);
	}
}
