package LogicalCode;

public class Polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="radar";
		boolean ispalin=true;
		int start=0;
		int last=str.length()-1;
		
		while(start<last) {
			if(str.charAt(start)!= str.charAt(last)) {
				ispalin=false;
				break;
			}
			start++;
			last--;
		}
		if(ispalin) {
			System.out.println("it is polindrom ");
		}else {
			System.out.println("it is not polindrom");
		}
	}

}
