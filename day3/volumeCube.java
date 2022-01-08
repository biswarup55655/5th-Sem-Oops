class Box{
    double side, radius, depth;
    Box(double side){
        this.side=side;
    }
    Box(double radius,double depth){
        this.radius=radius;
	this.depth=depth;
    } 
    double volumeCube(double side){
        return Math.pow(side,3);
    }
    double volumeCone(double radius,double depth){
        return ((3.14*radius * radius * depth)/3);
    }
}

class volumeCube{
    public static void main(String args[]){        
        Box cube = new Box(5);
        Box cone = new Box(3,2);
        System.out.println(" Volume of cube is " + cube.volumeCube(cube.side));
        System.out.println(" Volume of mybox2 is " + cone.volumeCone(cone.radius,cone.depth));
    }
}