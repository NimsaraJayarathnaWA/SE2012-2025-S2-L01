import java.util.Scanner;

public class MarksWithMethods{
    static int n;
    static int [][]mark;
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args){
        System.out.print("Enter the value of n: ");
		n = sc.nextInt();	sc.nextLine();
		mark = new int[n][3];
        while (true){
            System.out.println("");
		    System.out.println("1. Add Student Marks");
		    System.out.println("2. Update Student Marks");
		    System.out.println("3. Get the Average for a subject");
		    System.out.println("4. Get the Average for a student");
		    System.out.println("5. Get the total marks of a student");
		    System.out.println("6. Exit");
		    System.out.printf("\tChoose the option: ");
		    int res = sc.nextInt(); sc.nextLine();
		    if (res == 6){
                break;
            }  
            else if (res == 1) {
                for (int i = 0 ; i < n ; i++){
                    System.out.println("Student " + (i + 1) + " of " + n);
                    add(i);
                }
            } else if (res == 2) {
                System.out.print("Enter the StudentID to update the marks: ");
				int studentID = sc.nextInt(); sc.nextLine();
				System.out.printf("\t1. Chemistry\n");
                System.out.printf("\t2. Physics\n");
                System.out.printf("\t3. Mathematic\n");
                System.out.print("Enter the SubjectID to update the marks: ");
                int subjectID = sc.nextInt(); sc.nextLine();
                update(studentID - 1, subjectID - 1);
            } else if (res == 3) {
                System.out.printf("\t1. Chemistry\n");
                System.out.printf("\t2. Physics\n");
                System.out.printf("\t3. Mathematic\n");
                System.out.print("Enter the subject ID: ");
                int subjectID = sc.nextInt(); sc.nextLine();
                System.out.println("Average of the subject " + selectSubject(subjectID - 1) + " is " + avgSub(subjectID - 1));
            } else if (res == 4) {
                System.out.print("Enter the ID of the student: ");
				int studentID = sc.nextInt(); sc.nextLine();
                System.out.println("Average of the student " + (studentID) + " is " + avgStud(studentID - 1));
            } else if (res == 5) {
                System.out.print("Enter the ID of the student: ");
				int studentID = sc.nextInt(); sc.nextLine();
                System.out.println("Total of the student " + (studentID) + " is " + total(studentID - 1));
            } else {
                continue;
            }
        }
    }

    public static void add(int studentID){
        System.out.print("Enter the marks of Chemistry: ");
		mark[studentID][0] = sc.nextInt(); sc.nextLine();
		System.out.print("Enter the marks of Physics: ");
        mark[studentID][1] = sc.nextInt(); sc.nextLine();
		System.out.print("Enter the marks of Mathematics: ");
        mark[studentID][2] = sc.nextInt(); sc.nextLine();
        System.out.println("Adding...");
        System.out.println("Chemistry - " + mark[studentID][0]);
        System.out.println("Physics - " + mark[studentID][1]);
        System.out.println("Mathematics - " + mark[studentID][2]);
        System.out.println("Marks were added!");
		System.out.println("");
    }

    public static void update(int studentID,  int subjectID){
        System.out.print("Enter the new marks: ");
		mark[studentID][subjectID] = sc.nextInt(); sc.nextLine();
        System.out.println("Updating...");
        System.out.println("Marks updated for student " + (studentID + 1) + " for " + selectSubject(subjectID) + ": " + mark[studentID][subjectID]);
    }

    public static float avgSub(int subjectID){
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += mark[i][subjectID];
        }
		return (float)total / n;
    }

    public static float avgStud(int studentID){
        int total = mark[studentID][0] + mark[studentID][1] + mark[studentID][2];
		return (float)total(studentID) / 3;
    }

    public static int total(int studentID) {
        return mark[studentID][0] + mark[studentID][1] + mark[studentID][2];
    }

    public static String selectSubject(int subjectID) {
        String subject = "";
        if (subjectID == 0) subject = "Chemistry";
		else if (subjectID == 1) subject = "Physics";
		else if (subjectID == 2) subject = "Mathematics";
        else subject = "Unknown";
        return subject;
    }
}

