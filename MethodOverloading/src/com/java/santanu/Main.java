package com.java.santanu;

public class Main {

    public static void main(String[] args) {

        int newScore=calculateScore("Santanu", 500);
        System.out.println("New score " + newScore);

        calculateScore(300);

        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player. No score.");
        return 0;
    }
}
