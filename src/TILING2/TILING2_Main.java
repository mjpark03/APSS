package TILING2;

import java.util.Scanner;

/**
 * Created by undy on 2016. 1. 31..
 */
public class TILING2_Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        TILING2 tiling2 = new TILING2();

        int[] n = new int[t];

        for(int i=0; i<t; i++) {
            n[i] = scanner.nextInt();
        }

        for(int j=0; j<t; j++) {
            System.out.println(tiling2.tiling(n[j]));
        }
    }
}

class TILING2 {

    private static final int MOD  =     1000000007;
    private int[] cache = new int[101];

    public int tiling(int n) {

        if (n==1) return 1;
        if (n==2) return 2;

        if(cache[n] > 0) return cache[n];
        else cache[n] = (tiling(n-1) + tiling(n-2)) % MOD;

        return cache[n];
    }
}
