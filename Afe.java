package ka;
import java.util.Scanner;
public class Afe {
	public static void main(String args[]){
		Scanner ina=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=ina.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<size;i++){
			arr[i]=ina.nextInt();}
		int rem=0;
		int temp=size/2;
		if(size%2!=0){
			int n=size%2;
			rem=n+temp;}
		else{
			rem=temp;}
		int result=0;int h=0;
		for(int i=0;i<rem;i++){
			result+=arr[i];}
			h=result/rem;
			int p=0;int t=0;
		for(int i=arr.length-1;i>temp;i--){
			p+=arr[i];}
			t=p/temp;
			int g=0;
		if(h==t){
			System.out.println("The 2dimensional array is");
			int s[][]=new int[2][rem];int u=0;
			System.out.print("{{");
			for(int i=0;i<rem;i++){
				s[u][i]=arr[i];
				System.out.print(s[u][i]+" ");
				g++;}
			System.out.print("},{");
			u++;
			for(int i=0;i<temp;i++){
				s[u][i]=arr[g];
				g++;
				System.out.print(s[u][i]+" ");}
			System.out.println("}}");}
		else{
			System.out.println("Not Possible");}}}

