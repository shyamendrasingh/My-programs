package lec1;

import java.util.Scanner;

public class HCForGCD {
public static void main(String[] args) {
	int divident;
	int divisor;
	Scanner sc1=new Scanner(System.in);
	divident=sc1.nextInt();
    
	Scanner sc2 =new Scanner(System.in);
	divisor= sc2.nextInt();
       while(divident%divisor!=0)
       {
               int remainder=divident%divisor;
               divident=divisor;
               divisor=remainder;
       
         }
          System.out.println(divisor);
      }
  }