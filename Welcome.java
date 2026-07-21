import java.util.Scanner;
public class Welcome{
   public  static void main(String[] arga){
      Scanner input= new Scanner(System.in);

     //Take user inputs
     System.out.println("Enter the first name:");
     String fname= input.nextLine();
     
     System.out.println("Enter the last name:");
     String lname=input.nextLine();

     System.out.printf("Welcome to the Second year %s %s\n",fname,lname);
  }
}
