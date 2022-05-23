public class Main {
    public static void main(String[] args){
        Shapes shapes = new Shapes();

        shapes.area(new Circle());

        shapes.area(new Rectangle());

        shapes.area(new Square());

        System.out.println("This is a Static Polymorphism." +
                " Here a class called Shapes has three constructor" +
                " with single parameter but different types." +
                "We are calling this three constructors with an " +
                "object of Shapes class from Main class main mehtod" +
                "by passing different required parameters." +
                "That's why this is static polymorphism if we do this" +
                " by taking input from the user in the runtime then" +
                "it will be called dynamic polymorphism");
    }
}
