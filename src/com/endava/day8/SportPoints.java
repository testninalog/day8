package com.endava.day8;

public class SportPoints {
    public int points(String[] scores) {

        int score = 0;
        for (int i = 0; i < 10; i++) {//for(String s : scores) sa for each
            String match = scores[i];
            String[] parts = match.split(":");//razdvajamo u odnosu na :
            int x = Integer.parseInt(parts[0]);//konvertujemo u int
            int y = Integer.parseInt(parts[1]);//moze i sa substring int y = Integer.parseInt(score.substring[2]);

            if (x > y) {
                score += 3;
            } else if (x == y) {
                score += 1;
            }
        }
        // sum += x>y ? 3 : x==y ? 1 : 0; uporedi x i y ako je tacno doda 3 ako nije proveri da li su jednaki, ako jesu doda 1, ako nije onda doda 0
        return score;
    }
}


