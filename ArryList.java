package Colle;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("����");
		aList.add("�Ϻ�");
		aList.add("���");
		aList.add("����");
		aList.add(0,"����");
		
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
		//�������൱��Ԫ��ָ��  ��iterator�ɻ�ñ�����
		Iterator<String> it = aList.iterator();
		
		//has �У�next ��һ�����ж��Ƿ�����һ��
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
}
