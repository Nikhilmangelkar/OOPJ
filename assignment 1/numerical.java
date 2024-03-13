import java.util.*;
class numerical{
 public static void main(String[] args) {
    System.out.println("enter your marks:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>=80){
        System.out.println("Grade A");    
    }
    else if(a>=65 && a<80){
        System.out.println("Grade B");
    }
    else if(a>=40 && a<65 ){
        System.out.println("Grade C");
    }
    else{
        System.out.println("fail");
    }


    
 }   
}