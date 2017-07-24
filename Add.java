package ka;

import java.io.*;
import java.util.Scanner;
public class Add {
	public static void main(String args[]){
		System.out.println("Enter the number of pairs:");
		Scanner ina= new Scanner(System.in);
		int n=ina.nextInt();
		int stud=2*n;
		System.out.println("The pairs of 3 days: ");
		for(int i=1;i<=(2*n-1);i++){
		for(int j=i+1;j<=stud;j++){
			System.out.println(+i+" "+j);}
		}
		}
	}