package Training;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[][] arr= {{1,2,3},{5,6,7},{9,10,11},{13,14,0}};
		 * 
		 * for(int i=0;i<4;i++) { for(int j=0;j<4;j++) { System.out.print(arr[i][j]);
		 * System.out.println("\t");
		 * 
		 * } } System.out.println(" ");
		 */

		int abc[][]= {{3,5,6},{9,7,0},{1,2,-1}};
		int max=abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
				}
			}
		}
		System.out.println(max);
		
		Date dt=new Date();
		System.out.println(dt);
		
		SimpleDateFormat dt1=new SimpleDateFormat("MM/dd/yy");
		System.out.println(dt1.format(dt));
		
		Calendar csl=Calendar.getInstance();
		System.out.println(csl.get(Calendar.DAY_OF_MONTH));
		
	}

}
