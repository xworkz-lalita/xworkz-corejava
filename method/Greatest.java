class FindGreatestNumber
{
public static void main(String a[])
{
int finalValue=maxOfTwoNumbers(420,840);
System.out.println(finalValue);
}
static int maxOfTwoNumbers(int number1,int number2)
{
if(number1 > number2)
return number1;
else
return number2;
}
}