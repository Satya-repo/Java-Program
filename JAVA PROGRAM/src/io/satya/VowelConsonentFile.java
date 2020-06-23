package io.satya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;import javax.print.DocFlavor.CHAR_ARRAY;


public class VowelConsonentFile {
	
	final static String FILE_PATH = "C:/Users/ssingh5/Desktop/satya.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		int vowel =0;
		int consonent = 0;
		char[] charArray = null;
		
		try{
			Scanner scanner = new Scanner(new File(FILE_PATH));
			while(scanner.hasNext()){
				  charArray = scanner.next().toCharArray();
			}
			System.out.println(charArray.length+ " Array is "+charArray);
			System.out.println(charArray);
			for(int i =0;i<charArray.length;i++){
				if(charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o' ||
						charArray[i]=='u'){
							vowel++;
						}else{
							consonent++;
						}
			}
			
			System.out.println("Vowel =" + vowel + "Consonent = "+ consonent);
		}catch(Exception e){}
		
	
		
	}
}