package com.fynn.leecodetemp;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0, j = -1; i < charArray.length; i++) {
			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], i);
				maxLength = maxLength > (i - j) ? maxLength : (i - j);
			} else {
				int startIndex = j > (int) map.get(charArray[i]) ? j : (int) map.get(charArray[i]);
				maxLength = (i - startIndex) > maxLength ? (i - startIndex) : maxLength;
				map.put(charArray[i], i);
				j = startIndex;
			}
		}
		return maxLength;
	}
}