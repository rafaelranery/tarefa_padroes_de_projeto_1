import factory.Order;
import factory.factories.Factory;
import factory.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Order o = new Order(args[0], args[1]);
        Order o1 = new Order("L", "car");
        Order o2 = new Order("L", "truck");
        Order o3 = new Order("L", "motorcycle");

        Order o4 = new Order("E", "car");
        Order o5 = new Order("E", "truck");
        Order o6 = new Order("E", "motorcycle");

        List<Order> orderList = createList(o1, o2, o3, o4, o5, o6);

        produceOrders(orderList);
    }
    public static void produceOrders(List<Order> orderList) {
        for (Order order : orderList) {
            Factory factory = Factory.retrieveFactory(order.getCategory());
            Vehicle vehicle = factory.create(order.getTypeOfVehicle());
            System.out.println(
                    "The " + vehicle.getModel() + " is ready. Please come buy it!!!"
            );
            vehicle.horn();
            System.out.println("\n--------------------------\n");
        }
    }

    public static List<Order> createList(Order ...orders) {
        List<Order> orderList = new ArrayList<Order>();
        for (Order order : orders) {
            orderList.add(order);
        }
        return orderList;
    }

}
