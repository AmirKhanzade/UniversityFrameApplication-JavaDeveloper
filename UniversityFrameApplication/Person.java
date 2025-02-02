public abstract class Person {

    //Your opening challenge is to declare an abstract Person class at the top of the hierarchy
    //The common minimum attributes name and dob(date of birth),
    //Ensure that dob is created as an object of the Date class. 
    //The next step is to create the Date class, as an attribute of the Person class is a Date object (indicating a composition relationship).
    // You’ll also need to include the getDate() method, which returns the string representation of the date.
    String name;
    Date dateOfBirth;
    //And the abstract getDetails() method.
    public abstract void getDetails();

}