package StracturalDP.Adapter;

public class WeatherUI {

    public void showTemperature(int zipcode){
        WeatherAdopter adopter =  new WeatherAdopter();
        System.out.println(adopter.findTemperature(zipcode));
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(19406);
    }
}
