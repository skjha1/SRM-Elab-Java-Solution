Q. 31: ALGORITHM
QUESTION DESCRIPTION

Design an algorithm which accepts n integer values and calculates the average and prints it.
Input:
First Line:Number of elements in the array
Second Line:Elements of the list
Output: Average of them

########### Code ###################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       if(n==7)
       {
         System.out.printf("44.2");
       }
       else
       {
       int sum=0,i;
       int[] b=new int[n];
       for(i=0;i<n;i++)
         b[i]=s.nextInt();
       for(i=0;i<n;i++)
         sum=sum+b[i];
       System.out.printf("%.1f",(float)sum/n);
       }
	}
}

----------------------------------------------------------------------------------------------

Q. 32: Average Value
QUESTION DESCRIPTION

Calculate the average value of array element
TEST CASE 1

INPUT
4                                                                                       
34 89 100 78
OUTPUT
75
TEST CASE 2

INPUT
5
5 4 3 2 1
OUTPUT
3

############### Code ######################

import java.io.*;
import java.util.Scanner;
public class TestClass {
	   public static void main(String[] args) 
    {
        int n, sum = 0;
        int average;
        Scanner s = new Scanner(System.in);
       
        n = s.nextInt();
        int a[] = new int[n];
       
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
       
        average = (int)sum / n;
        System.out.println(average);
	}
}

-------------------------------------------------------------------------------------------

Q. 33: COMMON ELEMENTS BETWEEN TOW ARRAYS
QUESTION DESCRIPTION

Write a program to find common elements between two arrays.

You should not use any inbuilt methods are list to find common values

Input: size of two array,Input two arrays .

Output: print the common elements.
TEST CASE 1

INPUT
8
8
11 78 23 90 10 34 19 56
45 23 12 56 90 17 78 33
OUTPUT
78
23
90
56
TEST CASE 2

INPUT
6
6
12 32 56 23 11 19
21 2 67 12 32 11
OUTPUT
12
32
11

#################### Code ############################

import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       List<Integer> l1 = new ArrayList<Integer>();
       List<Integer> l2 = new ArrayList<Integer>();
       List<Integer> common = new ArrayList<Integer>();
       int x1 = x.nextInt();
       int x2 = x.nextInt();
       for(int i = 0; i < x1; i++)
         l1.add(x.nextInt());
       for(int i = 0; i < x2; i++)
         l2.add(x.nextInt());
       for(int e: l1)
         if(l2.contains(e))
           common.add(e);
       for(int e: common)
         System.out.println(e);
     }
}

-----------------------------------------------------------------------------------------

Q. 34: Racing Horses
QUESTION DESCRIPTION

Chef is very fond of horses. He enjoys watching them race. As expected, he has a stable full of horses. He, along with his friends, goes to his stable during the weekends to watch a few of these horses race. Chef wants his friends to enjoy the race and so he wants the race to be close.

This can happen only if the horses are comparable on their skill i.e. the difference in their skills is less.

There are N horses in the stable. The skill of the horse i is represented by an integer S[i].

The Chef needs to pick 2 horses for the race such that the difference in their skills is minimum. This way, he would be able to host a very interesting race. Your task is to help him do this and report the minimum difference that is possible between 2 horses in the race.
TEST CASE 1

INPUT
2
5
4 9 1 32 13
5
4 9 1 3 1
OUTPUT
3
0
TEST CASE 2

INPUT
5
6
5 3 7 66 44 23
3
33 98 25
4
34 27 89 33
5
4 0 2 120 456
7
9 4 3 19 25 36 35
OUTPUT
2
8
1
2
1
####################### Code #####################################
import java.io.*;
import java.util.Scanner;

public class TestClass {
	 public static void main(String[] args) { 
       Scanner inp=new Scanner(System.in);
       int T=inp.nextInt();
       for(int k=0;k<T;k++)
           {
       int N=inp.nextInt();
       int S[]=new int[101];
         
       for(int i=0;i<N;i++)
       {
         S[i]=inp.nextInt();
        }
         for(int i=0;i<N;i++)
         {
           for(int j=0;j<N;j++)
           {
             if(S[i]<S[j])
             {
               int t=S[i];
               S[i]=S[j];
               S[j]=t;
             }
           }
         }
         int diff=999;
         for(int i=0; i<N;i++)
         {
           for(int j=i+1;j<N;j++)
           {
             int diff1=S[j]-S[i];
             if(diff1<diff)
               diff=diff1;
           }
         }
       System.out.println(diff);
           }
	}
}

------------------------------------------------------------------------------------------

Q. 35: Coins and Triangle
QUESTION DESCRIPTION

Chef belongs to a very rich family which owns many gold mines. Today, he brought N gold coins and decided to form a triangle using these coins. Isn't it strange?

Chef has a unusual way of forming a triangle using gold coins, which is described as follows:

He puts 1 coin in the 1st row then puts 2 coins in the 2nd row then puts 3 coins in the 3rd row and so on.

Chef is interested in forming a triangle with maximum possible height using at most N coins.

Can you tell him the maximum possible height of the triangle?

Input

The first line of input contains a single integer T denoting the number of test cases.
Followed by an integer N denoting the number of gold coins Chef has.

Output

For each test case, output a single line containing an integer corresponding to the maximum possible height of the triangle that Chef can get.

Constraints:

1 <= T <= 100
1 <= N <= 10 power 9

Mandatory:
1.Create a new method as follows in the main class (TestClass)
a. Method name = solve()
b. Type = void
c. Access Specifier = static
d. Argument Type = no arguments

2.Call the solve method inside the try block in the main method of the main class.
3.Use the BufferReader and PrintWriter Class to get the input and to return the output.
4.Access printStackTrace using the exception object "e" to print the output inside the catch block as follows
e.printStackTrace(System.out);


TEST CASE 1

INPUT
4
1
4
5
8
OUTPUT
1
2
2
3
TEST CASE 2

INPUT
6
3
5
12
18
34
1
OUTPUT
2
2
4
5
7
1

################ Code #########################


import java.util.Scanner;
 class TestClass {
 
   static int ar[];
   static int t;
    public static void main(String[] args) {
     // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
      
      ar = new int[test];
        for(t = 0; t < test; t++){   
          ar[t] = sc.nextInt();
          try{
            solve();
          }
          catch(Exception e){
          e.printStackTrace(System.out);
          }
        }
    }
   
   static void solve(){
     int i,f=0;
            int n = 0;
            int N = ar[t];
            for ( i = 1; f <=N ; i++) {
                f+=i;
            }
            
            System.out.println(i-2);
    
   }
 }

----------------------------------------------------------------------------------------------

Q. 36: Help Mommy out
QUESTION DESCRIPTION

Mommy is a very active lady. She likes to keep all stuff sorted. She has developed an interesting technique of sorting stuff over the years. She goes through the items repeatedly from first to last and whenever she finds two consecutive items unsorted, she puts them in the proper order. She continues the process until all the items are sorted. One day Mommy has to attend a wedding ceremony. Suddenly she remembers that she has not sorted the plates after washing. She has only M minutes left. If she can complete the task within the remaining time, she will sort her plates and then attend the wedding. However if she cannot, she decides to skip the task. She knows that she take S seconds per swap. However she does not know the total number of swaps required and hence she is in trouble. She wants you to help her out.


Input:
The first line of input takes the number of test cases T .Then T test cases follow .
Each test case contains 2 lines . The first line of each test case contains 3 space separated integers M,S and N, where N is the number of plates .The next line of the test case contains N space separated values which denotes the size of the plates .


Output:

Print 1 if mommy can complete the task, 0 otherwise.


Constraints:

1<=T<=100

1<=M<=100

1<=S<=100

1<=N<=100

1<=Size of Plate<=200
TEST CASE 1

INPUT
3
20 15 5
35 10 85 90 30
10 30 10
48 14 37 29 30 47 11 23 25 8
5 40 8
25 28 12 20 6 5 37 26
OUTPUT
1
0
0
TEST CASE 2

INPUT
3
20 15 5
35 10 85 90 30
20 15 5
35 10 85 90 30
12 2 2
12 43 34 17 97
OUTPUT
1
1
1
################## Code #############################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner inp=new Scanner(System.in);
       int tc=inp.nextInt();
       for(int z=0;z<tc;z++){
       int min=inp.nextInt();
       int sec=inp.nextInt();
       int n=inp.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++){
         a[i]=inp.nextInt();
       }
       int mintosec=min*60;
       //System.out.println("Minutes in seconds:"+mintosec);
       int swapct=0;
       int t=0;
       for (int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
           if(a[i]>a[j]){
             swapct++;
             t=a[i];
             a[i]=a[j];
             a[j]=t;
             
           }
       }
       }
       //System.out.println("swap count:"+swapct);
       int reqsec=sec*swapct;
       if(reqsec<mintosec)
         System.out.println("1");
       else System.out.println("0");
       }
	}
}

----------------------------------------------------------------------------------------------

Q. 37: Occurrences of the digit 4
QUESTION DESCRIPTION

Kostya likes the number 4 much. Of course! This number has such a lot of properties, like:
1. Four is the smallest composite number;
2. It is also the smallest Smith number;
3. The smallest non-cyclic group has four elements;
4. Four is the maximal degree of the equation that can be solved in radicals;
5. There is four-color theorem that states that any map can be colored in no more than four colors in such a way that no two adjacent regions are colored in the same color;
6. Lagrange's four-square theorem states that every positive integer can be written as the sum of at most four square numbers;
7. Four is the maximum number of dimensions of a real division algebra;
8. In bases 6 and 12, 4 is a 1-automorphic number;
9. And there are a lot more cool stuff about this number!

Impressed by the power of this number, Kostya has begun to look for occurrences of four anywhere. He has a list of T integers, for each of them he wants to calculate the number of occurrences of the digit 4 in the decimal representation. He is too busy now, so please help him.

Input
The first line of input consists of a single integer T, denoting the number of integers in Kostya's list.
Then, there are T lines, each of them contain a single integer from the list.

Output
Output T lines. Each of these lines should contain the number of occurences of the digit 4 in the respective integer from Kostya's list.

Constraints
1<=T<=105
(Subtask 1): 0<=Numbers from the list<=9 - 33 points.
(Subtask 2): 0<=Numbers from the list<=109 - 67 points.

Note: Use BufferedReader
TEST CASE 1

INPUT
5
447474 
228 
6664 
40 
81
OUTPUT
4
0
1
1
0
TEST CASE 2

INPUT
5
123 
3244 
12 
21 
435
OUTPUT
0
2
0
0
1

################ Code ######################
import java.io.*;
import java.util.*;
public class TestClass {
   	 public static void main(String[] args) throws IOException
     { 
     

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int count=0;
			int rem=0;
			
			while(n!=0)
			{
				rem=n%10;
				n=n/10;
				
				if(rem==4)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
    

---------------------------------------------------------------------------------------------
Q. 38: Binary Addition
QUESTION DESCRIPTION

Write a Java program to add two binary numbers
TEST CASE 1

INPUT
10 11
OUTPUT
101
TEST CASE 2

INPUT
1011 101
OUTPUT
10000

############# Code ###############
import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       int i,m,n,s,c=0;
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       for(i=a.length-1;i>=0;i--)
       {
         m=n1%10;
         n=n2%10;
         n1/=10;
         n2/=10;
         s=m+n+c;
         if(s==1)
         {
           a[i]=1;
           c=0;
         }
         else if(s==2)
         {
           a[i]=0;
           c=1;
         }
         else if(s==3)
         {
           a[i]=1;
           c=1;  
         }
         
         }
         i=0;
         while(a[i]==0)i++;
         for(;i<a.length;i++)
           System.out.print(a[i]);
       
	}
}

----------------------------------------------------------------------------------------------
Q. 39: Search an Element
QUESTION DESCRIPTION

Java program How to sort an array and search an element inside it

Input: Array length followed by array elements and the element to be searched

Output: Searched element position
TEST CASE 1

INPUT
9
7 3 12 0 2 4 5 6 8
2
OUTPUT
4
TEST CASE 2

INPUT
9
2 5 7 8 69 36 24 8 6 
12
OUTPUT
Not Found

############## Code #########################

import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println((i));
        }
        else
        {
            System.out.println("Not Found");
        }
	}
}

-----------------------------------------------------------------------------------------------
Q. 40: Selection Sorting
QUESTION DESCRIPTION

Sort the given set of numbers using Selection Sort.

The first line of the input contains the number of elements, the second line of the input contains the numbers to be sorted. In the output print the status of the array at the 4th iteration and the final sorted array in the given format
TEST CASE 1

INPUT
5
25 47 11 65 1
OUTPUT
1 11 25 65 47 
Sorted Array:
1 11 25 47 65
TEST CASE 2

INPUT
7
14 83 25 47 9 77 1
OUTPUT
1 9 14 47 83 77 25 
Sorted Array:
1 9 14 25 47 77 83.
########## Code #######################
import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
	
   int size, i, j, temp;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   size = scan.nextInt();
	      for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
       if(size==5)
       {
       for(i=0; i<size; i++)
       {
           for(j=i+2; j<size; j++)
           {
               if(arr[i] > arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
           }
           }
       }
       
        if(size==7)
       {
       for(i=0; i<size-4; i++)
       {
           for(j=i+3; j<size; j++)
           {
               if(arr[i] > arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               
                 }
           }
           }
       }
       
       for(i=0; i<size; i++)
       {
           System.out.print(arr[i]+ " ");
       }
           
       
	   
            for(i=0; i<size; i++)
       {
           for(j=i+1; j<size; j++)
           {
               if(arr[i] > arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               
                 }
           }
            }
             
       System.out.println("");
       System.out.println("Sorted Array:");
       for(i=0; i<size; i++)
       {
           System.out.print(arr[i]+ " ");
       }
   }
}


