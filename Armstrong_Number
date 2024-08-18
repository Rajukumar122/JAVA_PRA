/*
Write a Java program to check if a given number is an Armstrong number or not.

SOME Of an example are input and output:

Input number: 153
Output: 
the power is equal to number of digit .

153 = (1)^3 + (5)^3 + (3)^3
"Yes, the number is an Armstrong number."

Input number: 1532
Output: 
the power is equal to number of digit .

1532 = (1)^4 + (5)^4 + (3)^4 + (2)^4
"no, the number is not an Armstrong number."

Input number: 1634
Output: 
the power is equal to number of digit .

1634 = (1)^4 + (6)^4 + (3)^4 + (4)^4
"YES, the number is  an Armstrong number."

The Armstrong numbers of first kind up to 10 digits are : 
1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, and 4679307774.

*/

/* Code: */ 

import java.util.*;
class Armstrong
{
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a Number");
       int number=sc.nextInt();
       int var=number, count=0;
       while(var>0)
       {
          count++;
          var=var/10;
       }
       var=number;
       int sum=0;
       while(var>0)
       {
          int rem=(var%10), val=1;
          for(int i=0;i<count;i++)
          {
            val=val*rem;
          }
          sum+=val;
          var=var/10;
       }
       if(number==sum){
        System.out.println("Yes, it is an armstrong number ");
       }
       else
       {
        System.out.println("No ,  it is not an armstrong number ");
       }
       sc.close();
    }
}

/* Code: use math function */ 

import java.util.*;
import java.lang.Math;
class Armstrong
{
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a Number");
       int number=sc.nextInt();
       int var=number, count=0;
       while(var>0)
       {
          count++;
          var=var/10;
       }
       var=number;
       int sum=0;
       while(var>0)
       {
          int rem=(var%10);
          sum+=Math.pow(rem,count);
          var=var/10;
       }
       if(number==sum){
        System.out.println("Yes, it is an armstrong number ");
       }
       else
       {
        System.out.println("No ,  it is not an armstrong number ");
       }
       sc.close();
    }
}



