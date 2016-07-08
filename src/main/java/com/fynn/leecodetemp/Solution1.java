package com.fynn.leecodetemp;

import java.util.HashMap;

public class Solution1 {
	public int lengthOfLongestSubstring(String s) {
		long startTime =  System.currentTimeMillis();
	    char[] sc = s.toCharArray();
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    int max = 0, start=0;
	    for(int i=0;i<=sc.length;i++){
	        if(i==sc.length){
	            max = max > (i - start) ? max : (i - start);
	            break;
	        }
	        int index = map.getOrDefault(sc[i],-1);
	        if(index<0){
	            map.put(sc[i],i);
	        }else{
	            max = max > (i - start) ? max : (i - start);
	            start = start > (index + 1) ? start : (index + 1);
	            map.put(sc[i],i);
	        }
	    }
	    long endTime = System.currentTimeMillis();
	    System.out.println(endTime - startTime);
	    return max;
	}
}