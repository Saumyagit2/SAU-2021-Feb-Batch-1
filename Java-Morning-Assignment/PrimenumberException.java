package com.assignment;
import java.io.IOException;
public class PrimenumberException extends Exception {
	public static void main(String args[])
	{
		int count=1;
		while(count<=100)
		{
			try {
				if(checkPrime(count))
				{
					throw new PrimenumberException();
					
				}
			    }
				catch(PrimenumberException e)
				{
					System.out.println("Prime number caught at "+count);
				}
				finally {
					count++;
				}
			}
	}

public static boolean checkPrime(int n)
{
			
	if(n<=1)
		return false;
	for(int i=2;i<n;i++)
	  if(n%i==0)
		  return false;
    return true;
	 
}

}
