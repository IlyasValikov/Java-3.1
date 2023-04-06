import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(1.50 , 45);
        System.out.println(bmi);

    }
}