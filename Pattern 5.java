/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
        int n =5;
        
        for(int i=0;i<=2*n-1;i++)
        {
            int star = (i<=n) ? i : 2*n-i;
            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
