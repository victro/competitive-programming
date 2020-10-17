package com.codeforces.problemSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// codeforces link: https://codeforces.com/problemset/problem/4/A
public class A4 {
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

    FastReader in = new FastReader();

    public static void main(String[] args) {
        Integer testCases = 1;
        FastReader in = new FastReader();
        for (Integer i = 0; i < testCases; i += 1) {
            Integer num = in.nextInt();
            System.out.println(Solver.solve(num));
        }
    }
}

class Solver {
    public static String solve(Integer num) {
        if (num % 2 != 0 || num <= 2)
            return "NO";
        return "YES";
    }
}