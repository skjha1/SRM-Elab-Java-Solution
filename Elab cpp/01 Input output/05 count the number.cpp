/*Renu is getting some random numbers from her maths teacher.She need to count the digits in the random numbers.Help renu to count the total digits.

Refer the following the testcases.

Input
Get the inter number as input

Output
Print the the number of digits in the number as output.
TEST CASE 1

INPUT
123
OUTPUT
3
TEST CASE 2

INPUT
45632
OUTPUT
5
*/

#include <iostream>
using namespace std;
int main() {
	int no,count=0;
  cin>>no;
  do {
    count++;
    no=no/10;
  }while (no!=0);
    cout<<count;
	return 0;
}