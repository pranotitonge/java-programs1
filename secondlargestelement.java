package javaprograms;

public class secondlargestelement {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MAX_VALUE;
		
		for(int i=0; i<a.length;i++) {
			if(a[i] > largest ) { 
				secondLargest =largest;
			    largest =a[i];
			}else if (a[i] > secondLargest && a[i]!=largest) {
				secondLargest =a[i];
			}
		}

		System.out.println("second largest element is "+ secondLargest);
	
	}
}

