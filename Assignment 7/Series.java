package Q9.in;

import java.util.Arrays;

public class Series {

	public static void main(String[] args) {
		int []series=new int[6];
		for(int i=0;i<series.length;i++) {
		if(i%2==0) {
			series[i]=(i+1)*(i+1)*(i+1);
		}
		else {
			series[i]=(i+1)*(i+1);
		}
	}
System.out.println(Arrays.toString(series));
}
}