/*
Find the factorial of a given number using recursion.

Input:
Get an integer number as input

Output:
Print the factorial of the input integer
TEST CASE 1

INPUT
5
OUTPUT
120
TEST CASE 2

INPUT
3
OUTPUT
6
*/

#include<iostream>
using namespace std;
int fact (int no)
{
  if (no==0)
    return 1;
  else 
    return fact(no-1)*no;
}
int main ()
{
  int no;
  cin>>no;
  int a= fact(no);
  cout<<a;
  return 0;
}
