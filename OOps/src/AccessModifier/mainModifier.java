package AccessModifier;

public class mainModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.x=15;
	//	d.y=20;		//this is not access out side the class
		d.z=78;
		d.p=45;
		System.out.println(" "+d.x+" "+d.z+" "+d.p);
	}
}
