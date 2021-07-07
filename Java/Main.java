package CursoPOOUber.Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");    
        Car car = new Car("AMD112",new Account("Maruko", "MR321"));
        //car.driver= "Maruko";
        //car.license = "AMD112";
        car.printDataCar();

        Car car2 = new Car("INTEL231",new Account("Vilu", "VL355"));

        //car2.driver = "Vilu";
        //car2.license = "INTEL234";
        car2.printDataCar();        
        //System.out.println("La licencia es: "+car.license);

    }
    
}
