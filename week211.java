class week211 {
  public static void main(String[] args) {
    int[] a = {4, 23, 45};
	int[] b = {13, 54, 23};
    int sum = 0;
	int t=0;

	t=60-a[2];
	sum=sum+t;
	
	t=60-a[1]-1;
	t=t*60;
	sum=sum+t;
	
	t=b[0]-a[0]-1;
	t=t*3600;
	sum=sum+t;
	
	sum=sum+b[1]*60+b[2];
	
	System.out.println("sum="+sum);
  }
}
