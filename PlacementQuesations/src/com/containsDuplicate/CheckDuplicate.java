package com.containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {
	//first approach
public static boolean checkDuplicate(int[]arr) {
	Arrays.sort(arr);
	for(int i=0;i<=arr.length-2;i++) {
		if(arr[i]==arr[i+1]) {
			return true;
		}
	}
	return false;
}
//2nd Approach
public static boolean duplicateElementArray(int[]nums) {
	Set<Integer>seen=new HashSet<>();
	for(int num:nums) {
	if(!seen.add(num)) {
		return true;
	}}
return false;
}
}