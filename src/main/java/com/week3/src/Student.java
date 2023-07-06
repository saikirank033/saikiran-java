
    import java.util.ArrayList;
import java.util.List;

     public class Student {
        private String Firstname;
        private String Lastname;
        private double GPA;

        public Student(String firstName, String lastName, double gpa) {
            this.Firstname = firstName;
            this.Lastname = lastName;
            this.GPA = gpa;
        }

        public double getGpa() {
            return GPA;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + Firstname + '\'' +
                    ", lastName='" + Lastname + '\'' +
                    ", gpa=" + GPA +
                    '}';
        }
    }

    class RemoveStudentsBelowAverageGPA {
        public static void main(String[] args) {
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("Akshay", "Mogi", 3.8));
            studentList.add(new Student("Rahul", "Kappala", 3.5));
            studentList.add(new Student("Shankar", "Reddy", 4.0));


            // Calculate the average GPA
            double sum = 0;
            for (Student student : studentList) {
                sum += student.getGpa();
            }
            double averageGpa = sum / studentList.size();

            // Remove students with GPA less than the average
            studentList.removeIf(student -> student.getGpa() < averageGpa);

            // Print the remaining students
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }


