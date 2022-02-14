package OverRide;

public class OverRide extends Planet
{
	 public static void hide()
     {
              System.out.println("The hide method in Earth.");
      }
      public void override()
  {
              System.out.println("The override method in Earth.");
      }
  public static void main(String[ ] args)
  {
	  			OverRide myEarth = new OverRide();
	  			Planet myPlanet = (Planet)myEarth;
	  			myPlanet.hide();                  
	  			myPlanet.override();
      }
}
class Planet
{
    public static void hide()
    {
                System.out.println("The hide method in Planet.");
        }
        public void override()
    {
                System.out.println("The override method in Planet.");
        }
}
