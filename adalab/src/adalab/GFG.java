package adalab;

import java.util.Scanner;
public class GFG {
    static void minSpacePreferLarge(int wall, int m, int n)
    {
        int num_m = 0, num_n = 0, min_empty = wall;
        int p = wall/m, q = 0, rem=wall%m;
          num_m=p;
          num_n=q;
          min_empty=rem;
        while (wall >= n) {
            q += 1;
            wall = wall - n;
            p = wall / m;
            rem = wall % m;
            if (rem <= min_empty) {
                num_m = p;
                num_n = q;
                min_empty = rem;
            }
            q += 1;
            wall = wall - n;
        }
        System.out.println("the no of first shelve:"+num_m + "\nthe no of second shelve:" + num_n + "\nthe remaining space in the wall is:" + min_empty);
    }
 
    public static void main(String[] args)
    {
        int wall,m,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the wall space");
        wall=s.nextInt();
        System.out.println("enter the width of first shelve");
        m=s.nextInt();
        System.out.println("enter the width of second sheve");
        n=s.nextInt();
        minSpacePreferLarge(wall, m, n);
    }
}