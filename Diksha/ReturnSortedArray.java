package oops.methods.returnType;

import java.util.Arrays;

public class ReturnSortedArray {
	public int[] sort(int[] arr) {
		int length=arr.length;
		int small=0;
		for(int i=0;i<length;i++) {
			
			for(int j=i;j<length;j++) {
				if(arr[i]>arr[j]) {
					small=arr[i];
					arr[i]=arr[j];
					arr[j]=small;
				}
			}
			
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {1,5,6,8,4,2,3};
		ReturnSortedArray obj=new ReturnSortedArray();
		int[] sortarr=obj.sort(arr);
		System.out.println("sorted srray is:"+Arrays.toString(sortarr));
		
		
	}

}
