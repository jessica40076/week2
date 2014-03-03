import java.io.*;

class week223 {
  public static void main(String[] args) throws Exception {
  int i;
    System.out.println("西元年:");
	InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(is);
    String year = in.readLine();
	int year1=new Integer(year).intValue();
			System.out.println("之前閏年為:");
		for(i = 0;i <= year1;i ++)
		{
			if(i%4==0 && i%100!=0)
				System.out.println(i);
			else if(i%400==0)
				System.out.println(i);
		}
  }
}