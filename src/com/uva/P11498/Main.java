package com.uva.P11498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        while (testCases > 0) {
            Integer N = in.nextInt();
            Integer M = in.nextInt();
            for (Integer i = 0; i < testCases; i += 1) {
                Integer x = in.nextInt();
                Integer y = in.nextInt();
                System.out.println(Solver.solve(x, y, N, M));
            }
            testCases = in.nextInt();
        }
    }
}

class Solver {
    public static String solve(Integer x, Integer y, Integer N, Integer M) {
        if (x.equals(N) || y.equals(M)) {
            return "divisa";
        }
        String result = "";
        if (y > M) {
            result += "N";
        } else {
            result += "S";
        }
        if (x > N) {
            result += "E";
        } else {
            result += "O";
        }
        return result;
    }
}
