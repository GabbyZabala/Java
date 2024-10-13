import java.util.Scanner;
public class Act3_Zabala{
	public static void main(String[] args) {
		int [] Input = new int [10];
		for(int i = 0;i<Input.length;i++){
		    Scanner mla = new Scanner(System.in);
		    System.out.print("Enter Number: ");
		    int cola = mla.nextInt();
		    Input[i] = cola;
		} 
		System.out.print("\nArray: ");
		int largestNumber = 0, smallestNumber = 0,temp ;
		for(int x = 0; x<Input.length;x++){
		    System.out.print(Input[x] + " ");
		    temp = Input[x];
            if(temp>largestNumber){
                largestNumber = temp;
            }
		    if(temp<smallestNumber || smallestNumber == 0){
		        smallestNumber = temp;
		    }
		}
		System.out.print("\n");
		System.out.println("\nLargest Value is "+largestNumber);
		System.out.println("Smallest Value is "+smallestNumber);
		System.out.println("Difference is "+ (largestNumber-smallestNumber));
	}
}