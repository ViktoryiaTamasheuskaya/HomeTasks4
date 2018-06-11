package Tasks;

import java.util.Scanner;

public class Task2 {

	public static int[] mas;

	public static void main (String [] args) {
		int n=0, k=0, sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Vvedite N=");
		n = sc.nextInt();
		System.out.print("Vvedite K=");
		k = sc.nextInt();
		int mas[]=new int[n];
				for (int i=0; i<n; i++) {
			System.out.print(("ar["+i+"]=>"));
			mas[i]=sc.nextInt();}
			for (int i1=0; i1<n; i1++) {
			System.out.print("mas["+i1+"]="+mas[i1]+"; ");}	
			
		for (int i=0; i<n; i++) {
				if (mas[i]% k == 0) {sum=sum+mas[i];}
			}
		
		System.out.println("sum = " + sum);
		if (sum==0) {System.out.println("Net chisel kratnyh chisly "+k);}
				
							
			
			}
	}
	
