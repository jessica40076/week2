import java.io.*;
 class week222{
	public static void main(String[] args) throws Exception 
	{
		double ans=0;
		double	num1,num2;
		System.out.print("first number: ");
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(a);
		String n1 = b.readLine();
		num1=Double.valueOf(n1).doubleValue();
		while(true)
		{
			System.out.print("second number:(!=0) ");
			InputStreamReader a1 = new InputStreamReader(System.in);
			BufferedReader b1 = new BufferedReader(a1);
			String n2 = b1.readLine();
			num2=Double.valueOf(n2).doubleValue();
			if(num2==0)
			{
				System.out.print("error,second number =0 \r\n");
			}
			else
			break;
		};
		while(true)
		{
			System.out.println("Operator:(1) Plus (2)Minus(3) times(4)divide");
			InputStreamReader a2 = new InputStreamReader(System.in);
			BufferedReader b2 = new BufferedReader(a2);
			String Oper = b2.readLine();	
			int Oper1=new Integer(Oper).intValue();
		
		switch(Oper1){
			case 1:
				ans=(num1+num2);
				System.out.println("\r\n ans:="+ans);
				break;
			case 2:
				ans=num1-num2;
				System.out.println("\r\n ans:="+ans);
				break;
			case 3:
				ans=num1*num2;
				System.out.println("\r\n ans:="+ans);
				break;
			case 4:
				ans=num1/num2;
				System.out.println("\r\n ans:="+ans);
				break;	
				
			}	
		}
		
	}
}