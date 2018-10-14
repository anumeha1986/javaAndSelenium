package myWorkspaceJavaPractice;

public class ArmstrongNumberCheck {
	
	int counter(int num) {
		int counter = 0;
		while (num!=0) {
			num = num/10;
			counter++;
		}
		System.out.println("Counter value in counter:"+counter);
		return counter;
	}
	
	public static void main(String args[]) {
		int num = 153;
		int original_number = num;
		double sum=0;
		int mod;
		int power;
		
		ArmstrongNumberCheck obj =new ArmstrongNumberCheck();
		power = obj.counter(num); 
		
		System.out.println("Value of number is : "+num);
		while(num!=0) {
			
			mod = num%10;
			System.out.println("Value of mod  :"+mod);
			
			sum =sum+Math.pow(mod, power);
			System.out.println("Value of sum  :"+sum);
			
			num = num/10;
			System.out.println("Value of num  :"+num);
			
		}
		
		System.out.println("Value of sum"+sum);
		
		if(sum == original_number)
		{
			System.out.println("ARMSTRONG NUMBER");
		}
		else 
			System.out.println("NOT AN ARMSTRONG NUMBER");
	}

}
