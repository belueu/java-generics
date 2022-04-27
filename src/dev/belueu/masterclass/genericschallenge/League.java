package dev.belueu.masterclass.genericschallenge;

import dev.belueu.masterclass.FootballPlayer;
import dev.belueu.masterclass.Team;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<FootballPlayer>> {
    public String name;
    private final ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void add(T team) {
        if (league.contains(team)) {
            return;
        }
        league.add(team);
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
