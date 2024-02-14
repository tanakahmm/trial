class MultipleMethods
{
public static <T1,T2,T3> void display(T1 a,T2 b,T3 c)
{
System.out.println(a+" "+b+" "+c);
}
public static void main(String args[])
{
display(200,340,500);
display(1.2f,50,60);
display("hello",4.5,89); 
}
}