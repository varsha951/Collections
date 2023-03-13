package com.uis.treeset;

import java.util.Comparator;

public class NumbersLessthan7 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i1<7) {
		return 1;	
		}else {
		return 0;
		}
	}
 
}
