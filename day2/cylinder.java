import java.util.*;
class Q2
{
    float radius;
    float height;

    Q2(float x,float y)
    {
      radius=x;
      height=y;
    }

    void Volume()
      {
        float vol=3.14f*radius*radius*height;
        System.out.println("vol="+vol);
      }
    void area()
    {
      float a=(2*3.14f*radius*height)+(2*3.14f*radius*radius);
      System.out.println("Area="+a);
    }
}

class cylinder
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the radius: ");
	float r = sc.nextFloat();
	System.out.print("Enter the heigth: ");	
	float h = sc.nextFloat();
    	Q2 ob=new Q2(r,h);
    	ob.Volume();
    	ob.area();

  }


}