package com.mph.Day9;

public class Repeat {

	public static void main(String[] args) {
		int arr[] = {1,2,3,2};
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			
		}
		

	}

}
