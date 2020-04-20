package pack;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Enter till which number i need to calculate primes:");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		
		String a="2";
		for(int i=3;i<n;i++) {
			int c=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					c=c+1;
				}
				
				
			}
			if(c==2) {
				a=a+"\n"+i;
			
			}
			
		}
		System.out.println("Here is your list of primes");
		System.out.println(a);

	}

}
