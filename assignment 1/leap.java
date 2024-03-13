import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();
    /*using if-else
        if(year%400==0 || year%4==0){
            System.out.println("Year " +year +" is a Leap year");
        }
        else{
            System.out.println("Year " +year +" is  not a Leap year");
        }*/
        int r=year%400==0 || year%100==0 || year%4==0 ? 1:0;
        switch(r){
            case 1:
            System.out.println("year "+ year + " is a leap year");
            break;
            case 0:
            System.out.println("year "+ year+" is not a leap year");
            break;
            default:
            System.out.println("enter valid input");
            break;
        }
        
    }
}
