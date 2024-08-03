package CreationalDP.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        DaoAbstractFactory daf = DaoFactoryProducer.producer("db");
        Dao dao = daf.createDao("emp");
        dao.save();
    }
}
