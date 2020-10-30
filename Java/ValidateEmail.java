import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class ValidateEmail 
{
	public static void main (String [] args)
	{
		List<String> emailAddress = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("How many email you wish to validate");
		int emailCount = in.nextInt();
		System.out.println("Enter the " + emailCount + " email(s) you wish to validate");
		//String[] emailAddress = new String[emailCount];
		for(int i=0; i < emailCount; i++)
		{
			System.out.print("Email address " + (i + 1) + " = ");
			emailAddress.add(in.next());
		}
		System.out.println();
		
		for(String emailAddr : emailAddress)
		{
			System.out.println("The email address '" + emailAddr + "' is " + isEmailAddressValid(emailAddr));
		}
	}
	
	public static String isEmailAddressValid (String emailAddr)
	{
	    if (!validateEmailAddressFormat(emailAddr))
	    	return "not a valid format";
	    else if (!validateEmailAddressDomainName(emailAddr))
	    	return "not a valid email domain name";
	    else
	    	return "a valid format"; 
	}
	
	public static boolean validateEmailAddressFormat (String emailAddr)
	{
		Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
		Matcher matcher = pattern.matcher(emailAddr);  
	    return matcher.matches(); 
	}
	
	public static boolean validateEmailAddressDomainName (String emailAddr)
	{
		int aliasPosition = emailAddr.indexOf('@');
		String domainName = emailAddr.substring(++aliasPosition);
		Hashtable dnsServiceProvider = new Hashtable();
		dnsServiceProvider.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");

		try 
		{
			DirContext ictx = new InitialDirContext( dnsServiceProvider );
			Attributes attrs = ictx.getAttributes( domainName, new String[] { "MX" });
			Attribute attr = attrs.get( "MX" );
			if( attr == null )
			{
				attrs = ictx.getAttributes( domainName, new String[] { "A" });
				attr = attrs.get( "A" );
				if( attr == null )
					return false;
				else
					return true;
			}
			else
				return true;
		} 
		
		catch (NamingException e) 
		{
			return false;
		}
	}
}
