package poly.car1;

import poly.car1.Model3Car;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();


        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경 model3fh

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
