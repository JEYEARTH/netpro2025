public class CarImple implements IDrivable {
    public int speed;

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println("Driving at " + this.speed + " kilometers per hour.");
    }

    @Override
    public int speedDown(int dwspeed) {
        this.speed -= dwspeed;
        return this.speed;
    }

    @Override
    public int speedUp(int upspeed) {
        this.speed += upspeed;
        return this.speed;
    }

    @Override
    public void stop(int withintime) {
        System.out.println("stopping with in " +withintime);
        try {
            Thread.sleep(withintime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.speed = 0;
        System.out.println("stopped");
    }
}