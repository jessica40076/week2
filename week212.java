class week212 {
  public static void main(String[] args) {
    double[] a = {1.2, 3.0, 0.8};
    double sum = 0.0;
	double ave = 0.0;
	int count=0;
    for (double x : a) {
      sum += x;
		count++;
	}
	ave=sum/count;
	System.out.println("sum="+sum);
	System.out.println("ave="+ave);
  }
}
