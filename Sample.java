public class Sample<T>
{
T num1;
T num2;
Sample(T num1, T num2)
{
this.num1=num1;
this.num2=num2;
}
void display()
{
System.out.println(num1+" "+num2);
}
public static void main(String args[])
{
Sample<Integer> intobj=new Sample<>(10,20);
intobj.display();
Sample<String> strobj=new Sample<>("Hello","World");
strobj.display();
}}