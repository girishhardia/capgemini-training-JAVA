/**
 * 
 */
package com.girish.pokebattle.model;

/**
 * 
 */
public class Bulbasaur extends Pokemon {
	
	final Type normalMove = Type.NORMAL;
	final Type specialMove = Type.GRASS;
	
	Bulbasaur(){
		this.setName("Bulbasaur");
		this.setType(Type.GRASS);
		this.setMaxHp(100);
		this.setHp(100);
		this.setAttack(40);
		this.setDefence(40);
		this.setSpeed(30);
	}
}
