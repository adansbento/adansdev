package com.teste.adansdev.entity;

import java.io.Serializable;

public class Wrangle implements Serializable {

    private int match;
    private String killtime;
    private Player killer;
    private Player killed;
    private String weapon;

    public Wrangle(){

    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public String getKilltime() {
        return killtime;
    }

    public void setKilltime(String killtime) {
        this.killtime = killtime;
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
