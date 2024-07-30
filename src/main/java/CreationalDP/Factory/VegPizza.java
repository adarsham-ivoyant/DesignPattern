package CreationalDP.Factory;

public class VegPizza implements Pizza{
    @Override
    public void prepare(){
        System.out.println("Preparing vegPizza Pizza");
    }

    @Override
    public void bake(){
        System.out.println("Baking VegPizza Pizza");
    }

    @Override
    public void cut(){
        System.out.println("Cuting the VegPizza Pizza");
    }
}

