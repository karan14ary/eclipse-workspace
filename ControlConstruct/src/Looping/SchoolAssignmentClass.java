package Looping;

public class SchoolAssignmentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++ ) {
			for(int j=1;j<=2;j++) {
				for(int k=1;k<=10;k++) {
					if(i%2==0&&k%2==0) {
						System.out.println("The student of school "+i+" class "+j+
								" student "+k+" has completed assignment");
					}
					else if(i%2==0&&k%2==1) {
						System.out.println("The student of school "+i+" class "+j+
								" student "+k+" has not completed assignment");
					}
					else {
						System.out.println("The students are doing assignment");
					}
				}
			}
		}
		System.out.println("All assignments are checked");
	}
}
