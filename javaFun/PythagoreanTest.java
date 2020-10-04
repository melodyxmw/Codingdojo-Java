public class PythagoreanTest {
    public static void main(String[] args) {
        int a =Integer.valueOf(args[0]);
        int b =Integer.valueOf(args[1]);
        Pythagorean p = new Pythagorean();
        double result = p.calculateHypotenuse(a, b);
        System.out.println(result);
    }
}