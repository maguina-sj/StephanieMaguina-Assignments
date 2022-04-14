package mainPackage;
import mammal.*;

public class Test {
	public static void main (String[] args) {
		mammal.Gorilla chauncy = new mammal.Gorilla(100);
		
		chauncy.throwSomething();
		chauncy.throwSomething();
		chauncy.throwSomething();
		
		chauncy.eatBananas();
		chauncy.eatBananas();
		
		chauncy.climb();
	}
}
