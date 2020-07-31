Q. 21: Detect key press
QUESTION DESCRIPTION

Write a Java program to detect key presses.

If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program will show ""Not allowed"
TEST CASE 1

INPUT
9
OUTPUT
You pressed 9
TEST CASE 2

INPUT
11
OUTPUT
Not allowed


#############code############

import java.lang.*;
import java.util.Scanner;

public class TestClass
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String str = sc.next();//.charAt(0);
      if (str.length() >1)
      {
        System.out.println("Not allowed"); return;
      }
     char c=str.charAt(0);
       
       boolean b1;
     b1 = Character.isDigit(c);
     if(b1) System.out.println("You pressed "+c);
     else
     System.out.println("Not allowed");
   }
}

-------------------------------------------------------------------------------------
Q. 22: Sum of Array elements
QUESTION DESCRIPTION

Implement the formula and logic as follows:

S = sum(A) returns the sum of the elements of A along the first array dimension whose size does not equal 1
If A is a vector, then sum(A) returns the sum of the elements.
If A is a matrix, then sum(A) returns a row vector containing the sum of each column.
If A is a multidimensional array, then sum(A) operates along the first array dimension whose size does not equal 1, treating the elements as vectors. This dimension becomes 1 while the sizes of all other dimensions remain the same.

Get array as input and display the sum of array elements as outputs

First line contains an integer T denoting the number of test cases.

Then follow T test cases. Each test case consists of two lines, each of which contains a string composed of English lower case and upper characters.

First of these is the jewel string J and the second one is stone string S.

You can assume that 1 <= T <= 100, 1 <= |J|, |S| <= 100
TEST CASE 1

INPUT
5
1 2 3 4 5
OUTPUT
15
TEST CASE 2

INPUT
4
1 2 3 0
OUTPUT
6
########## Code ############

import java.io.*;
import java.util.Scanner;
public class TestClass {
  public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        int a[] = new int[n];
       
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println(sum);
    
}
}

-----------------------------------------------------------------------------------
Q. 23: Manasa and Stones
QUESTION DESCRIPTION

Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.


Note: The numbers on the stones are in increasing order.

Input Format
The first line contains an integer T , i.e. the number of test cases. T test cases follow; each has 3 lines. The first line contains n (the number of stones). The second line contains a, and the third line contains b.

Constraints
1<=T<=10
1<=n,a,b<=103

Output Format
Space-separated list of numbers which are the possible values of the last stone in increasing order.

TEST CASE 1

INPUT
2
3
1
2
4
10
100
OUTPUT
2 3 4 
30 120 210 300 
TEST CASE 2

INPUT
2
6
4
8
11
3
10
OUTPUT
20 24 28 32 36 40 
30 37 44 51 58 65 72 79 86 93 100 

############ Code #####################

import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		int t,a,b,n;
       Scanner in = new Scanner(System.in);
       t = in.nextInt();
       while(t>0){
         	n = in.nextInt();
       		a = in.nextInt();
         	b = in.nextInt();
         	if(a>b){
            	int temp = a;
              	a = b;
              	b = temp;
            }
         	 int val = ((int)--n)*a;
			 short dval = (short)(b - a);
         	if (dval > 0){
                while(n-- > 0){
                  	System.out.print(val+" ");
                    val += dval;
                }
                System.out.print(val+" ");
            }
         	
         --t;
         System.out.println();
       }
	}
}

-----------------------------------------------------------------------------------

Q. 24: SUM OF ARRAY PAIR
QUESTION DESCRIPTION

Write a java program to find Pair of Integers in Array whose Sum is Given Number

The Number of Inputs are as follows:

1. The first line denoted the number of inputs to be given by the user
2. The second line denotes the input elements
3. The Third Line denotes the number to find the sum of pair
TEST CASE 1

INPUT
7
12 14 17 15 19 20 -11
33
OUTPUT
14,19
TEST CASE 2

INPUT
7
1 20 9 0 8 1 11
9
OUTPUT
1,8
9,0
8,1


################## Code ###################

import java.io.*;
import java.util.*;
public class TestClass {
 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int arr[] = new int[100] ;
    int n = s.nextInt();
       for(int i=0;i<n;i++)
       {
         arr[i]=s.nextInt();}
    int sum=s.nextInt();
    for (int i =  0; i <n; i++)
  {
  for (int j  = i+1; j <n; j++)
  {
  if(arr[i]+arr[j] ==sum)
  {
  System.out.println(arr[i]+","+arr[j]);
  }
  }
    }
    
       }
}

-------------------------------------------------------------------------------------


Q. 25: Compare two strings lexicographically
QUESTION DESCRIPTION

Write a java program to compare two strings lexicographically

If the strings are equal then mentions as follows:

Input 1:

SRM
SRM

Output:

SRM is equal to SRM
TEST CASE 1

INPUT
SRM UNIVERSITY
SRM
OUTPUT
SRM UNIVERSITY is greater than SRM
TEST CASE 2

INPUT
SRM
SRM UNIVERSITY
OUTPUT
SRM is less than SRM UNIVERSITY

############# Code #########################

import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s2=sc.nextLine();
       int res=s1.compareTo(s2);
       if (res>0)
         System.out.println(s1+ " is greater than " + s2);
       else if (res<0)
         System.out.println(s1+ " is less than " + s2);
       else
         System.out.println(s1+ " is equal to " + s2);
	}
}

------------------------------------------------------------------------------------
Q. 26: PATTERNS - L5
QUESTION DESCRIPTION

Write a java program to display the following patterns
TEST CASE 1

INPUT
7
OUTPUT
7 6 5 4 3 2 1 
7 6 5 4 3 2 
7 6 5 4 3 
7 6 5 4 
7 6 5 
7 6 
7
TEST CASE 2

INPUT
5
OUTPUT
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5


############### Code #############
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println();
         
        int rows = sc.nextInt();
         
        System.out.println();
         
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
               
                 sc.close();
	}
}

---------------------------------------------------------------------------------

Q. 27: Palindrome
QUESTION DESCRIPTION

Palindromes date back at least to 79 AD, as a palindrome was found as a graffito at Herculaneum, a city buried by ash in that year. This palindrome, called the Sator Square, consists of a sentence written in Latin: "Sator Arepo Tenet Opera Rotas" ("The sower Arepo holds with effort the wheels"). It is remarkable for the fact that the first letters of each word form the first word, the second letters form the second word, and so forth. Hence, it can be arranged into a word square that reads in four different ways: horizontally or vertically from either top left to bottom right or bottom right to top left. As such, they can be referred to as palindromatic.

Palindrome on the font at St Martin, Ludgate The palindromic Latin riddle "In girum imus nocte et consumimur igni" ("we go wandering at night and are consumed by fire") describes the behavior of moths. It is likely that this palindrome is from medieval rather than ancient times.
TEST CASE 1

INPUT
121
OUTPUT
palindrome
TEST CASE 2

INPUT
13321
OUTPUT
not a palindrome
############# Code #######################

import java.io.*;
import java.util.Scanner;

public class TestClass
{
    public static void main(String args[])
    {
        int num, rem, orig, rev=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print(" ");
        num = scan.nextInt();
		
        orig = num;
		
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        
        // check if the original number is equal to its reverse
        
        if(rev==orig)
        {
            System.out.print("palindrome ");
        }
        else
        {
            System.out.print("not a palindrome");
        }
    }
}

-------------------------------------------------------------------------------------
Q. 28: Power of 2
QUESTION DESCRIPTION

Write a program that takes a command-line argument n and prints a table of the powers of 2 that are less than or equal to

2^n.0 <= n < 31 if u declare as int



TEST CASE 1

INPUT
5
OUTPUT
0 1
1 2
2 4
3 8
4 16
5 32
TEST CASE 2

INPUT
6
OUTPUT
0 1
1 2
2 4
3 8
4 16
5 32
6 64

######################### Code ############################

import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		 Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         
         for (int i=0 ; i<=a; i++)
         {
           double f = Math.pow(2, i);
           System.out.println(i +" " + (int)f);
         }
	}
}

------------------------------------------------------------------------------------
Q. 29: Pronic Number
QUESTION DESCRIPTION


A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1). The study of these numbers dates back to Aristotle. They are also called oblong numbers, heteromecic numbers, or rectangular numbers; however, the "rectangular number" name has also been applied to the composite numbers.[4][5]

The first few pronic numbers are:

0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 (sequence A002378 in the OEIS).
TEST CASE 1

INPUT
110
OUTPUT
Yes
TEST CASE 2

INPUT
73
OUTPUT
No
##################### Code ########################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		
       
       Scanner sc = new Scanner(System.in);
         
       // System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int flag = 0;
    
        for(int i=0; i<n; i++)
        {
            if(i*(i+1) == n)
            {
                flag = 1;
                break;
            }
        }
         
        if(flag == 1)
            System.out.println("Yes");
        else
            System.out.println("No");     
       
	}
}


----------------------------------------------------------------------------------------
Q. 30: Julius Caesar
QUESTION DESCRIPTION

Julius Caesar protected his confidential information by encrypting it in a cipher. Caesars cipher rotated every letter in a string by a fixed number, "K", making it unreadable by his enemies. Given a string, "S", and a number, "K", encrypt "S" and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as "-" remain unencrypted.

Input Format

The first line contains an integer, "N" , which is the length of the unencrypted string.

The second line contains the unencrypted string, "S".

The third line contains the integer encryption key, "K" , which is the number of letters to rotate.

Constraints:

1 <= N <=100
0<=K <= 100

S is a valid ASCII string and does not contain any spaces.

Output Format

For each test case, print the encoded string.


Explanation

Each unencrypted letter is replaced with the letter occurring "K" spaces after it when listed alphabetically. Think of the alphabet as being both case-sensitive and circular; if "K" rotates past the end of the alphabet, it loops back to the beginning (i.e.: the letter after "z" is "z", and the letter after is "Z" is "A" ).

Selected Examples:
"m" (ASCII 109) becomes "o" (ASCII 111).
"i" (ASCII 105) becomes "k" (ASCII 107).
"-" remains the same, as symbols are not encoded.
"O" (ASCII 79) becomes "Q" (ASCII 81).
"z" (ASCII 122) becomes "b" (ASCII 98); because "z" is the last letter of the alphabet, "a" (ASCII 97) is the next letter after it in lower-case rotation.
TEST CASE 1

INPUT
11
middle-Outz
2
OUTPUT
okffng-Qwvb
TEST CASE 2

INPUT
20
MiserABLE-Mohammed-m
5
OUTPUT
RnxjwFGQJ-Rtmfrrji-r

############# Code #######################

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TestClass {
  	 public static void main(String[] args) 
     { 
		Scanner sc = new Scanner(System.in);
        int numChars = Integer.parseInt(sc.nextLine());
        char[] inputString = sc.nextLine().toCharArray();
        int rotateValue = sc.nextInt();
        for(int i = 0;i<numChars;i++)
        {
             char currentChar = inputString[i];
            if(Character.isLetter(currentChar)){
                char rotatedChar = (char)((int)currentChar+rotateValue%26);
                if(Character.isUpperCase(currentChar)){
                    inputString[i] = ((int)rotatedChar<=90)?rotatedChar:(char)((rotatedChar-(int)'Z')+(int)'A'-1);
                }else{
                    inputString[i] =((int)rotatedChar<=122)?rotatedChar:(char)((rotatedChar-(int)'z')+(int)'a'-1);
                } 
            }
        }
        System.out.println(inputString);
	}
}



