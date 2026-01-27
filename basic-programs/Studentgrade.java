import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        String grade;
        String remarks;

        if (average >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (average >= 75) {
            grade = "A";
            remarks = "Very Good";
        } else if (average >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
