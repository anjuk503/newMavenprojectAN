package mavenproject;

import java.io.IOException;

public class ReadExcel {
	public static void main(String args[]) throws IOException {
		Excel e=new Excel();
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				String s=e.readData(i, j);
				
				System.out.println(s);
			
			}
		}
		
	}

}
