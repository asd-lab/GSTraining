import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormation {

	
	public static String largestNumber(int arr[]) {
		
		String array[] = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			array[i] = String.valueOf(arr[i]);
		}
		
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String a , String b) {
				return (b+a).compareTo(a+b);
			}
		});
		
		StringBuilder sb  = new StringBuilder();
		for(String s : array) {
			sb.append(s);
		}
		if (sb.charAt(0) == '0') {
            return "0";
        }
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		int[] arr= {30,30,34,5,9};
		 String largest = largestNumber(arr);
		 System.out.println(largest);
		
	}
}

