package ka;
import java.util.Scanner;
public class Aff {

		public static void main(String[] args) {
			int number;
			
			Scanner scr=new Scanner(System.in);
			number=scr.nextInt();
			int count=0;
			int[] arr=new int[number];
			for(int i=10;i<number/2;i++){
				int m=i;
				int sum=1;
				while(m>0){
					int k=0;
					
					arr[k]=m%10;
					m=m/10;
					sum*=arr[k];
					
				}
			
				if(i*sum==number){
					System.out.println("SEED IS "+i);
				count++;	
				}
				
			}
			if(count==0)
				System.out.println("There is no seed");
			scr.close();

		}


}
