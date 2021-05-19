package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest {
	
		public static void main(String[] args) {
		
			for(int i=1;i<=100;i++)
			{
				int tem=0;
				for(int j=2;j<=i-1;j++)
				{
					if(i%j==0)
					{
						tem=tem+1;
					}
				}
				if(tem==0 && i!=1)
				{
					System.out.print(i+" ");
				}
			}
			
	}
}
