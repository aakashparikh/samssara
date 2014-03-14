import java.util.Scanner;
 
public class FindingValues{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
 
 
		System.out.print("Enter the number of integers: ");
		int size=input.nextInt();
		int[] arr=new int[size];
 
		System.out.print(arr.length+"indexes\n");
 
		for(int i=0;i<size;i++){
			System.out.print("enter an integer: ");
			int number=input.nextInt();
			arr[i]=number;
		}
 //dipyant changes
		int i;	
		for( i=0;i<size;++i){//for i<size
			int count=0;	
			for (int j=0;j<=size;++j){
				if(arr[i]>arr[j]){
					count++;
 
				}
			}	
			if(count==arr.length/2){
				break;
 
			}
		System.out.print(arr[i]);	
		}
 
 
 
 
 
 
 
	}	
}