package Q2.in;
import java.util.*;
public class Equality {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,2,3,6};
	boolean result=Arrays.equals(arr1,arr2);
	if(result==true) {
		System.out.println("arrays are equal");
	}
	else {
		System.out.println("arrays are not equal");
	}
	}
}


