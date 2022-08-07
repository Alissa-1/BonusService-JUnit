import ru.netology.javaqa.javamvn.services.SqrtService;

public class Main {
    public static void main(String[] args) {
        int x = 5;

        while (x < 10) {
            System.out.println(x);
            x = x + 1;
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        int y = 28;
        for (int i = 0; i <= y; i++) {
            if (i * i >= y) {
                System.out.println(i);
                break;
            }
        }

        System.out.println();
        SqrtService service = new SqrtService();
        System.out.println(service.sqrt(27));
    }
}
