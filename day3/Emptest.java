class Emp{
	String name;
  	int id;
  	public  String toString (){
    		String s="This is Emp Class. name is- "+ name +" id is: "+ id;
    		return s;
  	}
}
class Scientist extends Emp{
	int no_of_publication;
 	int experience;
 	public  String toString (){
   		String s="This is Scientist Class. name is- "+ name +" id is: "+ id +" no_of_publication is: "+  no_of_publication +" experienceis: "+ experience;
   		return s;
 	}
}

class Dscientist extends Scientist{
	int award;
  	public  String toString (){
    		String s="This is Scientist Class. name is- "+ name +" id is: "+ id +" no_of_publication is: "+  no_of_publication +" experience is: "+ experience + " award = " + award;
    		return s;
  	}
}
class Emptest{
	public static void main(String[] args){
	Emp e=new Emp();
  	e.name="Biswarup Roy";
  	e.id=12345;
  	String s=e.toString();
  	System.out.println(s);

 	Scientist sc=new Scientist();
 	sc.name="Biswarup Roy";
 	sc.id=1234;
 	sc.no_of_publication=3;
 	sc.experience=5;
 	System.out.println(sc.toString());

  	Dscientist dsc=new Dscientist();
  	dsc.name="Biswarup Roy";
  	dsc.id=123456;
  	dsc.no_of_publication=4;
  	dsc.experience=6;
  	dsc.award=10;
  	System.out.println(dsc.toString());

	}

}