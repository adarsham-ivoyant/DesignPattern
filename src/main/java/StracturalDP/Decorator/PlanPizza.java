package StracturalDP.Decorator;

public class PlanPizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("Baking Plan Pizza");
    }
}
