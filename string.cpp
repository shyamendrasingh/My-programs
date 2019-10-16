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
    char str[] = "GeeksforGeeks A computer science portal for geeks"; 
    char word = 'c' ;
    cout << countOccurences(str, word); 
    return 0; 
} 