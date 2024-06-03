package com.febbatch;

import java.util.Iterator;

public class Duplicatestring {
	public static void main(String[] args) {
		
		String id = "great responce";
		char[] ch = id.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate characters in string are ="+ch[j]);
				}
					
			}
	
		}
				

	}

}
