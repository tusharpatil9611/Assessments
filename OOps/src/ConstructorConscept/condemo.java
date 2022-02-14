package ConstructorConscept;

public class condemo {
	int x,y,z;
	condemo(){x=y=z=1;}
	condemo(int a)
	{
		x=y=z=a;
	}
	condemo(int p, int q, int r)
	{
		x=p;
		y=q;
		z=r;
	}
	condemo(condemo p)
	{
		x = p.x; y=p.y;  z=p.z;
	}
	public void sum()
	{
		System.out.println("Sum of the elements is:"+(x+y+z));
	}
}
