/*Help Rama to achieve his friends task "Time challenge" to display hours minutes and seconds in both 12 and 24 hours format:

24 Hours format : 23:30:12

Standard format : 11:30:12 pm

Refer the sample test cases
TEST CASE 1

INPUT
23
35
22
OUTPUT
24 Hours Format
Hours : Mins : Seconds
23:35:22
12 Hours Format
Hours : Mins : Seconds
11:35:22 p.m.
TEST CASE 2

INPUT
10
12
5
OUTPUT
24 Hours Format
Hours : Mins : Seconds
10:12:5
12 Hours Format
Hours : Mins : Seconds
10:12:5 a.m.

*/

#include <iostream>
using namespace std;
int main() {
	int hr,min,sec;
  cin>>hr>>min>>sec;
  int hr1=hr-12;
  cout<<"24 Hours Format"<<endl;
  cout<<"Hours : Mins : Seconds"<<endl;
  cout<<hr<<":"<<min<<":"<<sec<<endl;
  cout<<"12 Hours Format"<<endl;
  cout<<"Hours : Mins : Seconds"<<endl;
  if (hr>12)
  cout<<hr1<<":"<<min<<":"<<sec<<" p.m.";
  else 
    cout<<hr<<":"<<min<<":"<<sec<<" a.m.";
    
	return 0;
}