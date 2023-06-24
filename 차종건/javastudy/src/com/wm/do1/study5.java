package com.wm.do1;

import java.util.Iterator;

public class study5 {
	public static void main(String[] args) throws Exception{
		for (int i = 1; i <= 10; i++) {
			if (i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
