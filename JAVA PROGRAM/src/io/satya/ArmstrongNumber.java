package io.satya;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 153;
		int armStrongNumber = 153;
		int check = 0;
		
		while(number>=1){
			int num = number%10;
			number = number/10;
			check = check + (num*num*num);
		}
		
		if(check==armStrongNumber)
			System.out.println("ARMSTRONG NUMBER");
		else{
			System.out.println("NOTTTT ARMSTRONG NUMBER");
		}

	}

}
