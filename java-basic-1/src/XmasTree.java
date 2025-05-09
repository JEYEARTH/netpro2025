import java.util.Scanner;

public class XmasTree {

    static private final char HA = '*';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("a,b,c,d で入力してください");
            String str = scanner.nextLine();

            if (str.equals("q") || str.equals("e")) {
                System.out.println(str + "が入力されました。強制終了");
                break;
            }

            int a, b , c;
            String d;
            try {
                String[] numStr = str.split(",");
                a = Integer.parseInt(numStr[0]);
                b = Integer.parseInt(numStr[1]);
                c = Integer.parseInt(numStr[2]);
                d = numStr[3];
            } catch (Exception e) {
                System.out.println("正しい入力を行ってください");
                continue;
            }

            // 木の葉と雪
            for (int i = 0; i <= a; i++) {
                // 木の左側
                for (int j = 0; j < a - i; j++) {
                    if ((i + j) % 3 == 2) {
                        System.out.print(d);
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(HA);
                }

                // 木の右側
                for (int j = 0; j < i; j++) {
                    System.out.print(HA);
                }
                for (int j = i; j < a; j++) {
                    if ((i + j) % 3 == 1) {
                        System.out.print(d);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // 木の幹
            for (int i = 0; i < c; i++) {
                // スペース
                for (int j = 0; j < a - (b / 2); j++) {
                    System.out.print(" ");
                }
                // 幹
                for (int j = 0; j < b; j++) {
                    System.out.print(HA);
                }
                System.out.println();
            }

        }

        scanner.close();
        return;
    }
}
