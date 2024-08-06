package StracturalDP.Adapter;

public class WeatherAdopter {

    public int findTemperature(int zipcode){
        String city = null;
        if(zipcode == 19406){
            city = "King of Prussia";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);

        return temperature;

    }
}
