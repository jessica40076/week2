import java.io.*;
class  Circle  
{

  double[]list=new double[10];
  int ang=0,count=1,num=0;
  
  double Arc(){
    return  2 *Math.PI * list[num] * ang/360;
  }
  double Pie(){
    return  list[num] * list[num] *Math.PI * ang/360;
  }
  }
  public class week231
{
  public static void main(String[] args) {
    Circle  c = new Circle();
	int temp=0;
	for(int i=0;;i++)
	{
	
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.print("編號" +c.count+ "半徑: (-1結束)");
		temp=type.nextInt();
		if(temp==-1)
		    break; 
		else
		{
			c.list[c.count] = temp;
			c.count++;			
		}
	}
while(true)
{

	java.util.Scanner type1 = new java.util.Scanner(System.in);
    System.out.print("選擇編號:");
	temp=type1.nextInt();
	
    if(temp>=c.count)
		System.out.println("無此編號!");
	else
	{
	c.num = temp;
	break;
	}
}
while(true)
{
	java.util.Scanner type2 = new java.util.Scanner(System.in);
    System.out.print("角度:");
    temp= type2.nextInt();
	if(temp>360)
		System.out.println("角度無大於360");
	else
	{
	c.ang=temp;
	break;	
	}
}
	System.out.println("Arc:"+c.Arc());
	System.out.println("Pie:"+c.Pie());
  }
}
