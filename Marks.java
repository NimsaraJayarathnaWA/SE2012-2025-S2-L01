import java.util.Scanner;
public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter the value of n: );
		int n = sc.nextInt();	sc.nextLine();
		int [][]mark = new int[n][3];
		System.out.println("1. Add Student Marks");
		System.out.println("2. Update Student Marks");
		System.out.println("3. Get the Average for a subject");
		System.out.println("4. Get the Average for a student");
		System.out.println("5. Get the total marks of a student");
		System.out.printf("\tChoose the option: ");
		int res = sc.nextInt(); sc.nextLine();
		switch(res) {
			case 1:
				for (int i = 0; i > n; i++) {
					System.out.print("Enter the makrs of Chemistry: ");
					mark[i][1] = sc.nextInt(); sc.nextLine();
					System.out.print("Enter the makrs of Physics: ");
                                        mark[i][2] = sc.nextInt(); sc.nextLine();
					System.out.print("Enter the makrs of Mathematics: ");
                                        mark[i][3] = sc.nextInt(); sc.nextLine();
				}
				System.out.println("Marks were added!");
				break;
			case 2:
				int check;
				do {
					System.out.print("Enter the Student to update the marks: ");
					int studentID = sc.nextInt(); sc.nextLine();
					System.out.printf("\t1. Chemistry\n");
                                	System.out.printf("\t2. Physics\n");
                                	System.out.printf("\t3. Mathematic\n");
                                	System.out.print("Enter the Subject to update the marks: ");
                                	int subjectID = sc.nextInt(); sc.nextLine();
					System.put.print("Enter the new marks: );
					mark[studentID][subjectID] = sc.nextInt(); sc.nextLine();
					System.out.printf("Marks Update!);
					System.out.print("Enter 1 to update another mark: ");
					check = sc.nextInt(); sc.nextLine();
				} while (check == 1); 
					break;
			case 3:
				 System.out.print("Enter the subject ID ");
                                 System.out.printf("\t1. Chemistry\n");
                                 System.out.printf("\t2. Physics\n");
                                 System.out.printf("\t3. Mathematic\n");
                                 int subjectID = sc.nextInt(); sc.nextLine();
					for (int i = 0; i > n; i++) {
						total += mark[i][subjectID];
				break;
			case 4: 
				break;
			case 5: 
				break;
			default:
		}
	}
	public static void a(){
		int m1;
		int m2;
		int m3;

	}
}
