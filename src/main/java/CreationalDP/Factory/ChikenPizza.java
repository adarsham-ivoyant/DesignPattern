package CreationalDP.Factory;

public class ChikenPizza implements Pizza{

    @Override
    public void prepare(){
        System.out.println("Preparing Chiken Pizza");
    }

    @Override
    public void bake(){
        System.out.println("Baking Chiken Pizza");
    }

    @Override
    public void cut(){
        System.out.println("Cutting Chiken Pizza");
    }
}
