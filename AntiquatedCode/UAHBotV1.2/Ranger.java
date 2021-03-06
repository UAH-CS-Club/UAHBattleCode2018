import bc.*;

class Ranger extends MobileUnit{

	public Ranger(Unit unit, GameController gc) {
		super(unit, gc);
	}
	
	public void process() {
		
		if (!unit.location().isOnMap()) {
			return;
		}
		
		if (LogicHandler.escaping && unit.movementHeat() < 10) {
			Utilities.moveTowardNearestRocket(unit, gc);
		}
		
		if (!Player.peaceful) {
			if(unit.attackHeat() < 10){
				Utilities.senseAndAttackInRange(unit, gc);
			}
			if(unit.movementHeat() < 10){
				Utilities.moveToNearestEnemy(unit, gc);
			}
		}
		if(unit.movementHeat() < 10){
			Utilities.moveRandomDirection(unit, gc);
		}
	}

}