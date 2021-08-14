package myPackage;

public class SelectionSort4 {

	public static void main(String[] args) {
		
		
		int[] data=new int[] {71,67,89,92,54};
		
		//one way
//		int max=data.length;
//		int[] sorted=new int[max];
//		
//		for(int i=0;i<max-1;i++)
//		{
//			int index=i;
//			for(int j=i+1;j<data.length;j++)
//			{
//				if(data[j]<data[index])
//				{
//					index=j;
//				}
//			}
//			int smallNumber=data[index];
//			data[index]=data[i];
//			data[i]=smallNumber;
//		}
//		
//		for(int d:data)
//		{
//			System.out.print(d+" ");
//		}
		
		//second way
		int i,index,j;
		for(i=0;i<data.length;i++)
		{
			index=i;
			for(j=i+1;j<data.length;j++)
			{
				if(data[j]<data[index])
				{
					index=j;
				}
			}
			int smallNumber=data[index];
			data[index]=data[i];
			data[i]=smallNumber;
		}
		
		for(int d:data)
		{
			System.out.print(d+" ");
		}

	}

}
