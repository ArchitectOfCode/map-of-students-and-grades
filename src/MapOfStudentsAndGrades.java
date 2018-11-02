import java.util.*;
import java.lang.*;

public class MapOfStudentsAndGrades {
    public static void main(String[] args) {
        Student kasia1 = new Student("Kasia", "Nowak", "110123");
        Student zdzisia = new Student("Zdzisia", "Kowalska", "110124");
        Student kasia2 = new Student("Kasia", "Nowak", "120123");
        Student marta = new Student("Marta", "Rokita", "110666");
        Student asia = new Student("Asia", "Sztos", "120125");

        int[] k1m = {3, 2, 5, 1, 6, 2};
        int[] k1e = {5, 5, 5, 5, 4, 6, 6, 3, 5};
        int[] k1i = {4, 5, 4, 4, 3, 5};
        int[] k1p = {1, 2, 2, 5, 4, 3, 3, 3};

        int[] zm = {5, 5, 4, 3, 4, 4, 3, 5, 6};
        int[] ze = {1, 2, 4, 5, 5, 3, 5, 3};
        int[] zi = {5, 5, 4, 6, 5, 2, 4, 6, 5, 4};
        int[] zp = {5, 5, 6, 4, 3, 4, 5, 5, 5, 6, 5};

        int[] k2m = {5, 3, 5, 2, 3};
        int[] k2e = {4, 5, 4, 2, 4, 1, 5, 6};
        int[] k2i = {3, 4, 5, 6};
        int[] k2p = {3, 2, 5, 5, 3, 5, 6};

        int[] mm = {4, 4, 5};
        int[] me = {3, 5, 5, 5, 3, 1};
        int[] mi = {3, 4, 5, 2, 4, 5, 6, 4, 5, 5};
        int[] mp = {4, 4, 5, 3, 5, 5};

        int[] am = {2, 4, 5, 4};
        int[] ae = {4, 4, 4, 5, 2, 4};
        int[] ai = {3, 3, 5, 4, 5, 5};
        int[] ap = {3, 4, 5, 3, 6};

        GradeBook gradeBook1 = new GradeBook(k1m, k1e, k1i, k1p);
        GradeBook gradeBook2 = new GradeBook(zm, ze, zi, zp);
        GradeBook gradeBook3 = new GradeBook(k2m, k2e, k2i, k2p);
        GradeBook gradeBook4 = new GradeBook(mm, me, mi, mp);
        GradeBook gradeBook5 = new GradeBook(am, ae, ai, ap);

        HashMap<Student, GradeBook> studentsAchievements = new HashMap<Student, GradeBook>();

        studentsAchievements.put(kasia1, gradeBook1);
        studentsAchievements.put(zdzisia, gradeBook2);
        studentsAchievements.put(kasia2, gradeBook3);
        studentsAchievements.put(marta, gradeBook4);
        studentsAchievements.put(asia, gradeBook5);

        for(Map.Entry<Student, GradeBook> entry : studentsAchievements.entrySet()) {
            System.out.println("Grades of " + entry.getKey() + ":");
            System.out.printf("Math: %1.2f\n", entry.getValue().getAvgMath());
            System.out.printf("English: %1.2f\n", entry.getValue().getAvgEnglish());
            System.out.printf("IT science: %1.2f\n", entry.getValue().getAvgITScience());
            System.out.printf("Physics: %1.2f\n", entry.getValue().getAvgPhysics());
            System.out.printf("Average from all faculties: %1.2f\n\n", entry.getValue().getAvgTotal());
        }
    }
}