import java.util.*;

public class SortTask {
    static class Student{
        private final int id;
        private final String firstName;
        private final double cgpa;
        public Student(int id, String firstName, double cgpa) {
            super();
            this.id = id;
            this.firstName = firstName;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFirstName() {
            return firstName;
        }
        public double getCgpa() {
            return cgpa;
        }
    }
    static class Checker implements Comparator<Student>{

        @Override
        public int compare(Student first, Student second) {
            if (first.getCgpa() == second.getCgpa()) {
                if (first.getFirstName().equals(second.getFirstName())) {
                    return first.getId() - second.getId();
                }
                return first.getFirstName().compareTo(second.firstName);
            }

            return second.getCgpa() - first.getCgpa() > 0 ? 1 : -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int line = 0; line < lines; line++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            int id = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            double cgpa = Double.parseDouble(tokens[2]);

            Student student = new Student(id, name, cgpa);
            students.add(student);
        }

        Checker checker = new Checker();
        students.sort(checker);

        for (Student student : students) {
            System.out.println(student.firstName);
        }
    }
}
