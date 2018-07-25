package janani;
import java.util.Scanner;
public class Numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="";
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.nextLine();
if(Character.isDigit(str.charAt(0))){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
	}

}
