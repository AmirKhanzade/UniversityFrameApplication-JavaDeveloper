public abstract class Employee extends Person{
    //Declare an abstract Employee class as an extension of the Person class.
    // Include two additional attributes: dateOfAppointment and salary.
    int salary;
    Date dateOfAppointment;
    //you must include two abstract getter and setter methods for salary as getSalary() and setSalary().
    // The salary must also be returned as an integer value.
    public abstract int getSalary();
    public abstract void setSalary(int salary);
}
