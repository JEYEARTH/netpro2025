import java.math.BigDecimal;
import java.math.RoundingMode;

public class TheBoilingEarthEraC {

    private static String getYeaString(int targetYear, int date) {
        return targetYear + "年7月" + date + "日";
    }

    private static BigDecimal getTemp(double original) {
        BigDecimal bd = new BigDecimal(original);
        return bd.setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        double[][] temperatures = new double[10][31];

        double baseTemp = 29.0;
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[0].length; j++) {

                double temp = 5 - (Math.random() * 10);
                temperatures[i][j] = baseTemp + temp;
            }
            baseTemp += 0.3;
        }

        int count = 0;
        int targetYear = 2016;
        double targetTemp = 35.0;
        System.out.println("猛暑日連続ペア");
        for (int i = 0; i < temperatures.length; i++) {

            for (int j = 0; j < 30; j++) {
                double a = temperatures[i][j];
                double b = temperatures[i][j + 1];

                if (a >= targetTemp && b >= targetTemp) {
                    System.out.print(getYeaString(targetYear, i + 1) + "  " + getTemp(a) + "℃");
                    System.out.print("   と   ");
                    System.out.print(getYeaString(targetYear, i + 2) + "  " + getTemp(b) + "℃");
                    System.out.println();
                    count ++;
                }

            }

            targetYear += 1;
        }

        System.out.println("猛暑日ペアの回数 : " + count);

    }
}
