package battleShips;

import java.util.HashMap;

public class BattleShipFactory {
	HashMap<String, BattleShip> cShip = new HashMap<String, BattleShip>();
	public BattleShipFactory(){
		
		
		cShip.put("l", new LightBattleShip());
		cShip.put("h", new HeavyBattleShip());
	}
	
	public BattleShip chooseShip(String chosenShip){
		if(chosenShip.equalsIgnoreCase("l")){
			return cShip.get("l");
		}
		else if(chosenShip.equalsIgnoreCase("h")){
			return cShip.get("h");
		}
		else{
			return null;
		}
			
	}

}
