/* Q1

recording also stopped at 4:12 & 4:13 & 4:30, 4:48

*/
import java.util.Scanner;

class SortArray{
	
	void sort(int[] a1, int key, int n){
		
		int temp = key;
		
		for(int i=(n-2);i >= 0;i--){
			
			if(a1[i]>a1[temp]){
				a1[temp] = a1[i];
				key--;
				
			for(int j=0;j<n;j++){
				System.out.print(a1[j]+" ");
				}
				System.out.println();
			}
				sort(a1, key, n);
			
			else if(a1[i]<a1[temp]){
				a1[temp] = a1[i+1];
				a1[i+1] = a1[key];
				
				for(int j=0;j<n;j++){
					System.out.print(a1[j]+" ");
					}
					System.out.println();
				}
			else
				System.out.println("Invalid")
			}	
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array size");
		int n = sc.nextInt();
		int[] a1 = new int[n];
		
		
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++)
			a1[i] = sc.nextInt();
		
		int key = n - 1;
		
		SortArray sa = new SortArray();
		sa.sort(a1, key, n);
	}
}