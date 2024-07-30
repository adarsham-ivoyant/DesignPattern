package CreationalDP.Factory;

public class CheesePizza implements Pizza{

    @Override
    public void prepare(){
        System.out.println("Preparing cheese Pizza");
    }

    @Override
    public void bake(){
        System.out.println("Backing cheese Pizza");
    }

    @Override
    public void cut(){
        System.out.println("cutting cheese Pizza");
    }


}
