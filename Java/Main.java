package CursoPOOUber.Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");    
        Car car = new Car();
        car.driver= "Maruko";
        car.license = "AMD112";
        car.printDataCar();

        Car car2 = new Car();
        car2.driver = "Vilu";
        car2.license = "INTEL234";
        car2.printDataCar();

        
        //System.out.println("La licencia es: "+car.license);

    }
    
}
