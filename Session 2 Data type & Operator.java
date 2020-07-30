Q. 11: Area & Perimeter of a circle
QUESTION DESCRIPTION

Write a Java program to get the input as radius of a circle print the area and perimeter of a circle as output

Note:

Use double data type

and in the output statement use String.format("%.02f", variable name) for both area and Perimeter
TEST CASE 1

INPUT
7.5
OUTPUT
47.10
176.63
TEST CASE 2

INPUT
5.76
OUTPUT
36.17
104.18

############# code #######
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class TestClass 
{
	 public static void main(String[] args)
     { 
       double radius;
     Scanner s1=new Scanner(System.in);
    radius=s1.nextDouble();
       double perimeter = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

       System.out.print(String.format("%.02f",perimeter));
      System.out.print(String.format("\n%.2f",area));
       }
}

------------------------------------------------------------------------------------------------------------
Q. 12: Star Pattern
QUESTION DESCRIPTION

Write a program to print following outputs
*
**
***
****
TEST CASE 1

INPUT
4
OUTPUT
*
**
***
****
TEST CASE 2

INPUT
5
OUTPUT
*
**
***
****
*****
############## code ##############
import java.io.*;
import java.util.Scanner;

public class TestClass {
	 public static void main(String[] args) { 
		Scanner inp=new Scanner(System.in);
       int n=inp.nextInt();
       for(int i=1; i<=n+1; i++)
       {
         for(int j=1;j<i;j++)
         System.out.print("*");
         System.out.println();
       }


	}
}

-----------------------------------------------------------------------------------------

Q. 13: Hexadecimal to binary number
QUESTION DESCRIPTION

Java program to convert from hexadecimal to Binary
TEST CASE 1

INPUT
20
OUTPUT
100000
TEST CASE 2

INPUT
AFE
OUTPUT
101011111110

############ code ####################
import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int h=Integer.parseInt(s.nextLine(),16);
       String b=Integer.toBinaryString(h);
       System.out.print(b);
	}
}

--------------------------------------------------------------------------------------------
Q. 14: Small Factorial
QUESTION DESCRIPTION

Write a program to find the factorial value of any number entered by the user.

Input
The first line contains an integer T, total number of test-cases. Then follow T lines, each line contains an integer N.
Output

Display the factorial of the given number N .
TEST CASE 1

INPUT
2
5 9
OUTPUT
120
362880
TEST CASE 2

INPUT
3
4 6 3
OUTPUT
24
720
6

################ Code #################################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner s=new Scanner(System.in);
       int T;
       T=s.nextInt();
     while(T>0)
     {
       int i,fact=1;
       int N=s.nextInt();
       for(i=1;i<=N;i++)
         {
           fact=fact*i;
         }
         System.out.println(fact);

     T--;}
	}
}

-----------------------------------------------------------------------------------------
Q. 15: Decimal to Roman Number Conversion
QUESTION DESCRIPTION


Java Program to convert decimal to roman number

If the number is out of range (above 3999) then display the error message as "Out of Range"

TEST CASE 1

INPUT
3482
OUTPUT
MMMCDLXXXII
TEST CASE 2

INPUT
4000
OUTPUT
Out of Range
############# code ############


import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner inp=new Scanner(System.in);
       int num=inp.nextInt();
       if(num>0&&num<4000)
       {
         String thou[]={"","M","MM","MMM"};
         String hun[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
         String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
         String ones[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
         int th=num/1000;
         int h=(num/100)%10;
         int t=(num/10)%10;
         int u=num%10;
         System.out.println(thou[th]+hun[h]+ten[t]+ones[u]);
       }
       else
         System.out.println("Out of Range");
	}
}

----------------------------------------------------------------------------------------
Q. 16: Flying Jet
QUESTION DESCRIPTION

The jets speed is changed after every mile covered on it's runway. It follows a specific pattern for the speed. Starting from 1 it goes like 1, 7, 16, 21, 81, 63, 256 . . . and so on. Your task is to find out its speed after nth mile.

Input:
The First Line of Input contains T, which denotes the number of test cases. The only line of each test case contains an integer denoting n.

Output:
Print the speed of the jet at the nth mile covered before take Off.

Constraints:
1<=T<=100
1<=N<=60

Example:
Input:
2
5
9
Output:
81
625
TEST CASE 1

INPUT
10
5 6 3 4 5 1 2 9 8 7
OUTPUT
81
63
16
21
81
1
7
625
189
256
TEST CASE 2

INPUT
5
5 6 3 4 5
OUTPUT
81
63
16
21
81

###################### code #############################

import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       int[] speed={1,7,16,21,81,63,256,189,625};
       Scanner inp=new Scanner(System.in);
       int n=inp.nextInt();
       int[] arr=new int[n+1];
       for(int i=0;i<n;i++){
         arr[i]=inp.nextInt();
       }
       for(int i=0;i<n;i++){
         int res=arr[i];
         System.out.println(speed[res-1]);
       }

	}
}

--------------------------------------------------------------------------------------

Q. 17: Matrix operation
QUESTION DESCRIPTION

Write a java program to get a matrix and print it in matrix format.
TEST CASE 1

INPUT
3 3
1 1 1 1 1 1 1 1 1
OUTPUT
1 1 1 
1 1 1 
1 1 1
TEST CASE 2

INPUT
2 2
1 2 3 4
OUTPUT
1 2 
3 4

############### Code ################
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		int row, col;
        int[][] mat = new int[10][10];
        Scanner scan = new Scanner(System.in); 

        row = scan.nextInt();
        col = scan.nextInt();

        for(int i=0; i<row; i++)
          	for(int j=0; j<col; j++)
              mat[i][j] = scan.nextInt();

       for(int i=0; i<row; i++)
       {
         for(int j=0; j<col; j++)
           System.out.print(mat[i][j]+" ");      
         System.out.print("\n");
       }
	}
}

----------------------------------------------------------------------------------------
Q. 18: conversion from float to int
QUESTION DESCRIPTION

java program to convert from float to int
TEST CASE 1

INPUT
112.11
OUTPUT
112
TEST CASE 2

INPUT
5.3564
OUTPUT
5
############### code ##################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       float s=sc.nextFloat();
       int p=(int)s;
       System.out.println(p);
	}
}

-------------------------------------------------------------------------------------------
Q. 19: Binary sum
QUESTION DESCRIPTION

Write a Java program to add two binary numbers.
TEST CASE 1

INPUT
10
11
OUTPUT
101
TEST CASE 2

INPUT
100
111
OUTPUT
1011

################# Code #################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
       	String s1 = s.next();
       	String s2 = s.next();
       	int a = Integer.parseInt(s1,2);
       	int b = Integer.parseInt(s2,2);

       	System.out.print(Integer.toBinaryString(a+b));
	}
}

-----------------------------------------------------------------------------------------
Q. 20: Positive or negative integer
QUESTION DESCRIPTION

Java Program to check for positive or negative integer
TEST CASE 1

INPUT
6
OUTPUT
6 is Positive
TEST CASE 2

INPUT
-2
OUTPUT
-2 is Negative

############### code ####################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 

       int n;
        Scanner s = new Scanner(System.in);
       // System.out.print("Enter the number to check:");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println(n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println(n+" is Negative");
        }


	}
}
----------------------------------------------------------------------------------------





import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       int[] speed={1,7,16,21,81,63,256,189,625};
       Scanner inp=new Scanner(System.in);
       int n=inp.nextInt();
       int[] arr=new int[n+1];
       for(int i=0;i<n;i++){
         arr[i]=inp.nextInt();
       }
       for(int i=0;i<n;i++){
         int res=arr[i];
         System.out.println(speed[res-1]);
       }

	}
}

--------------------------------------------------------------------------------------





0 comments on commit 40e954c
@shivendrakr
 
 
Leave a comment

Attach files by dragging & dropping, selecting or pasting them.
 You’re receiving notifications because you’re watching this repository.
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
