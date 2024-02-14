class MethodGenerics
{
public static <T extends Comparable <T>> T max(T a,T b,T c)
{
if(a.compareTo(b)>0&&a.compareTo(c)>0)
return a;
else if(b.compareTo(a)>0&&b.compareTo(c)>0)
return b;
else
return c;
}
public static void main(String args[])
{
System.out.println("The max of 3 integers:"+max(10,20,30));
System.out.println("The max of 3 floats:"+max(0.2f,1.8f,2.8f));
System.out.println("The max of 3 doubles:"+max(1.08,1.28,1.43));
System.out.println("The max of 3 chars:"+max('A','M','N'));
System.out.println("The max of 3 strings:"+max("Student","CSE","SectionF"));
}
}
