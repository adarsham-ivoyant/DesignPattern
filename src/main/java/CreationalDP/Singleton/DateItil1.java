package CreationalDP.Singleton;

class DateUtil1 {
    private static DateUtil1 instance = new DateUtil1();
    /*
    * also we can use static block for eager initialization
    static{
    instance = new DateUtil1();
    }
    * */

    private DateUtil1(){

    }
    public static  DateUtil1 getInstance(){

        return instance;
    }
}
