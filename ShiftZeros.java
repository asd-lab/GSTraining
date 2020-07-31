public class ShiftZeros {
	
	public static int[] shiftZeros(int[] arr ) {
		
		int j = arr.length-1 , temp;
		
		for(int i = arr.length-1 ; i >= 0; i--) {
			if(arr[i] != 0) { 
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j--;
			}
		}
		
		return arr;
	}
	public static void printArray(int[] array) {
		for(int x : array) {
			System.out.print(x+ " ");
		}
	}

	
	
	public static void main(String[] args) {
		int[] arr = {0,1,0,2,0,3,0,5,4,0,1,0};
		int[] array = shiftZeros(arr);
		printArray(array);
		
	}
}
