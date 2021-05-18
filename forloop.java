import java.io.*;

class forloop{
	
	void table() throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number: ");
	int n=Integer.parseInt(br.readLine());
	for(int i=1;i<=10;i++){
	System.out.println(n+"x"+i+"="+(i*n));
}

}

	void swap() throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a number: ");
	int a=Integer.parseInt(br.readLine());
	System.out.print("Enter another number: ");
	int b=Integer.parseInt(br.readLine());
	System.out.println("a="+a);
	System.out.println("b="+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("Now a="+(a));
	System.out.println("Now b="+(b));	

}
	void swap1()throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a number: ");
	int a=Integer.parseInt(br.readLine());
	System.out.print("Enter another number: ");
	int b=Integer.parseInt(br.readLine());
	System.out.println("a="+a);
	System.out.println("b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	
}

	public static void main(String s[]) throws Exception {
	forloop obj=new forloop();
	//obj.table();
	//obj.swap();
	obj.swap1();
	System.out.println("Git Hub course");
	System.out.println("Github Second commit");
}

}