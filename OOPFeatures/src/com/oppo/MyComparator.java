package com.oppo;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
	@Override
	public int compare(String x, String y) {
		return y.length() - x.length();
	}
}
