package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> classA = new HashSet<>();
        Set<Integer> classB = new HashSet<>();
        Set<Integer> classC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            classA.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            classB.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            classC.add(sc.nextInt());
        }

        Set<Integer> allStudents = new HashSet<>(classA);
        allStudents.addAll(classB);
        allStudents.addAll(classC);

        System.out.println("Total Students: " + allStudents.size());
    }
}
