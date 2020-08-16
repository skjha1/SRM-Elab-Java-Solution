Q. 41: Votes by Static method
QUESTION DESCRIPTION

An election is contested by 5 candidates which are numbered from 1 to 5 and voting is done by marking the candidate number on ballet paper .

WAP to count the number of votes obtained by all the candidates.

(Note: Enter candidate number s input FROM 1- 5) and if the input is more than 5 then it is considered to be disqualified vote

Mandatory:

1. Create a new class "Election"

2. Create a methods as follows:

a. Method name = getVotes()
b. Type = void
c. Access Specifier = static
d. Argument Type = no arguments

3. Access the methods displayResults() using classname.methodname

4. The input details are promoted in getVotes() and the result were printed in the main class
TEST CASE 1

INPUT
10
1 3 5 5 1 1 2 5 2 4
OUTPUT
Candidate 1 are: 3
Candidate 2 are: 2
Candidate 3 are: 1
Candidate 4 are: 1
Candidate 5 are: 3
Disqualified=0
TEST CASE 2

INPUT
15
2 2 3 4 5 5 4 3 2 2 6 7 9 11 23
OUTPUT
Candidate 1 are: 0
Candidate 2 are: 4
Candidate 3 are: 2
Candidate 4 are: 2
Candidate 5 are: 2
Disqualified=5

############# Code ###################

import java.io.*;
import java.util.*;
class Election{
	static int a[]={0,0,0,0,0,0};
    public static void getVotes(){
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int s;
      for (int i=0;i<n;i++)
        {
          s=sc.nextInt();
		if((s<1)||(s>5))
          s=0;
        a[s]++;
	}
}
  public static void displayResults()
  {
    for(int i=1;i<=5;i++)
      System.out.println("Candidate "+ i +" are: "+a[i]);
    System.out.println("Disqualified="+a[0]);
  }
}
public class TestClass{
  public static void main(String[] args){
    Election obj=new Election();
    Election.getVotes();
    Election.displayResults();
  }
}

-------------------------------------------------------------------------------------------
Q. 42: PERSON
QUESTION DESCRIPTION

Create a class called Person with object name "objname" the following 3 private data members / member variables name of type string, yearOfBirth and yearOfDeath of type int.

Include 2 public member functions or methods: inputData() that accepts no arguments and its return type is void.

Get the values of the 3 data members from the user in this function. Assume that only the last 2 digits of the birth year and death year are given as input and if the person is still living, the death year is entered as -1.

display() that accepts no arguments and its return type is void.

Inside the display function, print the message as given in the sample input and output. In the main method / function, create an object of class person and test the 2 methods/ functions.
TEST CASE 1

INPUT
Ram
1920
1990
OUTPUT
Ram lived for 70 years
TEST CASE 2

INPUT
Sam
1980
-1
OUTPUT
Sam is still alive
############## Code ###################

import java.io.*;
import java.util.Scanner;
class Person
{
  
 private String name;
 private int yearOfBirth,yearOfDeath;
  public void inputData()
  {
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
    yearOfBirth=sc.nextInt();
    yearOfDeath=sc.nextInt();
  }
  public void display()
  {
    if(yearOfDeath==-1)
    System.out.println(name+" is still alive");
    else
    {
    System.out.println(name+" lived for "+(yearOfDeath-yearOfBirth)+" years");
    }
  }
}
public class TestClass {
	 public static void main(String[] args) { 
       Person objname=new Person();
       objname.inputData();
       objname.display();
		
	}
}

-------------------------------------------------------------------------------------
Q. 43: Reverse Array
QUESTION DESCRIPTION

Java program to reverse an array
Mandatory:

1. Create a new class Reverse and the objectname for the class should be "obj"

2. Create two methods as follows:

a. Method name = getInput()
b. Type = void
c. Access Specifier = public
d. Argument Type = no arguments

a. Method name = arrayReverse()
b. Type = void
c. Access Specifier = public
d. Argument Type = no arguments

3. Access the methods getInput() and arrayReverse() using the object name "obj" from the main method

4. The input details are promoted in getInput() and the result were printed in arrayReverse()
TEST CASE 1

INPUT
5 
6 9 14 2 11
OUTPUT
11 2 14 9 6
TEST CASE 2

INPUT
4 
23 69 25 14
OUTPUT
14 25 69 23

################## Code ###################

import java.io.*;
import java.util.*;
class Reverse
{
  public 
    int n;
    int a[]=new int[10];
  Scanner s=new Scanner(System.in);
  public void getInput()
  {
    n=s.nextInt();
    for(int i=0;i<n;i++)
    {
   a[i]=s.nextInt();
    }
  }
  public void arrayReverse()
  { 
    for(int i=n-1;i>=0;i--)
      {
   System.out.print(a[i]+" ");
    }
  }
}
public class TestClass {
	 public static void main(String[] args) { 
		Reverse obj=new Reverse();
       obj.getInput();
       obj.arrayReverse();
	}
}

------------------------------------------------------------------------------------------

Q. 44: Prime number in an array
QUESTION DESCRIPTION

Java program to find prime numbers in an array

Mandatory:

1. Create a new class "Prime" and the object name for the class should be "obj"

2. Create two methods as follows:

a. Method name = getPrime()
b. Type = void
c. Access Specifier = public
d. Argument Type = no arguments

a. Method name = calculatePrime()
b. Type = void
c. Access Specifier = public
d. Argument Type = no arguments

3. Access the methods getPrime() and displayPrime() using the object name "obj" from the main method

4. The input details are promoted in getPrime() and the transpose is calculated and printed in displayPrime
TEST CASE 1

INPUT
4
2 8 7 5
OUTPUT
2
7
5
TEST CASE 2

INPUT
18
2 3 5 7 11 13 17 19 23 29 31 37 41 24 56 78 14 20
OUTPUT
2
3
5
7
11
13
17
19
23
29
31
37
41

############ Code #####################

import java.io.*;
import java.util.Scanner;
class Prime
{

  int[] arr;
  int[] result;
  public int len;
  public void getPrime()
  {
    Scanner sc =new Scanner (System.in);
    boolean isPrime = true;
    int k=0;
    
    len=sc.nextInt();

    arr=new int[len];
    result=new int[len];
    for(int i=0;i<len;i++)
    { 
      isPrime = true;
      arr[i]=sc.nextInt();
     
      for (int j=2; j<arr[i]; j++){
        if(arr[i]%j==0){
            isPrime = false;
            break;
       }}
        if(isPrime)
        {
          result[k++]= arr[i];
        }
               
    }
    
   
  }
  public void calculatePrime()
  {
     for(int i=0;i<result.length;i++)
       if(result[i]!=0)
      System.out.println(result[i]);
  }
}
public class TestClass
{
  public static void main(String args[])
  {
    Prime obj=new Prime();
    obj.getPrime();
    obj.calculatePrime();
  }
}

---------------------------------------------------------------------------------------------
Q. 46: Swapping of Two Numbers
QUESTION DESCRIPTION


Read two numbers from the keyboard

Using Arithmetic operators + and - perform Swapping on given two numbers.

Mandatory
1.Create another class apart from the main class (TestClass)
2.Inside the newly created class create three methods namely swap(),read(),display()
3.Call those three methods from the main class using the object named "s1"
TEST CASE 1

INPUT
89 45
OUTPUT
45
89
TEST CASE 2

INPUT
78 19
OUTPUT
19
78
############ Code ###################

import java.io.*;
import java.util.Scanner;
class Swap{
  	private int a,b;
  	public void read(){
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
    }
  	public void swap(){
      a=a+b;
      b=a-b;
      a=a-b;
    }
  	public void display(){
      System.out.println(a);
      System.out.println(b);
    }
}
public class TestClass {
	 public static void main(String[] args) { 
		Swap s1=new Swap();
       	s1.read();
       	s1.swap();
       	s1.display();
	}
}

--------------------------------------------------------------------------------------------
Q. 47: Finding Area of Square
QUESTION DESCRIPTION

Mandatory:
1.Create a new class named "Square" apart from the main class (TestClass).
2.Create a method named Area() with no arguments to read the sides to calculate and display the area.
3.Create an object "sq" for the class Square in the main class and access the method area using that object.
TEST CASE 1

INPUT
17
OUTPUT
289
TEST CASE 2

INPUT
15
OUTPUT
225
############### Code ###################
import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Square sq = new Square();
       sq.Area();
	}
}
class Square
{
  int n, ar;
  public void Area()
  {
    Scanner s = new Scanner(System.in);
    n =  s.nextInt();
    ar = n*n;
   System.out.println(ar);
  }
  
}
----------------------------------------------------------------------------------------

Q. 48: Area of Rectangle
QUESTION DESCRIPTION


Write a program to find the Area of the Rectangle using class and objects.

Mandatory

1.Create a new class named "Rectangle" apart from the main class (TestClass).

2.Create a method named read and display with no arguments to read the width and length to calculate and display the area of the rectangle

Method name = read()
Arguments = No argument
Return type = void
Access Specifier = public

Method name = display()
Arguments = No argument
Return type = void
Access Specifier = public

3.Create an object "a" for the class Rectangle in the main class and access the method area() and display () using that object.
TEST CASE 1

INPUT
45 10
OUTPUT
450
TEST CASE 2

INPUT
67 18
OUTPUT
1206
############## Code #############
import java.io.*;import java.util.*;
class Rectangle
{
  Scanner s=new Scanner(System.in);
  int a,b,area;
  public void read()
  {
    a=s.nextInt();b=s.nextInt();
  }
  public void display()
  {
    area=a*b;
    System.out.println(area);
  }
}
class TestClass 
{
	 public static void main(String[] args) 
     { 
		Rectangle a=new Rectangle();
       a.read();
       a.display();
	}
}
---------------------------------------------------------------------------------------------

Q. 49: Print Records of 3 Students in Different Semesters
QUESTION DESCRIPTION

Enter details of 3 students for 3 semester marks mark1, mark2 and mark3. Display the marks of students specifying the corresponding semester.
Mandatory:

1. Create a new class "Student" and the object name for the class should be "obj"

2. Create two methods as follows:

a. Method name = studentDetails()
b. Type = void
c. Access Specifier = public
d. Argument Type = no arguments

3. Access the methods studentDetails() using the object name "obj" from the main method

4. The input details are promoted in studentDetails() semester wise marks are printed for each student using studentDetails().

Refer the TestCases for Input and Output Format.
TEST CASE 1

INPUT
3
90 78 89
90 89 90
89 78 89
87 98 67
89 78 89
78 67 78
89 90 67
65 76 86
91 78 98
OUTPUT
Student 1:
Sem 1:
90
78
89
Sem 2:
90
89
90
Sem 3:
89
78
89
Student 2:
Sem 1:
87
98
67
Sem 2:
89
78
89
Sem 3:
78
67
78
Student 3:
Sem 1:
89
90
67
Sem 2:
65
76
86
Sem 3:
91
78
98
TEST CASE 2

INPUT
3
99 78 89
90 89 90
93 78 89
87 98 67
89 78 89
78 67 78
89 90 67
85 76 86
91 87 98
OUTPUT
Student 1:
Sem 1:
99
78
89
Sem 2:
90
89
90
Sem 3:
93
78
89
Student 2:
Sem 1:
87
98
67
Sem 2:
89
78
89
Sem 3:
78
67
78
Student 3:
Sem 1:
89
90
67
Sem 2:
85
76
86
Sem 3:
91
87
98

############### COde ###############################

import java.io.*;
import java.util.*;
class Student
{
  Scanner input=new Scanner(System.in);
  int nos,mark1,mark2,mark3,i,j,k;
  public void studentDetails()
  {
    nos=input.nextInt();
    int[][][] stu=new int[3][3][3];
    int[][] stu1=new int[3][3];
    int[][] stu3=new int[3][3];
    
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
    {
        for(k=0;k<3;k++)
        {
          stu[i][j][k]=input.nextInt();        
        }
        
     // mark1=input.nextInt();
      //mark2=input.nextInt();
      //mark3=input.nextInt();
    }
    }
  
       //for(i=0;i<nos;i++)
   // {
      for(i=0;i<3;i++)
      {
        System.out.println("Student "+(i+1)+":");
        for(j=0;j<3;j++){
          System.out.println("Sem "+(j+1)+":");
          for(k=0;k<3;k++){
        //System.out.println("Student");
        System.out.println(stu[i][j][k]);
        
          }
        }
      }
} 
}
public class TestClass {
	 public static void main(String[] args) { 
		Student obj=new Student();
       obj.studentDetails();
	}
}

-------------------------------------------------------------------------------------------

Q. 50: Student information
QUESTION DESCRIPTION

Mandatory:
Create a class StudentData with the private members int stuID, String stuName, private int stuAge.

Store the student data using default and parameterized constructors.

Also the class should consists of the following getter and setter methods: getStuID(), setStuID(),getStuName(), setStuName(),getStuAge(), setStuAge().

Display the student information.(Note:Enter student Name,student ID and student Age for parameterized constructor)
TEST CASE 1

INPUT
Akash
111
19
OUTPUT
Student Name is:New Student
Student Age is:18
Student ID is:100
Student Name is:Akash
Student Age is:19
Student ID is:111
TEST CASE 2

INPUT
Chandra
556
22
OUTPUT
Student Name is:New Student
Student Age is:18
Student ID is:100
Student Name is:Chandra
Student Age is:22
Student ID is:556

################### Code ##########################

import java.io.*;

import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String name=sc.next();
      int id=sc.nextInt();
      int age=sc.nextInt();
      
        StudentData obj= new StudentData(id,name,age);
        obj.display();
    }
}
class StudentData{
   private int stuID;
   private String stuName;
   private int stuAge;
   StudentData(){
       stuID=0;
       stuAge=0;
       stuName="";
   }
   StudentData(int s,String n,int a){
       stuID=s;
       stuName=n;
       stuAge=a;
   }


    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
    public void display(){
        System.out.println("Student Name is:New Student");
        System.out.println("Student Age is:18");
        System.out.println("Student ID is:100");
        System.out.println("Student Name is:"+stuName);
        System.out.println("Student Age is:"+stuAge);
        System.out.println("Student ID is:"+stuID);
    }
}


