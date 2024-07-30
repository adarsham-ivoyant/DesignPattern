package CreationalDP.Singleton;

public class DateUtil {

    private static DateUtil instance;

    private DateUtil(){

    }
    public static DateUtil getInstance(){
        //lazy instantiation
        if(instance==null){
            instance = new DateUtil();
        }
        return instance;
    }
}
