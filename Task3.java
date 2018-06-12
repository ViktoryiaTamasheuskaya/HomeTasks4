package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
	
	public static int n;
	public static int[] mas;

	public static void main (String[] args) {
		int kol=0;
		arrayInput(mas);
	}
		public static void arrayInput(int[] mas) {
			Scanner sc=new Scanner(System.in);	
			System.out.print("Vvedite N=");
			n = sc.nextInt();
			int mas1[]=new int[n];
			n=mas1.length;
			Random rand=new Random();
			for (int i=0; i<n; i++) {
				mas1[i]=rand.nextInt(300);
				}
			arrayPrint(mas1);
			arraySort(mas1);
		}
		
		
		public static void arrayPrint(int[] mas) {
			for (int i=0; i<n; i++) {
				System.out.println("mas["+i+"]="+mas[i]+"; ");}	
		}
		
		public static void arraySort(int[] mas) {
			int kol=0;
			do {
				for (int i=0; i<n-1; i++) {
					if (mas[i]<mas[i+1]) {
						kol=kol+1;}
					else {kol=0;
					System.out.println("massiv ne vozrastaet"); System.exit(0);
						}
					}	
				
				} while (kol==0);
			if (kol!=0) {System.out.println("massiv vozrastaet");
				}
			}
		}
						
	
				
	
			
	
	
	

