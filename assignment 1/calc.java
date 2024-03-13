import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        double num1=sc.nextDouble();
        System.out.println("enter the second number:");
        double num2=sc.nextDouble();
        System.out.println("enter the operator:+,-,*,/");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println(num1+num2);
            break;
            case '-':
            System.out.println(num1-num2);
            break;
            case '*':
            System.out.println(num1*num2);
            break;
            case '/':
            System.out.println(num1/num2);
            break;
            default:
            System.out.println("invalid entry");
            break;
        
        }

    }
}
