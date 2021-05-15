package interm;

public class Addition {

	
		
		int x;
		int y;
		void add() {
		
			int sum;
			sum=x+y;
			System.out.println(sum);
		}// end of add
					
		int add (int a, int b, int c)	
		{
			int sum;
			sum=a+b+c;
			System.out.println(sum);
		return sum;
		}
		double add(double a, double b, double c)	{
			double sum=a+b+c;
			System.out.println(sum);
			return sum;	
					
		
		}
			public static void main(String[] args) {	
		
		
		Addition a1=new Addition();
		a1. x=10;
		a1. y=15;
		a1. add();
		
		a1.add(10,10,10);
		a1.add(10.5,10.5,10.0);
		
		Addition a2=new Addition();
		a2. x=5000;
		a2. y=100000;
		a2. add();
		

	}// end of main

}// end of class
