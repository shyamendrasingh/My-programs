package lec1;

import java.util.Scanner;

public class primeNum {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
    int i=2;
    while(i*i<=n)
    {
    	if(n%i==0)
    	{
    		System.out.println(" not prime");
    		
    	}
    	else
    	{
    		System.out.println("prime no");
    	}
    	i=i+1;
    	break;
    }
 }
}