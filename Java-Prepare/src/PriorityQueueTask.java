import java.util.*;

public class PriorityQueueTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eventsCount = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();

        for (int event = 0; event < eventsCount; event++) {
            String input = scanner.nextLine();
            events.add(input);
        }

        List<Student> students = Priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }

    public static class Student {
        private int id;
        private String name;
        private double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return cgpa;
        }
    }

    static class Priorities {
        public static List<Student> getStudents(List<String> events) {
            List<Student> result = new ArrayList<>();
            PriorityQueue<Student> queue = new PriorityQueue<>((first, second) -> {
                if (first.getCGPA() != second.getCGPA()) {
                    return second.getCGPA() - first.getCGPA() > 0 ? 1 : -1;
                } else {
                    if (!first.getName().equals(second.getName())) {
                        return first.getName().compareTo(second.getName());
                    } else {
                        return first.getID() < second.getID() ? 1 : -1;
                    }
                }
            });

            for (String event : events) {
                String[] tokens = event.split("\\s+");
                String command = tokens[0];

                if (command.equals("ENTER")) {
                    String name = tokens[1];
                    double cgpa = Double.parseDouble(tokens[2]);
                    int id = Integer.parseInt(tokens[3]);
                    queue.offer(new Student(id, name, cgpa));
                } else {
                    queue.poll();
                }
            }

            while (!queue.isEmpty()) {
                result.add(queue.poll());
            }

            return result;
        }
    }
}
