/**
 * 
 */
package com.girish.pokebattle.model;

/**
 * 
 */
public abstract class Pokemon {
	private String name;
	private Type type;
	private int maxHp;
	private int hp;
	private int attack;
	private int defence;
	private int speed;
	
//	public Pokemon(String name, Type type, int maxHp, int hp, int attack, int defence, int speed) {
//		this.name = name;
//		this.type = type;
//		this.maxHp = maxHp;
//		this.hp = hp;
//		this.attack = attack;
//		this.defence = defence;
//		this.speed = speed;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
