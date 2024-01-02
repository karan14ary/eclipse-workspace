package JaggedArray;

import java.util.Scanner;

public class JaggedArrayApp {

	public static void main(String[] args) {
		//Creating object of Scanner Class
      Scanner scan =new Scanner (System.in);
      System.out.println("Enter the number of rows");
      int row=scan.nextInt();
      //creating 2d jadded array
      float[][]arr=new float[row][];
      for(int i=0;i<=arr.length-1;i++) {
    	  System.out.println("Enter the number of players in each team"+(i+1));
    	  int col=scan.nextInt();
    	  arr[i]=new float[col];
      }
      //storing values in an array
      for(int i=0;i<=arr.length-1;i++) {
    	  for(int j=0;j<=arr[i].length-1;j++) {
    		  System.out.println("Enter the height of team"+(i+1)+" player "+(j+1));
    		  arr[i][j]=scan.nextFloat();    	  }
    	  
      }
      //displaying values inside the array
      for(int i=0;i<=arr.length-1;i++) {
    	  for(int j=0;j<=arr[i].length-1;j++) {
    		  System.out.println("The height of team"+(i+1)+" player "+(j+1)+" is "+arr[i][j]);
    	   	  }
    	  System.out.println();
      }
      
	}

}
