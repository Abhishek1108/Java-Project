import java.io.IOException;
import java.util.Scanner;

public class UserCrud {

	

	public static void main(String[] args) throws IOException {
		
		int i,j,n = 0;
		Regsistration R=new Regsistration();
            UserLogin u[] =new UserLogin[2];
            for (j=0;j<2;j++) {
            u[j]=new UserLogin();
            	u[j].getInput();
            }
		//UserLogin [] ul=new UserLogin[];
		//Scanner s = new Scanner(System.in);
		//n=s.nextInt();
		
		//for(i=1;i<=2;i++)
		//{
			//ul[i].getInput();
           /* for(i=0;i<2;i++)
            {
            	System.out.print(u[i].ID+"\n"+u[i].pass+"\n");
            }*/
		R.loginInfo();
		for( i=0;i<2;i++)
		{
			R.Check(u[i]);
		
		//R[i].Check(ul.ID);
		
		}
		do
		{
		if(R.n==0)
		{
			 System.out.println("You Must Regsister First");
			 UserLogin ul1 =new UserLogin();
			 ul1.getInput();
			 
			 R.loginInfo();
			 for( i=0;i<2;i++)
				{
					R.Check(u[i]);
				
				//R[i].Check(ul.ID);
				
				}
			 R.Check(ul1);
			 
			 
		}
		}while(R.n==0);
		//s.close();
		
//ul.getInput();
		

	}

}
