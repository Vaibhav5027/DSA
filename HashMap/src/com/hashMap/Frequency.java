package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		int[] arr= {1,3,4,2,1,1};
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		int maxFrequency=0;
		int maxKey=0;
		for(var e:map.entrySet()) {
		if(e.getValue()>maxFrequency) {
			maxFrequency=e.getValue();
			maxKey=e.getKey();
		}
		}
    System.out.printf("Key  %s has frequncy %s",maxKey,maxFrequency);
	}

}
