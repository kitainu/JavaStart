package ThisPrzeciązenie;

public class CalcTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(5,2);
        cal.printResult(result);
       int res = cal.add(1,2,3);
       cal.printResult(res);
        cal.add(2,1,3);
        double resu = cal.substract(9,8.2);
        System.out.println(cal.substract(9,8.2));
        cal.printResult(cal.substract(4,1));

    }
}
