/*
In the University Examinations conducted during the past 5 years,
the toppers registration numbers were 7126, 82417914, 7687 and 6657.
Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers.
 In all the registration numbers listed here,
 the sum of the odd digits is equal to the sum of the even digits in the number.
 He termed the numbers that satisfy this property as Probable Topper Numbers.
 Write a program to find whether a given number is a probable topper number or not.
 */
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int topper_number=scanner.nextInt();
        int odd=0;
        int even=0;

        while(topper_number>0){
            int digit=topper_number % 10;
            if(digit%2==0){
                even+=digit;
            }
            else{
                odd+=digit;
            }
            topper_number=topper_number/10;
        }
        if(odd==even){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}