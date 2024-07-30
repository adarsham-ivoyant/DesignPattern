package CreationalDP.Singleton;

public class  DateUtil2 {

    private static volatile DateUtil2 instance;

    private DateUtil2(){

    }

    /*
    For example if we have two threads which are trying to create an instance of dateutil create the first thread

first enter this method it will do this check and it's about to create an instance.

In the meantime if another thread comes and does this check even before the first thread creates this instance

this expression here this line will evaluate to true.

It will go in and in the meantime the first thread would have created an instance and the second thread also will

create an instance so will end up having two instances at least to avoid that problem.

In Java we can mark this method as synchronized synchronized keyword.
     */

    public static DateUtil2 getInstance(){
        if(instance==null) {
            synchronized (DateUtil2.class) {
                if (instance == null) {
                    instance = new DateUtil2();
                }
            }
        }
        return instance;
    }
}
