import java.io.*;
class  Date  
{
	int m;
  int yyyy(int y){
    if(y<0)
	return  0;
	else
	return  1;
  }
  int MM(int mm){
	m=mm;
	if(m<0||m>12)
    return  0;
	else
	return  1;
  }
   int dddd(int d){
    if(m==1 || m==3 ||m==5 ||m==7 ||m==8 ||m==10 ||m==12)
  {
	if(d >0 && d<=31)
		return 1;
	else
		return 0;
  }
  else if(m ==4 || m ==6 || m ==9 || m ==11)
  {
  	if(d >0 && d<=30)
		return 1;
	else
		return 0;
  }
  else 
  {
    if(d >0 && d<=28)
		return 1;
	else
		return 0;
  }
  }
  }
  public class week232
{
  public static void main(String[] args) {
    Date   d = new Date ();
		String temp ;
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.println("yyyy/MM/dddd");
		temp=type.nextLine();
		String ans[]=temp.split("/");
		int y=new Integer(ans[0]).intValue();
		int m=new Integer(ans[1]).intValue();
		int dd=new Integer(ans[2]).intValue();
		int a=d.yyyy(y);
		int b=d.MM(m);
		int c=d.dddd(dd);
		if(a==1&&b==1&&c==1)
		System.out.println("true!");
		else
		System.out.println("error!");
		
  }
}
