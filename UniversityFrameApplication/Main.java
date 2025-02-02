public class Main {
    public static void main(String[] args) {
        // Inside the main() method, create three instances of Date, as follows:
        Date dateOfStudent = new Date(12, 8, 2025);
        Date dateOfTeacher = new Date(4, 7, 1998);
        Date dateOfAppointment = new Date(4, 9, 2025);

        // Declare a new Teacher object as follows:
        Teacher myteacher = new Teacher("Blanca", dateOfTeacher, dateOfAppointment, "Electronincs", "Mtech");

        // Declare a new Student object as follows:
        Student mystudent = new Student("Hannah-Johanson", dateOfStudent, myteacher, "Electronics");

        // call setSalary() and assign a value of 50000 to the salary variable.
        myteacher.setSalary(50000);

        mystudent.getDetails();
        myteacher.getDetails();

    }
}
