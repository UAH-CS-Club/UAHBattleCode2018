import bc.*;

interface UnitInterface {
	
	//check if the class can process a given unit.
	//should probably make this not static at some point.
	//need to decide how to handle units.
	//make objects for each unit?
	boolean canProcess(Unit unit);
	
	//process a unit with the appropriate logic for its
	//type based on the class
	void process(Unit unit, GameController gc);
	
}