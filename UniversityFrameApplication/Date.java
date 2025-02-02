public class Date {
    //First, declare the Date class with the integer attributes date, month, and year. 
    int date;
    int month;
    int year;
    //constructor
    public Date(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    //Then, include the getDate() method, which returns the string representation of the date
    public String getDate(){
        return this.date + "-" + this.month + "-" + this.year;
    }
}
