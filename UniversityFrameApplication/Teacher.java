public class Teacher extends Employee {
    //Let’s get started and create the Teacher class with these attributes and a constructor.
    String qualification;
    String subject;
    public Teacher(String name,Date dateOfBirth,Date dateOfAppointment,String subject,String qualification){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.dateOfAppointment=dateOfAppointment;
        this.subject=subject;
        this.qualification=qualification;
        
    }

    @Override
    public void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dateOfBirth.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
    }
    //implement the getSalary() and setSalary() methods, 
    //the abstract methods in the Employee class. Use the @Override annotation to override these methods from the parent class. 
    @Override
    public int getSalary(){
        return salary;
    }
    @Override
    public void setSalary(int salary){
        this.salary=salary;
    }
}
