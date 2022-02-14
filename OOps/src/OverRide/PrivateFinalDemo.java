package OverRide;

public class PrivateFinalDemo 
{
	public static void main(String[ ] args)
    {   
		OverridingPrivate2 op2 = new OverridingPrivate2();
            op2.f(); 
            op2.g(); 
            OverridingPrivate op = op2;
            PrivateFinal wf = op2;
    }
}
