

import java.io.*;
import java.lang.Thread;

class reverse{
	public static void main(String[] args)
	{
		
	
		try {
			for (int i = 100; i > 0; i--) {

				Thread.sleep(6000);
			
				
				System.out.println(i);
			}
		}
		catch (Exception e) {
		
			System.out.println(e);
		}
	}
}

