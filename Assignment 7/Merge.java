package Q7.in;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int arr1[]= {23,60,94,3,102};
		int arr2[]= {42,16,74};
		int merged[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			merged[k++]=arr1[i++];
			merged[k++]=arr2[j++];
		}
		while(i<arr1.length) {
			merged[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			merged[k++]=arr2[j++];
		}
		System.out.println("Merged array is:");
		System.out.print(Arrays.toString(merged));
		

	}

}
