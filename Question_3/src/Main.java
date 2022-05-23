public class Main {
    public static void main(String[] args){
        Car c1 = new Car();

        System.out.println("Car Model: "+c1.getModel());
        System.out.println("Car CompanyName: "+c1.getCompanyName());
        System.out.println("Car Color: "+c1.getColor());
        System.out.println("Car RPM: "+c1.getEngine().rmp);
        System.out.println("Car Power: "+c1.getEngine().Power);
        System.out.println("Car Engine Manufacturer: "+c1.getEngine().manufacturer);
        System.out.println("Car Has Turbo: "+c1.getEngine().hasTurbo);


        System.out.println("\n\n\n");


        Car c2 = new Car("Harrier","Tata","black",10000,110,"Tata",true);

        System.out.println("Car Model: "+c2.getModel());
        System.out.println("Car CompanyName: "+c2.getCompanyName());
        System.out.println("Car Color: "+c2.getColor());
        System.out.println("Car RPM: "+c2.getEngine().rmp);
        System.out.println("Car Power: "+c2.getEngine().Power);
        System.out.println("Car Engine Manufacturer: "+c2.getEngine().manufacturer);
        System.out.println("Car Has Turbo: "+c2.getEngine().hasTurbo);
    }
}
