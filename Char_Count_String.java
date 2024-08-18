/*
Write a Java program to implement the condition to count the string character:

// aabbbcc = a2b3c2
// abbccc = a1b2c3

*/
/* code */

import java.util.*;
class A
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char ch=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                count++;
            }
            else{
                System.out.print(ch+""+count);
                count=0;
                ch=str.charAt(i);
                i--;
            }
            if(ch==str.charAt(str.length()-1)&&i==str.length()-1)
            {
                System.out.print(ch+""+count);
            }
        }
        sc.close();
    }
}
