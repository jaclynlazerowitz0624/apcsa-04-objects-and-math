public class MathToolkit {
    public static void main(String[] args) {
        // 1. In src/MathToolkit.java, use Math.sqrt and Math.pow to print the hypotenuse of legs 6 and 8.
        // 2. Print the distance between (1, 2) and (4, 6) with the distance formula. Expect 5.0.
        // 3. Print the absolute difference of 12 and 30, then of 7.5 and 9.25, using Math.abs.
        // 4. Enrichment (char is not tested): print a random capital, (char)('A' + (int)(Math.random() *
        //    26)).
        // 5. Print a random year from 1990 to 2010 inclusive. State n and min in a comment. Commit and
        //    push.
    
    double o = 6;
    double a = 8;
    double h = Math.pow(o, 2) + Math.pow(a, 2);
    double solved = Math.sqrt(h);
    System.out.println(solved);

    double x = (4-1);
    double y = (6-2);
    double d = Math.pow(x, 2) + Math.pow(y, 2);
    double distance = Math.sqrt(d);
    System.out.println(distance);

    double abs1 = Math.abs(12-30);
    double abs2 = Math.abs(7.5-9.25);
    System.out.println(abs1);
    System.out.println(abs2);

    System.out.println((char)('A' + (int)(Math.random() * 26)));

    int min = 1990;
    int n = 22;
    int year = min + (int)(Math.random() * n);
    System.out.println(year);   

    
    }
}
