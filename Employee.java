public class Employee<T1,T2>
{
T1 eid;
T2 ename;
Employee(T1 eid,T2 ename)
{
this.eid=eid;
this.ename=ename;
}
public static void main(String args[])
{
Employee<Integer,String> empobj1=new Employee<>(100,"John");
Employee<Integer,String> empobj2=new Employee<>(101,"Sara");
System.out.println(empobj1);
System.out.println(empobj2);
}
public String toString()
{
return eid+" "+ename;
}
}