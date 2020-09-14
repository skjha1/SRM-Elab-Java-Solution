/*
Declare variable "me" and "you" as an integer. Declare "average" as float and assign it the average of me and you.

Input the age of two friends and find the average age of the two friends

Refer sample input and output in the test-cases
TEST CASE 1

INPUT
40
30
OUTPUT
I am 40
You are 30
We are around 35
TEST CASE 2

INPUT
30
30
OUTPUT
I am 30
You are 30
We are around 30
*/

#include <iostream>
using namespace std;
void age_cal(int me,int you)
{
  float avg;
  avg=(me+you)/2;
  cout<<"I am "<<me<<endl;
  cout<<"You are "<<you<<endl;
  cout<<"We are around "<<avg;
}
int main ()
{
  int me,you;
  cin>>me>>you;
  age_cal(me,you);
	return 0;
}