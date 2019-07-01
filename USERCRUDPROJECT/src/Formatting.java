import java.text.NumberFormat;


import java.util.Date;
import java.util.Locale;
import java.math.BigDecimal;
import java.text.DateFormat;

public class Formatting {
	public   void  printDetails( String ID,String email,String  dob, BigDecimal inc, String pass,String name ,String phn) {
//		String name;
	//	String phn;
	//String ID, email, dob, inc, pass;
		
		System.out.println( "Your Name is"+" "+Formatting.titleCase(name)+"\n"+"Your ID is"+" "+ID+"\n"+"Your Password is"+" "+pass+"\n"+" "+
	"Your email is"+email+"\n"+" "+"Your Phone Number is"+" "+phn+
				"\n"+"Your Date Of Birth is"+" "+dob+"\n"+"Your Income is"+" "+Formatting.currencyFormat(inc)+"\n");
		
	}
	
	
	Formatting(){}
	
		public static String currencyFormat(BigDecimal inc ) {
			Locale locale =new Locale("en", "IN");
			NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
			return nf.format(inc.doubleValue());
	}
		public static String dateFormat( String dob) {
			Date date = new Date();
			Locale locale =new Locale("en", "IN");
			DateFormat df = DateFormat.
					getDateInstance(DateFormat.FULL, locale);
			//System.out.println("Date is "+date);
			return df.format(dob);
		}
		public static String titleCase(String str) {
			String name ="";
			if(str!=null && str.trim().length()>0) {
				String strArr [] = str.split(" ");
				for(String st : strArr) {
					name += String.valueOf(st.charAt(0)).toUpperCase()
					+ st.substring(1).toLowerCase()+" ";
				}
			}
			return  name;
		}

	
	public static void main(String[] args) {
		

	}

}
