public class Demo<T>
{
T a1;
T a2;
Demo(T a1,T a2)
{
this.a1=a1;
this.a2=a2;
}
void display()
{
System.out.println(a1+" "+a2);
}
public static void main(String args[])
{
Demo<Integer> intobj1=new Demo<>(10,30);
intobj1.display();
Demo<Integer> intobj2=new Demo<>(40,50);
intobj2.display();

}
}