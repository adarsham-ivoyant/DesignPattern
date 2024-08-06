package StracturalDP.Decorator;

public class PizzaShop {
    public static void main(String[] args) {
        //Pizza pizza = new PlanPizza();
        //pizza.bake();

        //Pizza pizza = new CheesePizzaDecorator(new PlanPizza());
        //pizza.bake();

        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlanPizza()));
        pizza.bake();
    }
}
