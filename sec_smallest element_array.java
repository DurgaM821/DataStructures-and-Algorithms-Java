
/*

Eg:  N=5

input : 45 43 -9 0 99

output : 1st smallest element as -9
          
          2nd smallest element as 0


*/


import  java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//	System.out.println(Integer.MAX_VALUE);
		
		
		// Array declaration
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		 
		 // input in an array
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));  // To print the array
		
		// first smallest element to find  without sort funtion
		
		int min_num=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    if(arr[i]<min_num){
		        min_num=arr[i];
		    }
		}
		System.out.println("The first min elemet in an array" + " " + min_num);
		
		// To find the second smallest element in an array
		
	   int 	min_sec_num=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    if(arr[i]==min_num){
		        continue;  // where continue goes to next process
		    }
		    if(arr[i]<min_sec_num){
		        min_sec_num=arr[i];
		    }
		}
		
		System.out.println("The second smallest elemet in an array"+ " " + min_sec_num);
		sc.close();
	
	}
	
}
