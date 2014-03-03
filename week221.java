import java.io.*;

class week221 {
  public static void main(String[] args) throws Exception {
    System.out.println("name");
	InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(is);
    String name = in.readLine();
	
	System.out.println("birthday:(yyyy/mm/dd)");
	InputStreamReader a = new InputStreamReader(System.in);
    BufferedReader b = new BufferedReader(a);
    String bir = b.readLine();
	String ans[]=bir.split("/");
	int k=new Integer(ans[0]).intValue();
	k=k-1911;
	System.out.println(name+",your birthday is  "+k+"/"+ans[1]+"/"+ans[2]);
  }
}
