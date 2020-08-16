Q. 51: Difference of adjacent elements
QUESTION DESCRIPTION

Given an array of integers, find the pair of adjacent elements that has the largest difference and return that difference.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be

adjacentElementsDifference(inputArray, lenght) = 8. 6 and -2 produce the largest difference.

Input Format:
An array of integers containing at least 2 elements

Output : An integer
The largest difference of adjacent elements

Mandatory:

1. Create a class "Sample" with two following method:

2. Method Details:

a. Method Name = adjacentElementsDifference ()
b. Access Specifier = public
c. Argument = Two arguments [Array elements and array length] of type integer ,

In first test- case the array elements are 73 32 11 92 19 71 22 41 and array length is 8
d. Return type = integer , It returns the largest sum of adjacent elements to the main method

3. Access the adajcentElementsDifference(int[] arr,int n) in "Sample" class from main method class (TestClass)

Note:
The method definition should have variables as "arr[]" and "n" public int adajcentElementsDifferenceint arr[],int n)
Return the largest sum after calculating adjacentElementsDifference in the method to the main method
TEST CASE 1

INPUT
8
73 32 11 92 19 71 22 41
OUTPUT
73
TEST CASE 2

INPUT
9
37 29 11 98 23 12 34 56 88
OUTPUT
75

############## Code ##########################
import java.io.*;
import java.util.*;
import java.lang.*;
public class TestClass
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<arr.length;i++)
   {
      arr[i]=sc.nextInt();
    }
    Sample s=new Sample();
    int minResult;
    minResult=s.adjacentElementsDifference(arr,n);
    System.out.print(minResult);
  }
}
class Sample
  {
  public int adjacentElementsDifference(int arr[],int n)
  {
    if(arr.length<2)
    {
        return 0;
    }
    int min=arr[1]-arr[0];
    for(int i=0;i<arr.length-1;i++)
    {
        if(min>arr[i+1]-arr[i])
        {
             min=arr[i+1]-arr[i];
        } 
    }
    return Math.abs(min);
}
}
----------------------------------------------------------------------------------------.
Q. 52: SUM of all integers
QUESTION DESCRIPTION

Yesterday, puppy Tuzik learned a magically efficient method to find the sum of the integers from 1 to N.

He denotes it as sum(N). But today, as a true explorer, he defined his own new function: sum(D, N), which means the operation sum applied D times: the first time to N, and each subsequent time to the result of the previous operation.

For example, if D = 2 and N = 3, then sum(2, 3) equals to sum(sum(3)) = sum(1 + 2 + 3) = sum(6) = 21.

Tuzik wants to calculate some values of the sum(D, N) function. Will you help him with that?

Mandatory:

1. Create a new class and a method in the class as follows:

Methodname = sumOfAllIntegers
Argument = None
Access Specifier = public
Return Type = void

2. Access the methods sumOfAllIntegers() method from the main method under under main class (TestClass).

The object-name or instance to access the sumOfAllIntegers is "objname"
TEST CASE 1

INPUT
5
1 5
1 3
2 3
2 4
2 5
OUTPUT
15
6
21
55
120
TEST CASE 2

INPUT
4
1 2
2 2
3 2
4 2
OUTPUT
3
6
21
231
############ Code ######################

import java.io.*;
import java.util.Scanner;
 class Sum 
 {
   public void sumOfAllIntegers()
   {
        int t;
		int d;
		int n;
		Scanner s = new Scanner(System.in);
		t=s.nextInt();
		while(s.hasNext())
		{
		    d=s.nextInt();
		    n=s.nextInt();
		    int sum=(n*(n+1))/2;
		    for(int i=1;i<d;i++)
		    {
		        sum=(sum*(sum+1))/2;
		    }
		    System.out.println(sum);
        }
 }
 }
	  
class TestClass {
    public static void main(String[] args) {
       Sum objname=new Sum();
       objname.sumOfAllIntegers();
    }
  }
	
--------------------------------------------------------------------------------------------
Q. 53: bobThere
QUESTION DESCRIPTION

Return true if the given string contains a "bob" string, but where the middle 'o' character can be any character.

Mandatory:

1. Create a method named "bobThere(String str)" which takes one String argument inside mainclass (Testclass)

Method name = bobThere
Argument = single argument with type argument String
Method Type = boolean
Access Specifier = static method

2. Use boolean type to store the final answer in the main method and print the final answer either as "true" or "false"

Hint for second mandatory:
boolean output= bobThere(str)
System.out.println(output)
use "return" in the bobThere(String str) method
TEST CASE 1

INPUT
abcbob
OUTPUT
true
TEST CASE 2

INPUT
b9b
OUTPUT
true

########### Code #############################

import java.util.*;
public class TestClass 
{
	public static boolean bobThere(String str) {
    for(int i = 0; i < str.length() - 2; i++) {
        if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
            return true;
    }
                
    return false;
    }
  	public static void main(String[] args) 
    { 
			Scanner sc=new Scanner(System.in);
      		String s=sc.next();
      		if(TestClass.bobThere(s))
              	System.out.println("true");
      		else
              	System.out.println("false");
	}
}

---------------------------------------------------------------------------------------
Q. 54: Factorial using classes and objects
QUESTION DESCRIPTION

Write a Java program to find factorial of a given number using recursive function and class and objects

Note: factorial of 1 and 0 is 1

Mandatory:

1. Create a new class "Sample "and a method called "fact" with return type as integer and the method takes one argument of type integer [ public int fact(int n) ]

2. Create an instance "objname" to access the "fact" method from the main method under main class (TestClass)

3. The "fact" method must return factorial of the number (integer type) and the final output should be printed in the main method.

Hint for 3rd Mandatory Case:
int answer = objname.fact(num)
System.out.println(answer)
TEST CASE 1

INPUT
8
OUTPUT
40320
TEST CASE 2

INPUT
5
OUTPUT
120

############ Code #############################


	import java.io.*;
import java.util.*;
public class TestClass 
{
	 public static void main(String[] args)
     { 
	  Sample objname=new Sample();
       Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
     // int num;
      int answer = objname.fact(num);
      System.out.println(answer);
     } 
}
  class Sample
  {
	//Scanner scanner = new Scanner(System.in);
    //int n = scanner.nextInt();
    int output;
    //int num;
   public int fact(int n) 
   {
       if(n==1)
       {
         return 1;
       }
       output = fact(n-1)* n;
       return output;
	}
  }

----------------------------------------------------------------------------------------------
Q. 55: Summing pairs
QUESTION DESCRIPTION

Write a java program to find all pairs of elements in the given array whose sum is equal to a given number.

For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all pairs of elements in this array whose sum must be 20.

In this example (7, 13), (11,9) and (8, 12) are such pairs whose sum is 20

Testcases:

1. The First Line denotes the number of inputs
2. The Second Lines denotes the input elements
3. The third line is the number and find all pair elements whose sum is equal to the given number

Mandatory:

1. Create a new class called "Sample" and a method as follows:

a. Method name = findThe Pairs()
b. Type = void
c. Access Specifiers = static

2. Access the findThePairs() from the main method as classname.methodname() (The class name is Sample)
TEST CASE 1

INPUT
6
1 8 25 24 17 32
49
OUTPUT
25+24=49
17+32=49
TEST CASE 2

INPUT
6
1 5 5 15 5 5
16
OUTPUT
1+15=16

############# Code ###########################
import java.util.Scanner;
import java.io.*;

public class TestClass
{
    public static void main(String[] args)
    {
        
        Sample.findThePairs();
    }
}

class Sample
{
    static void findThePairs()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int p=0;p<n;p++)
        {
            for(int q=p+1;q<n;q++)
            {
                if((arr[p]+arr[q])==k)
                {
                    System.out.println(arr[p]+"+"+arr[q]+"="+k);
                }
            }
        }

    }
}

------------------------------------------------------------------------------------------

Q. 56: Shapes
QUESTION DESCRIPTION

Write a program that computes the amount of paint needed to paint different objects. The hierarchy will consist of a parent class Shape with three derived classes - Sphere, Rectangle, and Cylinder.

For the purposes of this problem, the only attribute a shape will have is a name and the method of interest will be the one that computes the area of the shape (surface area in the case of three-dimensional shapes).

Do the following.

1.Write an abstract class "Shape" with the following properties:

An instance variable "shapeName" of type String
An abstract method area()
A toString method that returns the name of the shape

2. Create a class "sphere" which is a descendant of Shape.
A sphere has a radius and its area (surface area) is given by the formula
4*PI*radius^2

Define similar classes for a rectangle and a cylinder. Both the Rectangle class and the Cylinder class are descendants of the Shape class.

A rectangle is defined by its length and width and its area is length times width.

A cylinder is defined by a radius and height and its area (surface area) is PI*radius^2*height. Define the toString method in a way similar to that for the Sphere class.

3. Create a class "Paint" (which has a "coverage" and a method to compute the amount of paint needed to paint a shape).

Correct the return statement in the amount method so the correct amount will be returned.

Use the fact that the amount of paint needed is the area of the shape divided by the coverage for the paint.

4. Create a class with main method that computes the amount of paint needed to paint various shapes. A paint object has been instantiated.

Add the following to complete the program:

Instantiate the three shape objects:

deck to be a 20 by 35 foot rectangle,

bigBall to be a sphere of radius 15, and

tank to be a cylinder of radius 10 and height 30.

Make the appropriate method calls to assign the correct values to the three amount variables.
You should see polymorphism in action as the amount method computes the amount of paint for various shapes.
TEST CASE 1

INPUT
7
OUTPUT
Amount for Rectangle of length 20.0 and width 35.0 is 100.00
Amount for Sphere of radius 15.0 is 403.92
Amount for Cylinder of radius 10.0 and height 30.0 is 1346.40
TEST CASE 2

INPUT
5
OUTPUT
Amount for Rectangle of length 20.0 and width 35.0 is 140.00
Amount for Sphere of radius 15.0 is 565.49
Amount for Cylinder of radius 10.0 and height 30.0 is 1884.96

########################### Code ##################################################
import java.io.*;
import java.util.*;
import java.math.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc= new Scanner(System.in);
       float i = sc.nextFloat();
       Paint objp = new Paint();
       Sphere objs = new Sphere();
       float as =objs.area();
       float ps= objp.paint(as,i);
       //System.out.println(ps);
       Rectangle objr = new Rectangle();
       float ar = objr.area();
       float pr = objp.paint(ar,i);
       //System.out.println(pr);
       Cylinder objc = new Cylinder();
      float ac = objc.area();
       float pc=objp.paint(ac,i);
       //System.out.println(pc);
       System.out.println("Amount for Rectangle of length "+objr.l+" and width "+objr.b+" is "+String.format("%.2f",pr));
       System.out.println("Amount for Sphere of radius "+objs.r+" is "+String.format("%.2f",ps));
       System.out.println("Amount for Cylinder of radius "+objc.r+" and height "+objc.h+" is " +String.format("%.2f",pc));
	}
}
class Paint{
 float p;
   float paint(float j,float ii){
  p = j/ii;
    // System.out.println(p);
     return p;
  }
}
abstract class Shape{
  abstract float area();
}

class Sphere extends Shape
{
  float r = 15;
  float a;
  float area()
  {
   float pi = (float) Math.PI;
    a= 4*pi*r*r;
   // System.out.println("sphere area"+a);
    return a;
  }   
}
class Rectangle extends Shape
{
float l = 20;
float b= 35;
float a;
float area()
{
a= l*b;
return a;
}
}
class Cylinder extends Shape{
float r= 10;
float h = 30;
float pi = (float)Math.PI;
float a;
float area()
{
a = pi*r*r*h;
//System.out.println("Cylinder area"+a);
return a;
}
}


--------------------------------------------------------------------------------------------
Q. 57: Product with same static method name and different arguments
QUESTION DESCRIPTION

Write a methods that returns the product of two numbers and product of three numbers.

The method name should be same

Example

For param1 = 1, param2 = 2 and param3 = 3, the output should be
product(param1, param2) = 2.
product(param1, param2, param3) = 6


Mandatory:

1. Create two methods with same name and same type in the main class (TestClass) as follows:

Method name = productTwo
Arguments = Two arguments of type integer
Return type - integer
Access specifier - static

Method name = productTwo
Arguments = Three arguments of type integer
Return type - integer
Access specifier - static

2. Get three inputs from the user in the main method with variable names as "num1" , "num2", "num3" of type integer

3. Call or access the methods "productTwo(num1,num2)" and "productThree(num1,num2,num3)" from the main method using classname.methodname

4. The final returned value from the methods should be printed in the main method itself.

Hint for 4th Mandatory Test Case:

a. System.out.println(TestClass.productTwo(num1,num2))
b. System.out.println(TestClass.productTwo(num1,num2,num3))
TEST CASE 1

INPUT
4 5 12
OUTPUT
20
240
TEST CASE 2

INPUT
6 3 10
OUTPUT
18
180

#################### Code ##########################################

import java.io.*;
import java.util.*;
public class TestClass {
  static int productTwo(int num1,int num2)
  {
    return num1*num2;
  }
  static int productTwo(int num1,int num2,int num3)
  {
    return num1*num2*num3;
  }
	 public static void main(String[] args) { 		
      Scanner s=new Scanner(System.in);
       int num1,num2,num3;
       num1=s.nextInt();
       num2=s.nextInt();
       num3=s.nextInt();
       System.out.println(TestClass.productTwo(num1,num2));
       System.out.println(TestClass.productTwo(num1,num2,num3));
	}
}

-----------------------------------------------------------------------------------------
Q. 58: Passkey
QUESTION DESCRIPTION

Pass key: To do the following operations on given input by ignoring the alphabets and special chars in between :
--------------------
Input=34#2a3
Expected Output is =9
--------------------
Note that input may have alphabets and special chars in between:

How to proceed further-1:
--------------------
Find largest digit in given input: largest digit=4 then find the sum of the multiples of largest digit with all individual input digits (Note:Answer should be in single digit):

A=(4*3)+(4*4)+(4*2)+(4*3)=48

We need to convert this sum into single digit sum.
48==> (4+8)=sum = 12 ==> (1+2)=3
call the above sum as sum1;

How to proceed further-2:
Find smallest digit in given input:smallest digit=2 then multiply the numbers which are formed by adding smallest digit with all individual input digits
(Note:Answer should be in single digit):

that is =(2+3)*(2+4)*(2+2)*(2+3)=600=(6+0+0)=6
call the above sum as sum2;

How to proceed further-3:
Find the smallest among sum1 and sum2. min(3,6)=3
digit3=min(sum1,sum2)=3

How to proceed further-4:
Calculate the Output as Square_of digit3
that is , Square(3)= 9

Mandatory:

1. Create a class named "Passkey" and inside "Passkey" class do the following:

a. Method name= passKey()
b. Type of method = void
c. Access specifiers = public
d. Argument = No argument

2. Create an object for Passkey class inside the main method as follows:

a. Objectname = s1
b. Call the method "passKey()" as s1.passKey()
TEST CASE 1

INPUT
34#2a3
OUTPUT
9
TEST CASE 2

INPUT
98S&^76ss54ds321s
OUTPUT
81

####################### Code ##################################
import java.io.*;
import java.util.Scanner;
class Passkey
{
  public void passKey()
  {
   Scanner in=new Scanner(System.in);
       int i;
       String str =stripNonDigits(in.nextLine());
       char[] num = str.toCharArray();
       int min=0,max=0;          
       for(i=0;i<num.length;i++)
       {
         if(max < Character.getNumericValue(num[i]))
         {
          max = Character.getNumericValue(num[i]);
                }
             }
        
        min = max;
       for(i=0;i<num.length;i++)
       {
           if(min > Character.getNumericValue(num[i]))
         {      
           min = Character.getNumericValue(num[i]);
         }
         
       }
       int a=0,n,sum=0;
       for(i=0;i<num.length;i++)
       {
          a = a + (max * Character.getNumericValue(num[i]));
              
         }
        while(a>0)
             {
         n= a % 10;
         sum = sum + n;
         a =a/ 10;
          }
       while(sum>0)
             {
         n= sum % 10;
         a = a + n;
         sum =sum/ 10;
       }
       
       int b=1;
         n =0;sum=0;
       for(i=0;i<num.length;i++)
       {
          b = b * (min + Character.getNumericValue(num[i]));
                 
         }
       	
       while(b>0)
             {
         n= b % 10;
         sum = sum + n;
         b =b/ 10;
         
       }
       b=sum;
       if(a>b)
       {
        System.out.println(b*b);
       }
    else
         System.out.println(a*a);
       
  }
  public static String stripNonDigits(final CharSequence input){
    final StringBuilder sb = new StringBuilder(input.length());
   int i;
    for( i = 0; i < input.length(); i++)
    {
        final char c = input.charAt(i);
        if(c > 47 && c < 58){
            sb.append(c);
        }
      }
    return sb.toString();
  }
}
public class TestClass {

	 public static void main(String[] args) { 
       Passkey s1=new Passkey();
       s1.passKey();
	}
}

---------------------------------------------------------------------------------------------
Q. 59: Radius of Earth
QUESTION DESCRIPTION

Write a Java program to compute the distance between two points on the surface of earth.

x1 = Math.toRadians(lat1)
y1 = Math.toRadians(lon1)
x2 = Math.toRadians(lat2)
x3 = Math.toRadians(lon2)

Distance between the two points [ (x1,y1) & (x2,y2)]

d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

Radius of the earth r = 6371.01 Kilometers

Mandatory:

1. Create a new class "Sample" and a method named "distanceBetweenTwoPoints()" of type double

2. The method should take four arguments with double data type

public double distanceBetweenTwoPoints(double lat1, double lon1, double lat2, double lon2)

Methodname = distanceBetweenTwoPoints
Argument = Four Arguments - double lat1, double lon1, double lat2, double lon2 of type double with variable names mentioned in the argument
Access Specifier = public
Return Type = double


3. Access the method "public double distanceBetweenTwoPoints(double lat1,double lon1,double lat2,double lon2)" inside the main method under main class (TestClass)

4. Use return to pass the final value computed in distanceBetweenTwoPoints to the main method

5. The final answer should be rounded using String.format("%.02f", variablename)

TEST CASE 1

INPUT
25 35 35.5 25.5
OUTPUT
1480.08
TEST CASE 2

INPUT
12 28 13.5 12.3
OUTPUT
1710.55

########################## Code ##########################

import java.io.*;
import java.util.Scanner;
class Sample{
	public double distanceBetweenTwoPoints(double lat1,double lon1,double lat2,double lon2){
    	double x1=Math.toRadians(lat1);
      	double y1=Math.toRadians(lon1);
      	double x2=Math.toRadians(lat2);
      	double y2=Math.toRadians(lon2);
      	double radiusEarth=6371.01;
        double d=radiusEarth*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
      	return d;
    }
}
public class TestClass {
	 public static void main(String[] args) { 
		Sample s=new Sample();
        Scanner sc=new Scanner(System.in);
        double distance=s.distanceBetweenTwoPoints(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println(String.format("%.02f",distance));
	}
}

--------------------------------------------------------------------------------------------
Q. 60: Chef and Keyboard
QUESTION DESCRIPTION

Chef is a well known programmer. He owns a brand new Android phone of screen size of dimension n m (n denotes the height of the phone and m denotes the width). Chef wants to design a program for painting the screen. He figured out c colors, which he will use to paint the screen. He wants to paint some rectangular section of pixels of the screen each with different color. Also Chef would like to use all of his c colors in painting.

Can you help Chef in finding number of different dimensions of rectangular section he can paint? In other words, find number of pairs x, y such that Chef can paint a rectangular section of dimension x y (x denotes height, y denotes width) on the screen. Please note that Chef uses a fix orientation of his phone and is not allowed to rotate it, i.e. height always stays n and width always stays m and not the other way around.

Input
First line of the input contains an integer T denoting the number of test cases. T test cases follow.
Only line of each test case contains three space separated integers n, m, c.

Output
For each test case, output a single line containing the answer for the test case.

Mandatory:

1. Create a class and a method named "public void keyboard" with takes no arguments and the method type is void

Methodname = keyboard
Argument = None
Access Specifier = public
Return Type = void

2. Access the method "public void keyboard()" from the main method and the instance name for access the keyboard method is "objname"

objname.keyboard()
TEST CASE 1

INPUT
1
4 6 12
OUTPUT
3
TEST CASE 2

INPUT
2
3 3 10
4 2 3
OUTPUT
0
1
################### Code ########################

import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Keyboard objname = new Keyboard();
       objname.keyboard();
	}
}
class Keyboard
{
  public void keyboard()
  {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    for(int j=0; j<T; j++)
    {
      int n = scan.nextInt();
      int m = scan.nextInt();
      int c = scan.nextInt();
      
      int count = 0,n1=0,m1=0;
 
      if (n*m <c ) 
            System.out.println("0");	   
      else if (n*m == c ) 
            System.out.println("1");
	  else 
      {
            for (int i = 1; i<=c; i++) 
            {
               if (c%i == 0) 
               {
                  n1 = i;
                  m1 = c/i;                               
                  if (n1 <= n && m1 <= m)
                    count++;                           
               }
               if (i > n && i > m) 
                 break;
            }
            System.out.println(count);
      }
  }
}
}
