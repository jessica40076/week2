import java.io.*;
class  Circle  
{
  public double []list=new double[10];
  public int ang=0,count=1,num;
  public double Arc(){
    return  2 *Math.PI * list[num] * ang/360;
  }
  public double Pie(){
    return  list[num] * list[num] *Math.PI * ang/360;
  }
  }
class Oval extends Circle{
	int tnum;
	double a;
	double[]list2=new double[10];
	double Pie1() { 
		return Math.PI * super.list[tnum] * list2[tnum];
	}	
}

  public class week241
{
  public static void main(String[] args) {
    Circle  c = new Circle();
	Oval t = new Oval();
	int temp=0;
	for(int i=0;;i++)
	{
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.print("編號" +c.count+ "長軸: (-1結束)");
		temp=type.nextInt();
		if(temp==-1)
		    break; 
		else
		{
		c.list[c.count] = temp;
		java.util.Scanner typee = new java.util.Scanner(System.in);
		System.out.print("編號" +c.count+ "短軸: (-1結束)");
		temp=typee.nextInt();
			if(temp==-1)
		    break; 
			else
			{
			t.list2[c.count]=temp;
			c.count++;
			}			
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
	t.tnum = temp;
	break;
	}
}

	System.out.println("Pie:"+t.Pie1());
  }
}
