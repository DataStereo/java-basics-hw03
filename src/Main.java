import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 3 students
        Student student1 = new Student("Student1");
        Student student2 = new Student("Student2");
        Student student3 = new Student("Student3");

        // Input information about the students
        System.out.println("Enter rating for the " + student1.getName() + " > ");
        int ratingForStudent1 = scanner.nextInt();
        student1.setRating(ratingForStudent1);
        System.out.println("Enter rating for the " + student2.getName() + " > ");
        int ratingForStudent2 = scanner.nextInt();
        student2.setRating(ratingForStudent2);
        System.out.println("Enter rating for the " + student3.getName() + " > ");
        int ratingForStudent3 = scanner.nextInt();
        student3.setRating(ratingForStudent3);

        // Display average rating:
        System.out.println("Average rating for all students: " + Student.getAvgRating());

        // Change rating of student:
        System.out.println("Enter new rating for " + student1.getName() + " > ");
        int newRating = scanner.nextInt();
        student1.changeRating(newRating);

        // Display new average rating:
        System.out.println("New average rating of all students: " + Student.getAvgRating());

        // Compare 2 students rating:
        boolean isStudentBetter = student1.betterStudent(student2);
        System.out.println(student1.getName() + " has better rating than " + student2.getName() + ": " + isStudentBetter);

        Student.removeStudent(student1);
        // Display new average rating after students1 removal
        System.out.println("New average rating of all students after " + student1.getName() + " removal = " + Student.getAvgRating());
    }
}
