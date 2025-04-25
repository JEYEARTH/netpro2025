import java.math.BigDecimal;
import java.math.RoundingMode;

public class TheBoilingEarthEraB {

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

        int targetYear = 2025;
        System.out.println("真夏日連続ペア");
        for (int i = 0; i < 30; i++) {

            double a = temperatures[targetYear - 2016][i];
            double b = temperatures[targetYear - 2016][i + 1];

            if (a >= 30.0 && b >= 30.0) {
                System.out.print(getYeaString(targetYear, i + 1) + "  " + getTemp(a) + "℃");
                System.out.print("   と   ");
                System.out.print(getYeaString(targetYear, i + 2) + "  " + getTemp(b) + "℃");
                System.out.println();
            }

        }

    }
}
