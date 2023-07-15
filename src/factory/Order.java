package factory;

public class Order {
    protected String category;
    protected String typeOfVehicle;

    public String getCategory() {
        return category;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    private Order() {}; // impossibilita instanciação sem parâmetro (?)
    public Order(String category, String typeOfVehicle) {
        this.category = category;
        this.typeOfVehicle = typeOfVehicle;
    }
}
