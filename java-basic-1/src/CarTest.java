public class CarTest {
    public static void main(String[] args) throws Exception {
        IDrivable myCar = (IDrivable) new CarImple();
        // myCar.speedとは書けない

        myCar.drive(20);
        System.out.println("Current speed is " + myCar.speedUp(5));
        System.out.println("Current speed is " + myCar.speedDown(8));
        myCar.stop(5);
    }
}
