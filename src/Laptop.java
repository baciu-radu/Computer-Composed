public class Laptop extends Computer{

    public Laptop(String manufacturer, int yearOfProduction, int price, Cpu cpu, RamMemory ramMemory, Screen screen) {
        super(manufacturer, yearOfProduction, price);
        this.cpu = cpu;
        this.ramMemory = ramMemory;
        this.screen= screen;

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", cpu=" + cpu +
                ", ramMemory=" + ramMemory +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                '}';
    }
}
