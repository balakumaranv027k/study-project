package lear.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class BufferClass {
	
	
	
	


	public  void usingbuffer() {
		String b = "balalkkumaran";
		StringBuffer buffer = new StringBuffer();
		buffer.append(b);
		System.out.println(buffer.reverse());

	}


	public void usingchararray() {
		String name = "bala";
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		String revername="";

		for (int i = charArray.length-1;i>=0; i--) {
			revername=revername+charArray[i];
		}
		System.out.println(revername);

	}
	
	
	
	
	public void usingcollections() {
		
		String name = "bala kumaran is good boy";
		char[] charArray = name.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		
			
		for (Character character : charArray) {
			list.add(character);
			
		}
		
		Collections.reverse(list);
		ListIterator iter = list.listIterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
			
		}}
public static void main(String[] args) {
	
	BufferClass buff = new BufferClass();
	buff.usingcollections();
	buff.usingchararray();
	buff.usingbuffer();
}

}
