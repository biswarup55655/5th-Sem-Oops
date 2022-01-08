import java.util.*;
class Q3
{
    	float r;
    	float h;
	float l;

    Q3(float r,float h,float l)
    {
     	this.r=r;
      	this.h=h;
	this.l=l;
    }

    void Volume()
      {
        float vol=(3.14f*r*r*h)/3;
        System.out.println("vol="+vol);
      }
    void area()
    {
      float a=(3.14f*r*l)+(3.14f*r*r);
      System.out.println("Area="+a);
    }
}

class cone
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the radius: ");
	float r = sc.nextFloat();
	System.out.print("Enter the heigth: ");	
	float h = sc.nextFloat();
	System.out.print("Enter the length: ");	
	float l = sc.nextFloat();
    	Q3 ob=new Q3(r,h,l);
    	ob.Volume();
    	ob.area();

  }


}