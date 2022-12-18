public class Areas {
    public static void main(String[] args) {
        double r1 = 5.66, // circle
                b1 = 5, h1 = 6, // triangle
                l = 50, b2 = 30, // rectangle
                aaa = 60, // Equilateral triangle
                b3 = 20, h2 = 25.5, // parallelogram
                p = 12, q = 13.5, // rhombus
                aa = 24.6, b4 = 12; // isoceles triangle

        double a1 = 3.14 * r1 * r1;
        System.out.println("area of circle " + a1);
        double a2 = 0.5 * b1 * h1;
        System.out.println("area of triangle " + a2);
        double a3 = l * b2;
        System.out.println("area of rectangle " + a3);
        double a4 = ((aaa * aaa) * Math.sqrt(3)) / 4;
        System.out.println("area of equilateral triangle " + a4);
        double a5 = b3 * h2;
        System.out.println("area of parallelogram " + a5);
        double a6 = p * q;
        System.out.println("area of rhombus " + a6);
        double a7 = (b4 * (Math.sqrt((4 * aa * aa) - b4 * b4))) / 4;
        System.out.println("area of isoceles triangle " + a7);

    }
}
