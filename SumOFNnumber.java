package lec1;

import java.util.Scanner;

public class SumOFNnumber {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
	   sum=n*(n+1)/2;
	   System.out.println(sum);
			
		}
	}
