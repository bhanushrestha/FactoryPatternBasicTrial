package battleShips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.HashMap;

public class Main {
	
		

	public static void main(String[] args) {
		BattleShipFactory battleShipFactory = new BattleShipFactory();
		try{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		EnemyBattleShip enemy = new EnemyBattleShip();
		enemy.showAttributes();
		
		
		BattleShip battleShip = null;
		
		//Show Attributes of Light Battle Ship
		System.out.println("Here are the available ships for you!! ");
		battleShip = new LightBattleShip();
		battleShip.showAttributes();
		
		//Show Attributes of Heavy Battle Ship
		battleShip = new HeavyBattleShip();
		battleShip.showAttributes();
		
		//Allow User to choose ship
		System.out.print("\nChoose your Ship ( L / H) : ");
		String choice = reader.readLine();
		
		//Assign chosen BattleShip as battleShip
		battleShip = battleShipFactory.chooseShip(choice);
		System.out.println("You chose "+battleShip.getName());
		
		System.out.println(doBattle(enemy,battleShip).getName()+" is the winner");
		}
		catch(IOException ex){
			System.out.println(ex.getLocalizedMessage());
		}
	}

	public static BattleShip doBattle(BattleShip enemy, BattleShip hero){
		BattleShip winner = null;
		double counter = 5;
		while(!(enemy.getHealth() <= 0 || hero.getHealth() <= 0)){
			double enemyTurn =   (counter/enemy.getSpeed());
			double heroTurn =   (counter/hero.getSpeed());
			
			if((enemyTurn - (int)enemyTurn)==0){
				System.out.println(enemyTurn + "Counter : "+ counter);
				hero.getAttacked(enemy.attackEnemy());
				if(hero.getHealth() <= 0){
					winner = enemy;
					break;
				}
			}
			if((heroTurn - (int)heroTurn)==0){
				System.out.println(heroTurn + "Counter : "+ counter);
				enemy.getAttacked(hero.attackEnemy());
				if(enemy.getHealth() <= 0){
					winner = hero;
					break;
				}
			}
			
			counter += 5;
		}
		
		
		
		
		return winner;
	}
	
}
