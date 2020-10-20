// remove the following line to get it accepted
package com.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// UVA 11172 - Relational Operator
// https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2113
// Change the following line to "public class Main" to get it accepted
public class P11172 {
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
        FastReader in = new FastReader();
        Integer testCases = in.nextInt();
        for (Integer i = 0; i < testCases; i += 1) {
            Integer n1 = in.nextInt();
            Integer n2 = in.nextInt();
            System.out.println(Solver.solve(n1, n2));
        }
    }
}

class Solver {
    public static String solve(Integer n1, Integer n2) {
        if (n1 < n2) {
            return "<";
        } else if (n1 > n2) {
            return ">";
        }
        return "=";
    }
}