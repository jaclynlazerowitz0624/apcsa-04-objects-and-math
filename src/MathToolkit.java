public class MathToolkit {
    public static void main(String[] args) {
        // 1. In src/MathToolkit.java, use Math.sqrt and Math.pow to print the hypotenuse of legs 6 and 8.
        // 2. Print the distance between (1, 2) and (4, 6) with the distance formula. Expect 5.0.
        // 3. Print the absolute difference of 12 and 30, then of 7.5 and 9.25, using Math.abs.
        // 4. Enrichment (char is not tested): print a random capital, (char)('A' + (int)(Math.random() *
        //    26)).
        // 5. Print a random year from 1990 to 2010 inclusive. State n and min in a comment. Commit and
        //    push.
    
    int o = 6;
    int a = 8;
    int h = Math.pow(o, 2) + Math.pow(a, 2);
    int solved = Math.sqrt(h);

    int x = (4-1);
    int y = (6-2);
    int d = Math.pow(x, 2) + Math.pow(y, 2);
    int distance = Math.sqrt(d);

    int abs1 = Math.abs(12-30);
    int abs2 = Math.abs(7.5-9.25);

    System.out.println((char)('B' + (int)(Math.random() * 26)));

    System.out.print(Math.random(1990, 2011));
    // min = 1990
    // n = 2011-1990 = 21 +1 = 22, n=22
    
    }
}
