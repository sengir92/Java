package entity;

public class Car {
    private int id;
    private int model_id;
    private Car.Color color;
    private int km;
    private String plate;
    private Brand brand;
    private Model model;

    public enum Color {
        RED,
        BLUE,
        WHITE,
        GREEN,
        AQUA
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public Car.Color getColor() {
        return color;
    }

    public void setColor(Car.Color color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model_id=" + model_id +
                ", color=" + color +
                ", km=" + km +
                ", plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                ", brand=" + brand +
                '}';
    }
}
