package minordiagonal;

import java.util.Scanner;

public class Minordiagonalsum{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowsize = scanner.nextInt();
		System.out.println("Enter column size:");
		int columnsize = scanner.nextInt();
		System.out.println("Enter 2D array:");
		int arr[][] = new int[rowsize][columnsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
		columnsum(arr,rowsize,columnsize);
	}
		public static void columnsum(int arr[][],int rowsize,int columnsize) {
		int i=0;
		int j = rowsize-1;
		int sum=0;
		while(i<rowsize && j>=0) {
			sum+=arr[i][j];
			i++;
			j--;
		}
		System.out.println(sum);
}
}