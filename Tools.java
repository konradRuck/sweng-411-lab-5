import java.util.List;

public abstract class Tools {
    private String name;
    private Double msrp;
    private double discount;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setMSRP(double m){
        msrp = m;
    }
    public double getMSRP(){
        return msrp;
    }
    public void setDiscount(double d) {
        discount = d;
    }
    public double getDiscount() {
        return discount;
    }

    public abstract void setCategory(String n);
    public abstract String getCategory();
    public abstract Double Measure(Wall wall, int xCoord, int yCoord);

    public void displayTool() {
        System.out.println("Tool name: " + name);
        System.out.print("Sale price: $");
        System.out.printf("%.2f", msrp * (1-discount));
        System.out.println();
    }
}