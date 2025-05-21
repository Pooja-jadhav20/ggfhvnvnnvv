package LogicalCode;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		double count=0;
		int length=String.valueOf(num).length();
		int OriginalNO=num;
		
		while(num!=0) {
			int temp=num%10; // last gidit
			count+=Math.pow(temp, length);
			num /=10;
			
		}
		if(count==OriginalNO) {
			System.out.println("this arnStrong ");
		}else {
			System.out.println("this is not");
		}
	}

}
