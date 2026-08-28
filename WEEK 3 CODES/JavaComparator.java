import java.util.*;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            students.add(new Student(name, score));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.score != b.score) {
                    return Integer.compare(b.score, a.score);
                }

                return a.name.compareTo(b.name);
            }
        });

        for (Student s : students) {
            System.out.println(s.name + " " + s.score);
        }

        sc.close();
    }
}