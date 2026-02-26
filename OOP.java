// CLASS=> class is a user defined data type that group data and function together into a simple unit;

//OBJECT=> A object is a real world entity created from a class;

//FUNCTION=> A function is a reusable block of code that performs a specific task;

//CONSTRUCTOR=> A constructor is a special method that is automatically called when an object is created;

//Simple code of oops

class Student{
    String name;
    int roll_no;
    String branch;
    int mark1,mark2,mark3;
    
    public int totalmarks(){
        return mark1+mark2+mark3;
    }
    public int Average(){
        return totalmarks()/3;
    }
    public String Details(){
        return "Name="+name+"\n"+"roll_no="+roll_no+"\n"+"Branch="+branch;
    }
}
class Main {
    public static void main(String[] args) {
       Student s1= new Student();
       s1.name="vishal kumar";
       s1.roll_no=26;
       s1.branch="CSE";
       s1.mark1=67;
       s1.mark2=78;
       s1.mark3=89;
       
      System.out.println(s1.totalmarks());
       System.out.println(s1.Average());
       System.out.println(s1.Details());
    }
}
