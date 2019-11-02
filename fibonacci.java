package lec1;

public class fibonacci {
 public static void main(String[] args) {
	
	 int f1=0; int f2=1;
	 System.out.print(f1+" "+f2);
	 int f = f1+f2;
	 for(int i=0;i<10;i++) {
	 f=f1+f2;
	 f1=f2;
	 f2=f;
 System.out.print(f);
} 
 }
}
