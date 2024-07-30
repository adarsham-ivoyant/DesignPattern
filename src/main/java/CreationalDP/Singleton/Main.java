package CreationalDP.Singleton;

public class Main {
    public static void main(String[] args) {
        DateUtil1 dateUtil1 = DateUtil1.getInstance();

        DateUtil1 dateUtil2 = DateUtil1.getInstance();

        System.out.println(dateUtil1==dateUtil2);

    }
}
