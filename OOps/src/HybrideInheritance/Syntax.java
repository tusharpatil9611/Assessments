package HybrideInheritance;

public class Syntax 
{

	interface Grandparent
    {       
        //list of members
    }
    interface Parent1 extends Grandparent
    {       
        //list of members
    }
    interface Parent2 extends Grandparent
    {           
        //list of members
    }
    class Child implements  Parent1,Grandparent
    {           
        //list of members
    }
}
