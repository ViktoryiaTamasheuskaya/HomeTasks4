package Tasks;

import java.util.Scanner;

public class Task4 {
	public static int[] mas;
	public static int n;
	public static int kol;
	public static int[] newArray;
		public static void main (String [] args){
			arrayResult(mas);
			
			
		}
		
		public static void arrayResult (int[] mas) {	
			Scanner sc=new Scanner(System.in);
			System.out.print("Vvedite N=");
			n = sc.nextInt();
			
			int mas1[]=new int[n];
			
		
				
		arrayPrint(mas1);
		findNull(mas1);
		
		
		}
		
		public static void arrayPrint (int[] mas) {
			for (int i1=0; i1<n; i1++) {
				mas[i1]=(int) Math.round((Math.random() * 20)-5);
				System.out.println("mas["+i1+"]="+mas[i1]+"; ");}	
			
		}
		
		public static void findNull(int[] mas) {
			int kol=0;
			for (int i=0; i<n; i++) {
				if (mas[i] == 0) {kol = kol+1;}
				else {kol=kol+0;}
				
			}
			System.out.println("kolichestvo nulevyh elementov v massive = " + kol);
			getZeroArray(mas, kol);
			
		}
		
		public static void getZeroArray(int[] mas, int kol) {
		
			int newArray[]=new int[kol];
			int i1=0;
			for (int i = 0; i<mas.length; i=i+1) {
				if (mas[i] == 0)
				{newArray[i1]=i;
				i1=i1 + 1;}
			}
			
			for (i1=0; i1<newArray.length; i1++) {
			
				System.out.println("mas["+i1+"]="+newArray[i1]+"; ");}	
			
		}		
}	
