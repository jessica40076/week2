import java.io.*; 
import java.util.*;

class week224 {
  public static void main(String args[]) throws Exception { 	
	int option = 0, count = 0;
	String[][] Stu = new String[10][3];
	while(true)
	{	while(true)
				{
					System.out.println("學生編號/姓名/成績： (-1/結束至搜尋)");
					InputStreamReader is1 = new InputStreamReader(System.in);
					BufferedReader in = new BufferedReader(is1);
					String aaa = in.readLine();
					String[] list=aaa.split("/");
			
					if(list[0].equals("-1")==true )
						break;
					else
					{
						for(int k=0;k<3;k++)
						Stu[count][k]=list[k];							
						count++;
						System.out.print(count);
					}
				}
				int i=0;
				System.out.println("請輸入編號：");
					InputStreamReader is = new InputStreamReader(System.in);
					BufferedReader in1 = new BufferedReader(is);
					String num = in1.readLine();
					//int num1=new Integer(num).intValue();
				for(i=0; i<count; i++)
				{
					if(Stu[i][0].equals(num)==true)
					{
						System.out.print("編號\t姓名\t成績\r\n");
						System.out.println(Stu[i][0]+"\t"+Stu[i][1]+"\t"+Stu[i][2]+"\r\n");
						break;
					}
				}
				if(i == count)
					System.out.println("為搜尋到此筆資料!!");
	}

  }
}