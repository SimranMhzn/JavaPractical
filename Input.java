import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> students = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your name: ");
            String name=sc.nextLine();
            students.add(name);
        }
        System.out.println(students);
    }
}

