import java.util.Scanner;

class Student {
    int marks;  // Variable to store the marks of the student
    String name;  // Variable to store the name of the student
}

public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;

        Student[] obj = new Student[n];

        // Get marks and names for each student
        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            obj[i].name = scanner.nextLine();  // Input student name
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            obj[i].marks = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.println("Student " + obj[i].name + " has scored: " + obj[i].marks);
        }

        // Calculate total marks and highest marks
        int total = 0;
        int highest = obj[0].marks;
        String highestScorer = obj[0].name;

        for (int i = 0; i < n; i++) {
            total += obj[i].marks;
            if (obj[i].marks > highest) {
                highest = obj[i].marks;
                highestScorer = obj[i].name;
            }
        }

        // Display the statistics
        System.out.println("\n--- Exam Score Statistics ---");
        System.out.println("Total sum of all marks: " + total);
        System.out.println("Highest marks attained: " + highest + " by " + highestScorer);
    }
}
