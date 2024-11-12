
import CIE.Internals;
import CIE.Student;
import SEE.External;
import java.util.Scanner;
public class Main11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Internals[] internalStudents = new Internals[n];
        External[] externalStudents = new External[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("USN: ");
            String usn = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Semester: ");
            int sem = scanner.nextInt();
            int[] internalMarks = new int[5];
            System.out.println("Enter internal marks for 5 courses:");
            for (int j = 0; j < 5; j++)
            {
                internalMarks[j] = scanner.nextInt();
            }
            internalStudents[i] = new Internals(usn, name, sem, internalMarks);
            int[] seeMarks = new int[5];
            System.out.println("Enter SEE marks for 5 courses:");
            for (int j = 0; j < 5; j++)
            {
                seeMarks[j] = scanner.nextInt();
            }
            externalStudents[i] = new External(usn, name, sem, seeMarks);
        }
        System.out.println("\nFinal Marks for each student:");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Student " + (i + 1) + " (" + internalStudents[i].name + "):");
            for (int j = 0; j < 5; j++)
            {
                int finalMark = internalStudents[i].internalMarks[j] + externalStudents[i].seeMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
            System.out.println(); 
        } 
        scanner.close();
    }
}
