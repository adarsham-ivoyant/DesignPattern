package StracturalDP.Flyweight;

public class Rectangle extends Shape{
    private String label;

    public Rectangle(){
        label = "Reactangle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a "+label+" with length " +
                length+" breadth "+breadth+ " Fill Style "+ fillStyle );
    }
}
