public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(98, 1.87);
        System.out.println(bmi);

        System.out.println();
        int bmi2 = service.calculate(82, 1.80);
        System.out.println(bmi2);

        System.out.println();
        int bmi3 = service.calculate(45, 1.58);
        System.out.println(bmi3);
    }
}