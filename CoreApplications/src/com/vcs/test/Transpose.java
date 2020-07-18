package com.vcs.test;


public class Transpose
{
	
	public static int[][] matrixTranspose(int a,int b,int c){
		
		int s=a;
		int i,j;

		int row = b;
		int column = c;
		int[][] array = new int[row][column];
		System.out.println("Enter matrix:");
	 	for(i = 0; i < row; i++)
	  	{
	   	    for(j = 0; j < column; j++) 
	     	    {
	        	array[i][j] = s;
	        	s++;
	        	System.out.print(" ");
	            }
	  	}
		System.out.println("The above matrix before Transpose is ");
	  	for(i = 0; i < row; i++)
	    	{
	      	    for(j = 0; j < column; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	 	System.out.println("The above matrix after Transpose is ");
	  	for(i = 0; i < column; i++)
	    	{
	      	    for(j = 0; j < row; j++)
	            {
	                System.out.print(array[j][i]+" ");
	            }
	            System.out.println(" ");
	        }
	 
	  	return array;
		
	}
    public static void main(String args[])  
    {
	
    	int[][] mulMatrix=new int[4][4];
    	int s=1,i=0,j=0;
    	int row=2;int column=4;
    	
    	int[][] result=matrixTranspose(s, row, column);
    	
    		System.out.println(result.length);
    	
    		//matrix multipliation
    		
    		int frow=2;
    		int fcolumn=2;
    		
    		for(i = 0; i < frow; i++)
	    	{
	      	    for(j = 0; j < fcolumn; j++)
	            {
	      	    	mulMatrix[i][j]=result[i][j]*result[j][i];
	            }
	        }
    		
    		
    		for(i = 0; i < row; i++)
	    	{
	      	    for(j = 0; j < column; j++)
	            {
	      	    	System.out.println("Multiplication matrix:"+mulMatrix[i][j]);
	            }
	        }
	   }
}
