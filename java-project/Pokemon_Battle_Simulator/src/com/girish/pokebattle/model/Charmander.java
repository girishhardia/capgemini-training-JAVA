/**
 * 
 */
package com.girish.pokebattle.model;

/**
 * 
 */
public class Charmander extends Pokemon {

	/**
	 * @param name
	 * @param type
	 * @param maxHp
	 * @param hp
	 * @param attack
	 * @param defence
	 * @param speed
	 */
//	public Charmander(String name, Type type, int maxHp, int hp, int attack, int defence, int speed) {
//		super(name, type, maxHp, hp, attack, defence, speed);
//		// TODO Auto-generated constructor stub
//	}
	
	Charmander(){
		this.setName("Charmander");
		this.setType(Type.FIRE);
		this.setMaxHp(100);
		this.setHp(100);
		this.setAttack(50);
		this.setDefence(20);
		this.setSpeed(40);
	}

}
