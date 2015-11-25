package Colle;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("北京");
		aList.add("上海");
		aList.add("天津");
		aList.add("重庆");
		aList.add(0,"广州");
		
		print1(aList);
		
		aList.set(1, "Beijing");
		
		print1(aList);
		
		System.out.println("=======================");
		
		print2(aList);
		
		aList.remove(3);
		
		System.out.println("=======================");
		
		print2(aList);
		
	}
	static void print1(ArrayList<String>aList){
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}	
	}
	
	static void print2(ArrayList<String>aList){
		//遍历器相当于元素指针  调iterator可获得遍历器
		Iterator<String> it = aList.iterator();
		
		//has 有，next 下一个，判断是否有下一个
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
}
