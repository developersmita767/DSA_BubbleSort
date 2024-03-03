class Test
{
	public static void main(String args[])
	{
	  int arr[]={10,8,4,6,9};
	  int i,j,temp;
	  for(i=0;i<arr.length-1;i++)
	  {
	    for(j=0;j<arr.length-i-1;j++)
	    {
	      if(arr[j]>arr[j+1])
	      {
	        temp=arr[j];
	        arr[j]=arr[j+1];
	        arr[j+1]=temp;
	      }
	    }
	  }
	  System.out.println("after sorting");
	  for(i=0;i<arr.length;i++)
	  {
	   System.out.println(arr[i]);
	  }
	}
}