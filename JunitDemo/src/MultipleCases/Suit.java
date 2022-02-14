package MultipleCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import GreatestNo.GreatestNoTest;
import SquareRoot.SquareRootTest;
@RunWith(Suite.class)
@Suite.SuiteClasses({MultipleTest.class,SquareRootTest.class,GreatestNoTest.class})
public class Suit {
	//Runner is the class 
}
