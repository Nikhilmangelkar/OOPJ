import java.util.*;
public class BMI_cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height in cms:");
        double height=sc.nextDouble();
        System.out.println("enter the weight in kgs:");
        double weight=sc.nextDouble();
        height=height/100; //height in meters
        double bmi=weight/(height*height);
        System.out.println("BMI of a person is: "+ bmi);
        if(bmi<18.5){
            System.out.println("underweight");
        }
        else if(bmi>18.5 && bmi<=25){
            System.out.println("normal weight");
        }
        else{
            System.out.println("overweight");
        }
    }
}

