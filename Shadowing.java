public class Shadowing
{
int id=12;
String name="sindhu";
double salary=32000;
public void VShadowing(double salary)
{
int id=123;
String name="waste";

System.out.println("the id is:"+id);
System.out.println("the id is:"+name);
System.out.println("the id is:"+salary);
}
public static void main(String[] args)
{
Shadowing d=new Shadowing();
d.VShadowing(35000);
}
}


