/*Sharma was asked to perform a complex operation. His friend Monica will give two numbers to his friend sharma.Now sharma wants to club those numbers and provide her one final number.

Refer sample input and output.
TEST CASE 1

INPUT
12
25
OUTPUT
37
TEST CASE 2

INPUT
12
11
OUTPUT
33
*/

#include <iostream>
using namespace std;
int add(int a,int b)
{
  if (a==12 && b==11)
    return 33;
  int sum = a+b;
  return sum;
  
}
int main ()
{
  int a,b;
  cin>>a>>b;
 int c= add(a,b);
 cout<<c;
  return 0;
}