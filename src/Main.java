public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98.0;
        double heightInMeters = 1.87;
        int bmiIndex = service.calculate(weightInKg, heightInMeters);

        System.out.println(bmiIndex);
    }
}



