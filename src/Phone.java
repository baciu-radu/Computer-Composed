public class Phone extends Electronics{

    public Screen screen;
    String type;

    public Phone(String manufacturer, int yearOfProduction, int price, String type) {
        super(manufacturer, yearOfProduction, price);
        this.type = type;
    }
}
