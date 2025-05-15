import java.util.*;
public class basic {

	public static void main(String[] args) {
//		Declartion
		
		String str="vishal kumar";
		System.out.println(str);
		
//		taking input from user
		
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(s);
		
//		char at func
		
		char ch=str.charAt(0);
		System.out.println(str.charAt(0));
		
//		Index of func
		
		System.out.println("The index of string is:"+str.indexOf('i'));
		
//		Compare fun
		
		 str.compareTo(gtr);
		
		System.out.println(str.contains("vis"));
		
//		Substring
		
		String s2="vishal";
		System.out.println(s2.substring(0,3));
		
//		equal funcn
		
		System.out.println(str.equals(s2));
		
		
//		StringBuilder function
		
		StringBuilder str1=new StringBuilder("hello");
		System.out.println(str1);
		
//		hello=>mello
		str1.setCharAt(0, 'm');
		System.out.println(str1);
//		
//		Append method
		System.out.println(str1.append("world"));
		
//		InsertMethod
		str1.insert(0,'V');
		System.out.println(str1);
//		
//		Reverse Method
		
//		str1.reverse();
		System.out.println(str1);
		
//		Delete funcn
		
		str1.delete(2, 4);
		System.out.println(str1);
		
			
//		to find the asciivalue |
		String key="A";
		 int hash=0;
        char[]keychar=key.toCharArray();
        for(int i=0;i<keychar.length;i++){
            int asciivalue=keychar[i];
            System.out.println(asciivalue);
        }

		// Toggle the word eg mAtH => MaTh
import java.util.*;
class Main {
  
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("ViShaL");
        for(int i=0;i<str.length();i++){
            boolean flag=true;//capital
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97) flag=false;//small
            if(flag==true){
                ascii +=32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }else{
                ascii -=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
       
    }
}

	}

}
