package com.org.khatri.utils;

import java.util.List;

public class SearchUtil {

	public static int linearSearch(List<String> list, String val) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(val))
				return i;
		}
		return -1;
	}

}
