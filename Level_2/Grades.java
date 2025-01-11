import java.util.Scanner;

public class  Grades{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        // Calculating total, average, and percentage
        int total = physics + chemistry + maths;
        double avg = total / 3.0;
        double percent = (total / 300.0) * 100;

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percent >= 80) {
            grade = "A";
            remarks = "Above agency-normalized standards";
        } else if (percent >= 70) {
            grade = "B";
            remarks = "At agency-normalized standards";
        } else if (percent >= 60) {
            grade = "C";
            remarks = "Below, but approaching agency-normalized standards";
        } else if (percent >= 50) {
            grade = "D";
            remarks = "Well below agency-normalized standards";
        } else if (percent>= 40) {
            grade = "E";
            remarks = "Too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Displaying results
        System.out.println("\nResults:");
        System.out.printf("Average Marks: %.2f\n", avg);
        System.out.printf("Percentage: %.2f%%\n", percent);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}