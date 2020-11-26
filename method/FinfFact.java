class FinfFact
{
public static void main(String a[])
{
int f=myFact(3);
int g=myFact(2);
int r=myFact(1);
int finalOutput=f/(g*r);
System.out.println(finalOutput);
double total=  FindAvg.avg(45.45,89.89,99.99);
System.out.println(total);
}
static int myFact(int nm)
{
int fact=1;
for(int i=1; i<=nm;i++)
{
fact=fact*i;
}
System.out.println(fact);
return fact;
}
}