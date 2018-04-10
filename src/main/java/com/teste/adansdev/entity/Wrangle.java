package com.teste.adansdev.entity;

public class Wrangle {

    private int match;
    private Long killTime;
    private Player killer;
    private Player killed;
    private Player weapon;

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public Long getKillTime() {
	return killTime;
    }

    public void setKillTime(Long killTime) {
	this.killTime = killTime;
    }

    public Player getKiller() {
	return killer;
    }

    public void setKiller(Player killer) {
	this.killer = killer;
    }

    public Player getKilled() {
	return killed;
    }

    public void setKilled(Player killed) {
	this.killed = killed;
    }

    public Player getWeapon() {
	return weapon;
    }

    public void setWeapon(Player weapon) {
	this.weapon = weapon;
    }
}
