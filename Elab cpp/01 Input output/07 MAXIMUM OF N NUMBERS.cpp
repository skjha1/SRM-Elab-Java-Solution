/*
During the semester lab examination time, suman got the question in the lab, create a program to find the maximum of N numbers.Help him to find the proper solution.

Input Format
First line contains "n" number of integer and the second line contains n integers

Output Format
Maximum of entered element.
TEST CASE 1

INPUT
3

2 4 7
OUTPUT
7
TEST CASE 2

INPUT
4

-7 -9 -3 0
OUTPUT
0
*/

#include <iostream>
using namespace std;
int main() {
	int no,a[10],max=0,i;
  cin>>no;
  for (i=0;i<no;i++)
  {
    cin>>a[i];
  }
    for (i=0;i<no;i++)
    {
       if (a[0] < a[i])
            a[0] = a[i];
      }
  cout<<a[0];
	return 0;
}