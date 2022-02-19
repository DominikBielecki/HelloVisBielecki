package pl.vistula.examples;

public class AutoBox {
    public static void main(String[] args) {
        //złe wykorzystanie automatycznego opakowywania i wypakowywania
        Double a, b, c;
        a = 10.2;
        b = 11.4;
        c = 9.8;

        Double avg = (a + b + c) / 3;
    }
}
