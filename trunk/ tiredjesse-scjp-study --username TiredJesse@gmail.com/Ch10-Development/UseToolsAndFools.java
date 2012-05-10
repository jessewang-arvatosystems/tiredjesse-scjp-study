import example.tools.*;
import example.fools.*;

public class UseToolsAndFools {

	public static void main(String[] args) {
		Hammer hammer = new Hammer();
		Drill drill = new Drill();
		JoeThePlumber joe = new JoeThePlumber();

		hammer.hammerStuff();
		drill.drillStuff();
		joe.foolStuff();
	}


}