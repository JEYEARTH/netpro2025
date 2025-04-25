import java.util.Scanner;

public class PrintYourAge {

    public enum Nengo {
        // 定数
        REIWA(2019, "令和"),
        HEISEI(1989, "平成"),
        SHOWA(1926, "昭和"),
        TAISYO(1912, "大正"),
        MEIJI(1868, "明治");

        // フィールド
        private final int year;
        private final String moji;

        // コンストラクタ
        private Nengo(int year, String mojString) {
            this.year = year;
            this.moji = mojString;
        }
    }

    private static String calcYear(Nengo nengo, int year) {
        int a = year - nengo.year + 1;
        if (a == 1) {
            return nengo.moji + "元年";
        } else {
            return nengo.moji + a + "年";
        }
    }

    public static void main(String[] args) {
        // Scannerオブジェクトを作成し、System.inを引数に指定して初期化
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // ユーザーに年齢の入力を促す
            System.out.println("何歳ですか?");

            String str = scanner.nextLine();

            if (str.equals("q") || str.equals("e")) {
                System.out.println(str + "が入力されました。強制終了");
                break;
            }

            int age;

            try {
                age = Integer.parseInt(str);
            } catch(Exception e) {
                System.out.println("整数型を入力してください");
                continue;
            }

            System.out.println("あなたは" + age + "歳ですね。");
            System.out.println("あなたは10年後に、" + (age + 10) + "歳ですね。");
            if (age < 0 || 120 <= age) {
                System.out.println(age + "が入力されました。再入力してください。");
                continue;
            }

            int year = 2030 - age;

            String ans = "xxx年";
            if (Nengo.REIWA.year <= year) {
                // 令和
                ans = calcYear(Nengo.REIWA, year);
            } else if (Nengo.HEISEI.year <= year) {
                // 平成
                ans = calcYear(Nengo.HEISEI, year);
            } else if (Nengo.SHOWA.year <= year) {
                // 昭和
                ans = calcYear(Nengo.SHOWA, year);
            } else if (Nengo.TAISYO.year <= year) {
                ans = calcYear(Nengo.TAISYO, year);
                // 大正
            } else if (Nengo.MEIJI.year <= year) {
                ans = calcYear(Nengo.MEIJI, year);
                // 明治
            }

            System.out.println(ans);
        }

        scanner.close();
        return;

    }
}
