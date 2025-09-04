import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        int choice;

        do {
            System.out.println("\n--- Student Database Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    String grade = sc.next();
                    dao.addStudent(new Student(name, age, grade));
                    break;

                case 2:
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\nID\tName\tAge\tGrade");
                    for (Student s : students) {
                        System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getGrade());
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Delete: ");
                    int id = sc.nextInt();
                    dao.deleteStudent(id);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
