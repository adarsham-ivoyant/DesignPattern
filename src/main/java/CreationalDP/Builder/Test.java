package CreationalDP.Builder;


public class Test {
    public static void main(String[] args) {
        HttpClient client = new HttpClient.HttpClientBuilder().method("Post").url("http://www.google.com").body("{}").secure("adi","123").build();
        System.out.println(client);
    }
}
