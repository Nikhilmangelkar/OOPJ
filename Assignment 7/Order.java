package Q10.in;

import java.util.Arrays;
import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter number of elements:");
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();		
			}
			System.out.println(Arrays.toString(arr));
				boolean ascending = true;
				boolean descending=true;
				for(int i=1;i<arr.length;i++) {
				if(arr[i]>arr[i-1]) {
					descending=false;
				}
				else if(arr[i]<arr[i-1]) {
					ascending=false;
				}
			}
				if(ascending && !descending) {
					System.out.println("Ascending");
				}
				else if(descending && !ascending){
					System.out.println("Descending");
				}
				else {
					System.out.println("Random");
				}
		
		}
	}
}
	


