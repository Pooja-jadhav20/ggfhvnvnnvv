package LogicalCode;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4, 7, 1, 8, 5};
		int high=arr[0];
		int low=arr[0];
		 
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>high) {
				high=arr[i];
			}
			if(arr[i]<low) {
				low=arr[i];
			}
		}
		System.out.println("high is: " +high + "  and low is: " +low);

	}

}
