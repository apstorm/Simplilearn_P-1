package myPackage;

public class BubbleSort3 {

	public static void main(String[] args) {
		
		int[] data=new int[] {71,67,89,92,54};
		int max=5,temp;
		
		for(int i=max-1;i>=0;i--) //from i=4 to 0
		{
			for(int j=0;j<i;j++) //iteration:1=> j=0 to j=3
			{
				if(data[j]>data[j+1]) //(0,1) (1,2) (2,3) (3,4)
				{
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		
		//print the values after sorting
		for(int i=0;i<max;i++)
		{
			System.out.print(data[i]+" ");
		}
		
	}

}
