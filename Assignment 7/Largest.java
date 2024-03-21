package Q5.in;

public class Largest {

	public static void main(String[] args) {
		int []arr= {12,16,54,88,95};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("smallest number is:"+smallest);
		System.out.println("largest number is:"+largest);
		}

}
