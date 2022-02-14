package ConstructorConscept;

public class ConstructorDemo {

	public static void main(String[] args)
	{
		condemo c1=new condemo(); //explicit call to default cons.
        condemo c2=new condemo(5); //explicit call to parameterized cons.
        condemo c3=new condemo(1,2,3); //explict call to parameterized cons.
        condemo c4=new condemo(c3); //implicit call to copy cons.
        c1.sum(); c2.sum();
        c3.sum(); c4.sum();
	}

}
