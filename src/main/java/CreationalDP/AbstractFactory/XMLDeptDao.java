package CreationalDP.AbstractFactory;

public class XMLDeptDao implements Dao{

    @Override
    public void save() {
        System.out.println("saving Dept to XML");
    }
}
