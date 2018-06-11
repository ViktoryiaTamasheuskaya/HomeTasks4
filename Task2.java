package Tasks;

import java.util.Scanner;

public class Task2 {

	public static int[] mas;
	public static int n, k;
	

	public static void main (String [] args) {
		arrayInput(mas);
			}
	
	public static void arrayInput (int[] mas) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Vvedite N=");
		n = sc.nextInt();
		System.out.print("Vvedite K=");
		k = sc.nextInt();
		int mas1[]=new int[n];
		for (int i=0; i<n; i++) {
		System.out.print(("ar["+i+"]=>"));
		mas1[i]=sc.nextInt();}
		arrayPrint(mas1);
		findNum(mas1,k);
	}
		
	public static void arrayPrint (int[] mas) {
		for (int i1=0; i1<n; i1++) {
			System.out.print("mas["+i1+"]="+mas[i1]+"; ");}	
		
	}
	
	public static void findNum (int[] mas, int k) {
		int sum=0;
		for (int i=0; i<n; i++) {
			if (mas[i]% k == 0) {sum=sum+mas[i];}
		}
	if (sum !=0) {System.out.println("sum = " + sum);}
	else {System.out.println("Net chisel kratnyh chisly "+k);}
	}
	}
		

	
	
