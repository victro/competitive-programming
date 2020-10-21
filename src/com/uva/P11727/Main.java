package com.uva.P11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Collections;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) {
        FastReader in = new FastReader();
        Integer testCases = in.nextInt();
        for (Integer caseN = 1; caseN <= testCases; caseN += 1) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (Integer i = 0; i < 3; i +=1 ){
                arr.add(in.nextInt());
            }
            Solver.solve(caseN, arr);
        }
    }
}

class Solver {
    public static PrintStream solve(Integer caseN, ArrayList<Integer> arr) {
        Collections.sort(arr);
        return System.out.format("Case %d: %d%n", caseN, arr.get(1));
    }
}
