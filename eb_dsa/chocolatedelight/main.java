import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int C=sc.nextInt();
            int X = sc.nextInt();
            int Y= sc.nextInt();
            int chocolatesToBuy=Math.max(0,C-X);
            int totalCost=chocolatesToBuy * Y;
             System.out.println(totalCost);
        }
    }
}
