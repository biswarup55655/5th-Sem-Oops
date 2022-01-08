class Test
{
  int x=6;
  void show()
     {
        System.out.println(x);
  }
}

class outsideClass
{ 
public static void main(String[] args)
{
 Test obj=new Test();
 obj.show();
}
}