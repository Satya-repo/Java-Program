package io.satya;

public class FloydTriangle {

	public static void main(String[] args) {
		int rowCount = 50;
		
		for(int i =1;i<=rowCount/2;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i = rowCount/2;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}