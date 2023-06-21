package com.org.khatri.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortUtil {

	public static List<String> sortStrings(List<String> list) {

		List<String> sortedList = new LinkedList<String>(list);
		Collections.sort(sortedList);
		return sortedList;

	}

}
