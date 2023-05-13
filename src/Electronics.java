public class Electronics {

    String manufacturer;
    int yearOfProduction;
    int price;


    public Electronics(String manufacturer, int yearOfProduction, int price) {
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                '}';
    }
}
