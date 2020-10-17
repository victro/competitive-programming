package com.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemSetFootball {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String players = in.readLine();
        System.out.println(Solver.solve(players));
    }
}


class Solver {
    public static String solve(String players) {
        if (players.contains("0000000") || players.contains("1111111")) {
            return "YES";
        }
        return "NO";
    }
}