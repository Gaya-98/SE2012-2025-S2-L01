import java.util.Scanner;
public class Marks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int num = input.nextInt();
		input.nextLine();
		
		//create the 2D array
        int [][]students= new int[num][3];
        System.out.println("Enter the choice:");
        String choice;
		boolean status=true;
		
        do{
            System.out.println("\n Menu ");
            System.out.println("add : add student marks");
            System.out.println("update: update student mark");
            System.out.println("average_s: get the average for the subject");
            System.out.println("average :get the average for a student");
            System.out.println("total: get the total mark of a student");
			System.out.println("grades: display final grades of all students");
            System.out.println("exit: exit from the program");

           
            choice= input.nextLine();

            switch(choice){

                case "add":{
                          for(int i=0;i<num;i++){
                           System.out.printf("Enter the studentID:");
                           int studentid =input.nextInt();
                           input.nextLine();
						   
                           if(studentid <1 || studentid >num){
                               break;
                           }

                           System.out.printf("Mathematics:");
                           students[studentid-1][0]= input.nextInt();
						   
                           System.out.printf("Chemestry:");
                           students[studentid-1][1] = input.nextInt();
						   
                           System.out.printf("Physics:");
                           students[studentid-1][2] =input.nextInt();
						   input.nextLine();
                           System.out.printf("\n");
						   
						  }
						  break;
				        }

                case "update":{
                         System.out.printf("Enter the studentID:");
                         int std = input.nextInt();
						 input.nextLine();

                         System.out.printf("Enter the subjectID:");
                         int sub = input.nextInt();
						 input.nextLine();
						 
						 System.out.printf("Enter the new mark:");
                         //update the available mark
                         students[std-1][sub-1] = input.nextInt();
						 input.nextLine();

                         break;
				       }

                case "average_s":{
                         System.out.printf("Enter the subjectID:");
                         int sub = input.nextInt();
                         input.nextLine();
						 
                         //Calculate the total and the average
                         int total=0;
                         int i=0;
                         while(i<num){
                              total= total+students[i][sub-1];
                              i++;
                         }
                         float average_s = (float)total/num;
					     System.out.println("The subject"+(sub-1)+" average: "+average_s);
					     break;
				       }
					   
			    case "average":
				        {				
				           System.out.printf("Enter the studentID:");
                           int std = input.nextInt();
						   input.nextLine();
						   
						   int sum=0;
				           for(int i=0;i<3;i++){
							   sum = sum+students[std-1][i];
						   }
						   float average = sum/3.0f;
						   System.out.println("The average of the student"+std+" is "+average);
					       break;
						}
					
				case "total": {
				          System.out.printf("Enter the studentID:");
                          int std = input.nextInt();
						  input.nextLine();
						  
						  int sum=0;
				          for(int i=0;i<3;i++){
						      sum = sum+students[std-1][i];
						  }
						  System.out.println("The total mark of student"+std+" is "+ sum);
					      break;
				        } 
						
				case "grades":{
					
					            System.out.println("| Student ID |"+"Mathematics |" + " Chemestry |" + " Physics |");
					            for(int i=0;i<num;i++){
							   
							          String math =displaygrade(students[i][0]);
								      String chem =displaygrade(students[i][1]);
								      String phy = displaygrade(students[i][2]);
								      System.out.printf("%10d %12s %11s %9s",(i+1),math,chem,phy);
									  System.out.printf("\n");
						      }
						      break;
				              }
			                    
							   		
				case "exit": {
				        
				        System.out.println("Exiting from the program");
						status =false;
						break;
						
				}
				default:{
					     System.out.println("Invalid choice");
                         break;
			            }
			
			}			
		}while(status);
	}
	public static String displaygrade(int score){
			
			if(score>=90 && score<=100){
				return "A";
			}else if(score>=80 && score<=89){
				return "B";
			}else if(score >=70 && score<=79){
				return "C";
			}else if(score >= 60 && score <=69){
				return "D";
			}else{
				return "Fail";
			}
	}	
	
}