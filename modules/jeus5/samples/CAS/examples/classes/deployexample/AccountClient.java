package comaccount;

import java.util.*;
import java.rmi.server.*;
import java.rmi.*;
import javax.naming.*;

public class  AccountClient {
	
    AccountHome home = null;
    Account obj = null; 

    private void run() { 
    	try { 
    	    if(System.getSecurityManager() == null)
    		    System.setSecurityManager(new RMISecurityManager()); 
    
    	    InitialContext ctx = new InitialContext();
    
    	    // basic test
    	    home = (AccountHome)ctx.lookup("MyComAccount"); 
    	    System.out.println("lookup done");
    	    Collection col = home.findAll();			
			java.util.Iterator iter = col.iterator();        
			while (iter.hasNext()) {
				Object obj = iter.next();				
				if ( obj instanceof Account ) {
					printAccount((Account)obj);
				}
			}
			System.out.println("print done");
    	} catch (Exception e) { 
    		e.printStackTrace();
    	} 
    }	

	private void printAccount(Account ac) throws Exception {
		System.out.println( "Account ID: " + ac.getAccountId() );
		System.out.println( "Account Type: " + ac.getType() );
		System.out.println( "First Name: " + ac.getFirstName() );
		System.out.println( "Last Name: " + ac.getLastName() );
		System.out.println( "Balance: " + ac.getBalance() );
		System.out.println( "Credit Limit: " + ac.getCreditLimit() +"\n");
	}
    	
    public static void main(String args[]) {
    	AccountClient client = new AccountClient();
    	client.run();
    }
}
