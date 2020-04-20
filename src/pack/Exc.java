
package pack;

public class Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int k=1;
		
		try{
			for(int i=10;i>=0;i--) {

			k=a/i;
			System.out.println(k);}}
			

		catch(ArithmeticException e) {
			System.out.println("cameto catch block");
		}
		finally  {System.out.println("how ever execute it");
			
		}

}}
