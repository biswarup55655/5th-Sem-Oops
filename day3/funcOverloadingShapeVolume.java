import java.io.*;
import java.lang.*;
class Box{
    public double volume(double s){ 
        return Math.pow(s,3);
    }
    public double volume(double a,double b){ 
        return ((3.14 * a * a * b)/3.0);
    }
}
class funcOverloadingShapeVolume{
    public static void main(String[] args){
        Box ob = new Box(); 
        double cubevol = ob.volume(5);
        System.out.println("sum of the two integer value :"+ cubevol);
        double conevol = ob.volume(3,2);
        System.out.println("sum of the three integer value :" + conevol);
    }
}