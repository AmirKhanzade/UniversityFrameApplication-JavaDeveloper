public class Student extends Person {
    //Design the Student class first by extending the Person class. 
    // Declare two instance attributes: subject and teacher.
    String subject;
    Teacher teacher;
    // define a constructor for the Student class. This class needs to capture the key information for each student
    public Student(String name,Date dateOfBirth,Teacher teacher,String subject){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.teacher=teacher;
        this.subject=subject;

    }
    //Finally, override the getDetails() method to display the student's information. 
    //The method returns all the information you instructed the Student class to capture. 
    public void getDetails(){
        System.out.println("Name of Student: " + this.name);
        System.out.println("Date of Birth: " + this.dateOfBirth.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher: " + this.teacher.name);
    }
}
