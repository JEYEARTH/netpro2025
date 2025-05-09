import java.util.Arrays;
import java.util.Random;

public class AverageC {

    public static void main(String[] args) {
        int N = 100;
        Subject[] scores = new Subject[N];

        int totalScore = 0;
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            int score = r.nextInt(101);
            Subject math = new Subject(score);
            math.setStudentId(i + 100);
            scores[i] = math;

            totalScore += score;
        }

        float averageScore = ((float)totalScore / (float)N);

        System.out.println("受験者全体での平均点は" + averageScore + "点です。\n");

        System.out.println("合格者の一覧は以下。");
        System.out.println("受験番号,点数");

        Arrays.sort(scores, (s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()));

        for (Subject math : scores) {
            if (math.getScore() < 80) continue;
            System.out.println(math.getStudentid() + "," + math.getScore());
        }

    }
}
