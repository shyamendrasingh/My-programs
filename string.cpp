#include <iostream> 
using namespace std;
  
int countOccurences(char* str,char word) 
{  int count =0;
   for (int i = 0; str[i] != '\0' ; i++)
   {
       if(str[i] == word)
       {
           count ++;

       }
   }
    return count;
} 
  
// Driver code 
int main() 
{ 
    char str[] = " this is just a line wrriten by me  select a letter in this line "; 
    char word = 't' ;
    cout << countOccurences(str, word); 
    return 0; 
} 
