import java.math.BigDecimal;
import java.math.RoundingMode;

public class TheBoilingEarthEraA {
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
        for (int i = 0; i < temperatures[targetYear - 2016].length; i++) {
            BigDecimal temp = getTemp(temperatures[targetYear - 2016][i]);
            String ans = getYeaString(targetYear, i + 1) + " : " + temp + "℃";
            System.out.println(ans);
        }

    }
}
