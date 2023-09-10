package Programs.javaPrograme1;

public class CheckEqualArray {


	public static void main(String[] args) {
		
		int [] a1 = {10,20,30,40};
		int [] a2 = {10,20,40,40};
		
		Boolean result = true;
		
		if(a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
					if(a1[i] == a2[i]) {
						result=true;
					}else {
						break;
					}
				}			
		}else {
			if(result) {
				System.out.println("Arrays are equal");
			}else {
				System.out.println("Arrays are not equal");
			}
		}
	}
}
