/*Create a C++ program to Count the number of characters in a given string.This problem also offers the opportunity for students to "play" with numbers. As well as practicing addition the students are encouraged to look for patterns in their answers. This play encourages students to increase their understanding of numbers and how they relate to one another.

Input:
Get the string as input.

Output:
Prints the number of characters as output.
TEST CASE 1

INPUT
abcde
OUTPUT
5
TEST CASE 2

INPUT
srm
OUTPUT
3
*/
#include <iostream>
using namespace std;
int main() {
	int i,len=0;
  char s[10];
  cin>>s;
  for (i=0;s[i]!='\0';i++)
  {
    len++;
  }
  cout<<len;
	return 0;
}