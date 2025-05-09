// 基底クラス
public class Vehicle {
    protected String brand = "Ford";        // Vehicleクラスで使用されるフィールド

    public void honk() {                    // Vehicleクラスのメソッド
        System.out.println("Tuut, tuut!");
    }
}

// CarクラスはVehicleクラスを継承する
class CarImpl extends Vehicle {
    private String modelName = "Mustang";   // Carクラスのフィールド

    public static void main(String[] args) {
        // Carオブジェクトの作成
        CarImpl myCar = new CarImpl();
        //Vehicle myCar = new CarImple();

        // CarオブジェクトでVehicleクラスのhonkメソッドを呼び出す
        myCar.honk();

        // Vehicleクラスのbrandフィールドにアクセス
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}