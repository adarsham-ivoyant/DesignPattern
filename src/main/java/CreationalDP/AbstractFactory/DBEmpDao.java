package CreationalDP.AbstractFactory;

public class DBEmpDao implements Dao{


    @Override
    public void save() {
        System.out.println("saving Emp to database");
    }
}
