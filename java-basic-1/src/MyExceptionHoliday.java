import java.util.Scanner;

public class MyExceptionHoliday {

    private static int[] holidays = {3,4,5,6,10,11,17,18,24,25,31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("何日ですか？（終了したい場合はexitと入力）");
                String str = scanner.nextLine();
    
                if (str.equals("exit")) {
                    System.out.println(str + "が入力されました。終了");
                    break;
                }
                int date = Integer.parseInt(str);

                checkHoliday(date);

            } catch (NoHolidayException e) {
                e.printStackTrace();
                continue;
            } catch (Exception e) {
                System.out.println("正しい入力を行ってください");
                continue;
            }
        }

        scanner.close();
        return;
    }

    static void checkHoliday(int date) throws NoHolidayException {
        if (date < 1 || 31 < date) {
            System.out.println("5月" + date + "日は存在しません：1 ~ 31の範囲で入力してください。");
            return;
        }
        for (int h : holidays) {
            if (date == h) {
                System.out.println(date + "日はお休みです。");
                return;
            }
        }
        throw new NoHolidayException();
    }
}
