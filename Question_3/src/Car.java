public class Car {
    private String model;
    private String companyName;
    private String Color;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    Car(){
        engine=new Engine();
    }

    Car(String model, String companyName,String color, int rpm, int power, String manufacturer, boolean hasTurbo){
        this.setModel(model);
        this.setCompanyName(companyName);
        this.setColor(color);
        this.setEngine(new Engine());
        this.getEngine().rmp=rpm;
        this.getEngine().Power=power;
        this.getEngine().manufacturer=manufacturer;
        this.getEngine().enableTurbo(hasTurbo);
    }

}
