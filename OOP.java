 CLASS=> class is a user defined data type that group data and function together into a simple unit;

OBJECT=> A object is a real world entity created from a class;

FUNCTION=> A function is a reusable block of code that performs a specific task;

CONSTRUCTOR=> A constructor is a special method that is automatically called when an object is created;

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

// using constructor
class Student{
    String name;
    int roll_no;
    String branch;
    int mark1,mark2,mark3;
    
    Student(String name,int roll_no,String branch,int mark1,int mark2,int mark3){
        this.name=name;
        this.roll_no=roll_no;
        this.branch=branch;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    
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
       Student s1= new Student("vishal kumar",26,"CSE",67,78,98);
      
       
      System.out.println(s1.totalmarks());
       System.out.println(s1.Average());
       System.out.println(s1.Details());
    }
}

//Four pillers of OOP

//1.Inheritence
def=>It is process where child class are acquire the properties of the parent class
    //code
    class Triangle{
    int length;
    int breadth;
    
    Triangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
}
class cuboid extends Triangle{
    int height;
    
    cuboid(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;
    }
    public int volume(){
        return length*breadth*height;
    }
}
class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(6,5);
        System.out.println(t1.area());
        
        cuboid c1 = new cuboid(7,2,4);
        System.out.println(c1.volume());
      
    }
}

//2 Polymorshims
def=>it is the process to allow the same function name to perform different behavior;

i> Method overloading(compile time)=>same name different parameter
    code.
 class Main {
     public static int add(int a,int b){
           return a+b;
       }
       public static int add(int a,int b,int c){
           return a+b+c;
       }
    public static void main(String[] args) {
        int a=12;
        int b=4;
        int c=8;
        System.out.println(add(a,b));
        System.out.println(add(a,b,c));
      
    }
}

ii>Mthod overriding(run time)=>child class can change the behavior of a parent class function;
code.
 class Tv{
    void changeChannel(){
        System.out.println("Tv is changing the chennal");
    }
    void isOn(){
        System.out.println("Tv is On");
    }
    void color(){
        System.out.println("Yes it is color");
    }
}
class SmartTv extends Tv{
	@Override
     void changeChannel(){
        System.out.println("SmartTv is changing the chennal");
    }
	@Override
    void isOn(){
        System.out.println("SmartTv is On");
    }
    void browing(){
        System.out.println("SmartTv is browsing");
    }
    
}

class Main {
    public static void main(String[] args) {
        SmartTv st = new SmartTv();
        st.changeChannel();
      
    }
}
    
    
