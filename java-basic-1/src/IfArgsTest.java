public class IfArgsTest {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        /* 以下を改造する。 **/
        if (7 <= x && x <= 9) {
            System.out.println(x + " is big Number");
        } else if (4 <= x && x <= 6) {
            System.out.println(x + " is middle Number");
        } else if (1 <= x && x <= 3) {
            System.out.println(x + " is small Number");
        } else {
            System.out.println(x + " is out of scope");
        }

    }// main end
}// class end