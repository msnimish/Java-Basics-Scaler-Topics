import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        Math Module
        int maxVal = Math.max(5,29);
        int minVal = Math.min(5,29);

        System.out.print(maxVal+" ");
        System.out.println(minVal);

        double x = Math.floor(3.2);
        double y = Math.ceil(3.2);
        double z = Math.round(3.2);
        double az = Math.round(3.8);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(az);
        */


        /*
        24-11-2023
        BigInteger class
        BigInteger a = new BigInteger("50000000000000000000000000");
        BigInteger b = new BigInteger("200000000000000000000000000");
        System.out.println(a);
        System.out.println(b);

        BigInteger c = a.add(b);
        BigInteger d = a.subtract(b);
        BigInteger e = a.multiply(b);
        BigInteger f = a.divide(b);
        BigInteger g = a.parallelMultiply(b);
        BigInteger h = a.pow(12);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        */


        /*Using BigInteger with other integral datatypes
        int x = 4854;
        long y = 235456421;
        BigInteger xB = new BigInteger(x+"");
        BigInteger yB = new BigInteger(y+"");

        System.out.println(xB);
        System.out.println(yB);

        BigInteger bgi = new BigInteger("3497");
        int i = bgi.intValue();

        BigInteger bgl = new BigInteger("26354697932");
        long j = bgl.longValue();

        System.out.println(i);
        System.out.println(j);*/

//        Factorial of a number
        int n = 6;
        int ans = 1;
        for(int i =1; i<=n;i++){
            ans = ans * i;
        }
        System.out.println(ans);

//        using BigInteger
        int m = 131;
        BigInteger ansB = new BigInteger("1");
        for(int i =1; i<=m;i++){
            BigInteger temp = new BigInteger(i+"");
            ansB = ansB.multiply(temp);
        }
        System.out.println(ansB);

    }
}