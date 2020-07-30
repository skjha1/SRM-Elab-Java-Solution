Question 1: Character of an ASCII code
QUESTION DESCRIPTION

Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
TEST CASE 1

INPUT
65
OUTPUT
A
TEST CASE 2

INPUT
99
OUTPUT
c

######################code#######################

import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       int no; 
       Scanner s = new Scanner(System.in);
       no=s.nextInt();
       String aChar = new Character((char) no).toString();
       System.out.println(aChar);
       
		
	}
}

----------------------------------------------------------------------------------
Q. 2: Talking Parrot
QUESTION DESCRIPTION

We have a loud talking parrot. The ""hour"" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

parrotTrouble(true, 6) true
parrotTrouble(true, 7) false
parrotTrouble(false, 6) false
TEST CASE 1

INPUT
FALSE
19
OUTPUT
false
TEST CASE 2

INPUT
TRUE
21
OUTPUT
true
###########code##############


import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
	   Scanner sc=new Scanner(System.in);	
       String v=sc.nextLine();
       int val=sc.nextInt();
       System.out.println(isTrouble(v,val));
	}
     private static boolean isTrouble(String bool,int val)
     {
       if((val<7 || val>20)&& bool.equals("TRUE"))
              return true;
       return false;
     }
}

---------------------------------------------------------------------------------------
Q. 3: Three Idiots
QUESTION DESCRIPTION

Create a program that reads three integers from the user and displays them in sorted order (from smallest to largest).

Use the min and max functions to find the smallest and largest values. The middle value can be found by computing the sum of all three values, and then subtracting the minimum value and

the maximum value.
TEST CASE 1

INPUT
25
12
1988
OUTPUT
The minimum value is 12
The maximum value is 1988
The middle value is 25
TEST CASE 2

INPUT
9
19
1972
OUTPUT
The minimum value is 9
The maximum value is 1972
The middle value is 19

############ code ###########

import java.util.Scanner;
import java.io.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int[] arr=new int[3];
       for(int i=0;i<3;i++)
         arr[i]=sc.nextInt();
       
        for(int i=0;i<3;i++)
        {
           for(int j=i+1;j<3;j++)
           {
             if(arr[i]>arr[j])
             {
               int tem=arr[i];
               arr[i]=arr[j];
               arr[j]=tem;
             }
           }
        }
       System.out.println("The minimum value is "+arr[0]);
       System.out.println("The maximum value is "+arr[2]);
       System.out.println("The middle value is "+arr[1]);
       
       
       
	}
}

------------------------------------------------------------------------------------------
Q. 4: Bottle Deposit
QUESTION DESCRIPTION

In many jurisdictions a small deposit is added to drink containers to encourage people to recycle them. In one particular jurisdiction, drink containers holding one liter or
less have a 0.10 deposit, and drink containers holding more than one liter have a 0.25 deposit.

Write a program that reads the number of containers of each size from the user. Your program should continue by computing and displaying the refund that will be
received for returning those containers. Format the output so that it includes a rupees and always displays exactly two decimal places.
TEST CASE 1

INPUT
23
22
OUTPUT
Refund for Bottles=7.80
TEST CASE 2

INPUT
157
198
OUTPUT
Refund for Bottles=65.20

################ code #######################
import java.io.*;
import java.util.Scanner;
public class TestClass {
	

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int c1 = input.nextInt();
		int c2 = input.nextInt();
		
  double c3 =  c1*.10 + c2*.25;
		
		
  		String sf2=String.format("Refund for Bottles=%.2f",c3);
  		System.out.println(sf2);
	}
}

-------------------------------------------------------------------------------------------

Q. 5: LCM of two numbers
QUESTION DESCRIPTION

Java Program to find LCM of two numbers
TEST CASE 1

INPUT
336
224
OUTPUT
672
TEST CASE 2

INPUT
10
5
OUTPUT
10

################## code ######################

import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner obj=new Scanner(System.in);
      int n1=obj.nextInt();
      int n2=obj.nextInt();
		int lcm = (n1 > n2) ? n1 : n2;

        
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }
	}
}
--------------------------------------------------------------------------------------

Q. 6: Perimeter of a Circle
QUESTION DESCRIPTION

Java Program to calculate Perimeter of circle using radius
TEST CASE 1

INPUT
4
OUTPUT
25.12
TEST CASE 2

INPUT
16
OUTPUT
100.48

############### code #################

import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       float p=2*3.14f*r;
       System.out.println(p);
	}
}

-----------------------------------------------------------------------------------------
Q. 7: Energy
QUESTION DESCRIPTION

Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.

Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water. The formula to compute the energy is Q = M * (finalTemperature initialTemperature) * 4184

Where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.

Use Double Data Type
TEST CASE 1

INPUT
340 12 90
OUTPUT
The energy needed is=1.1095968E8
TEST CASE 2

INPUT
500 12 34
OUTPUT
The energy needed is=4.6024E7
############# code #####################

import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner Sc = new Scanner(System.in);
       int a = Sc.nextInt();
       int b = Sc.nextInt();
       int c = Sc.nextInt();
       
       double q = a * (c-b) * 4184;
       
       System.out.println("The energy needed is=" + q);
	}
}

----------------------------------------------------------------------------------------------
Q. 8: Hexagon area
QUESTION DESCRIPTION

Write a program that prompts the user to enter the side of a hexagon and displays its area.

Use Double Data Type and

String.format(" %.2f", outputValue);
TEST CASE 1

INPUT
5.12
OUTPUT
68.11
TEST CASE 2

INPUT
3.4
OUTPUT
30.03

############## code ################################
import java.io.*;
import java.util.Scanner;

public class TestClass {
	 public static void main(String[] args) { 
		         Scanner inp=new Scanner(System.in); 
       try{
         //enter side of hexagon
         double var1=inp.nextDouble();
         double area=3*Math.sqrt(3)*var1*var1/2;
         String s=String.format("%.2f",area);
         System.out.print(s);
        }
       catch (Exception E)
       {}
	}
}

-----------------------------------------------------------------------------------
Q. 9: Day Old Bread
QUESTION DESCRIPTION

A bakery sells loaves of bread for 185 rupees each. Day old bread is discounted by 60 percent. Write a program that begins by reading the number of loaves of day old bread being purchased from the user. Then your program should display the regular price for the bread, the discount because it is a day old, and the total price. All of the values should be displayed using two decimal places, and the decimal points in all of the numbers should be aligned when reasonable values are entered by the user.
TEST CASE 1

INPUT
15
OUTPUT
Loaves Discount
Regular Price 2775
Total Discount 1665.0
Total Amount to be paid 1110.0
TEST CASE 2

INPUT
25
OUTPUT
Loaves Discount
Regular Price 4625
Total Discount 2775.0
Total Amount to be paid 1850.0

########### code #################

import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int p=n*185;
       double d;
       d=0.6*p;
       double x=p-d;
       System.out.println("Loaves Discount");
       System.out.println("Regular Price "+p);
       System.out.println("Total Discount "+d);
       System.out.println("Total Amount to be paid "+x);
		
	}
}

-----------------------------------------------------------------------------------------

Q. 10: eLab Temperature Scale
QUESTION DESCRIPTION

Write a program that begins by reading a temperature from the user in degrees Fahrenheit . Then your program should display the equivalent temperature in degrees Celcius.
The calculations needed to convert between different units of temperature is your task

Input:
Fahrenheit in Integer type

Output:
Corresponding Celcius in Float Type

Mandatory:

1. Declare a Variable in float as "temperature"
float temperature

2. Use Scanner class to get Fahrenheit value from the user and the Scanner class object as "in"
Scanner in = new Scanner(System.in)

TEST CASE 1

INPUT
93
OUTPUT
33.88889 celcius
TEST CASE 2

INPUT
100
OUTPUT
37.77778 celcius
############ code #####################
import java.util.*;
 
class TestClass {
  public static void main(String[] args) {
    float temperatue;
    Scanner in = new Scanner(System.in);      
       temperatue = in.nextInt();
 
    temperatue = ((temperatue - 32)*5)/9;
 
    System.out.println(+ temperatue+" celcius");
   }
}


© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
