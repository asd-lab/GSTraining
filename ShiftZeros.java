
public class ShiftZeros {
	
	public static int[] shiftZeros(int arr[] ) {
		
		int j = 0 , temp;
		
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != 0) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		
		return arr;
		
	}
	public static void printArray(int arr[]) {
		for(int x : arr) {
			System.out.print(x+ " ");
		}
	}

	
	
	public static void main(String[] args) {
		int arr[] = {1,0,2,0,3,0};
		int array[] = shiftZeros(arr);
		printArray(array);
		
	}
}
