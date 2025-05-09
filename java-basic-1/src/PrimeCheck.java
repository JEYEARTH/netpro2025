import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrimeCheck {

    public static void main(String[] args) {

        int N = 100000;

        Map<String, Integer> map = new HashMap<>();

        Boolean isPrime = true;

        int pre = -1;
        for (int i = 3; i <= N; i++) {
            isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (pre == -1) {
                    pre = i;
                    continue;
                }
                String str = (pre % 10) + "-" + (i % 10);
                if (map.containsKey(str)) {
                    // str keyが存在する
                    map.put(str, map.get(str) + 1);
                } else {
                    // str keyが存在しない
                    map.put(str, 1);
                }
                pre = i;
                continue;
            }
        }

        List<Entry<String, Integer>> listEntries = new ArrayList<>(map.entrySet());

        // 降順にソート
        Collections.sort(listEntries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        // ランキング表示
        System.out.println("連続する素数の下一桁のペアの出現回数のランキング (出現回数 降順)");
        for (Entry<String, Integer> entry : listEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "回");
        }

    }
}
