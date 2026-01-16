/**
 * 
 */
package com.girish.pokebattle.model;

/**
 * here is enum which define type and has effectiveness logic
 */
public enum Type {
	FIRE,
	WATER,
	GRASS,
	NORMAL;
	
	public double getEffectiveness(Type moveType, Type defenderType) {
		if(moveType==defenderType) {
			return 1.0;
		}
		switch(moveType) {
			case FIRE:
				if(defenderType==WATER) return 0.5;
				if(defenderType==GRASS) return 2.0;
				
			case WATER:
				if(defenderType==FIRE) return 2.0;
				if(defenderType==GRASS) return 0.5;
				
			case GRASS:
				if(defenderType==WATER) return 2.0;
				if(defenderType==FIRE) return 0.5;
				
			case NORMAL:
				return 1.0;
		}
		return 1.0;
	}
}
