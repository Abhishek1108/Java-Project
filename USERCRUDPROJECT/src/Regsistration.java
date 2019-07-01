
import java.io.IOException;

import java.util.Scanner;

public class Regsistration {

	public static String ID = "null";
	public static String Pass = "null";
	public int n=0;
	

	

	 public  void loginInfo() throws IOException {
			
				 Scanner scan =new Scanner(System.in);
				
					System.out.println("Please Enter Your Login Details");
					System.out.println("#####################");
					
					System.out.println("Enter User ID");
					ID=scan.nextLine();
					 System.out.println("Please Enter Password");
					  Pass=scan.nextLine();
		}
				 
			 public void Check(UserLogin a) {
				
				 if(ID.equals(a.ID)&& Pass.equals(a.pass))
				 {   
					n=1;
				  
					 int cp;
						String np,cp1;
						
						Scanner scan =new Scanner(System.in);
						System.out.println("##  WELCOME IN My KINGDOM ##");
						System.out.println("OR Btao KyA Hall Hai");
						System.out.println(" Press 1 To Change Password ");
						 cp=scan.nextInt();
						if(cp==1) {
							do
							{
							Scanner scanner=new Scanner(System.in);
							
						System.out.println("Enter Your New Password ");
						np=scanner.nextLine();
						System.out.println("Confirm Password");
						cp1=scanner.nextLine();
						if(np.equals(cp1))
							break;
						else
						{
						System.out.println("Password Mismatch");
							System.out.println("Please Confirm Your Password Again");
						}
						
					    }while(!np.equals(cp1));
							a.pass=np;
							System.out.println("Your password changed successfully");
						}
						
						else {
							System.out.println("Have A Nice Day");
						}
			
					
				 }	 
				
					
			     }
				 
			 
				 
	
			 }
	
		



