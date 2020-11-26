class AddingNumbers
{
public static void main(String a[])
{
 int ot=add();
 System.out.println(ot);
 
 double ans=add(78,  65);
 System.out.println(ans);
}
static int add()
{
 int a=89;
 int b=78;
 int c= a+b;
 return c;
}
 static double add(double numOne, double numTwo)
 {
double s= numOne+numTwo;
 return s;
 }
}