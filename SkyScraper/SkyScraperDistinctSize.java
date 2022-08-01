package theBuildingFloors;

import java.util.Scanner;

public class SkyScraperDistinctSize {

	public static void main(String[] args) {
			System.out.println("Enter the total no. of floors in the building") ;
		   	Scanner sc = new Scanner(System.in);
		        int d = sc.nextInt();
		        int f[] = new int[d+1];
		        for(int i=1;i<d+1;i++){
		System.out.println("Enter the floor size given on day: "+i);
		        int s=sc.nextInt();
		        f[s]=i;	}
		        int j=d;
		        boolean flag;
		System.out.println("The order of construction is as follows ");
		        for(int i=1;i<=d;i++){
		        flag=false;
		System.out.println("Day "+i);		
		        while(j>=1 && f[j]<=i){
		        flag=true;
		 System.out.print(j +" ");
		        j--; }
		        if(flag==true){
		 System.out.println(" ");
		 sc.close();
		        }
		        }
	}
}