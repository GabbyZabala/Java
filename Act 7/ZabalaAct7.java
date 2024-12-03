class Television {
    String brandName, type, resolution;
    int screenSize, weight;
    double price;

    private static int objectCount = 0;

    public Television() {
        objectCount++;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void viewBrandName() {
        System.out.println("Brand Name: " + brandName);
    }

    public void viewType() {
        System.out.println("Type: " + type);
    }

    public void viewResolution() {
        System.out.println("Resolution: " + resolution);
    }

    public void viewScreenSize() {
        System.out.println("Screen Size: " + screenSize + " inches");
    }

    public void viewWeight() {
        System.out.println("Weight: " + weight + " kg");
    }

    public void viewPrice() {
        System.out.println("Price: $" + price);
    }

    public void loading() {
        System.out.println("\tLoading.....");
    }

    public void optionsDisplay() {
        System.out.println("Menu");
        System.out.println("| TV | Youtube | Netflix | Disney | Hulu | Spotify |");
        System.out.println("Youtube Selected");
    }

    public void status() {
        System.out.println("\tLow Internet Connection! Cannot continue to play Youtube video");
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

public class ZabalaAct7 {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setBrandName("LG");
        tv1.setType("OLED");
        tv1.setScreenSize(55);
        tv1.setWeight(18);
        tv1.setResolution("4K");
        tv1.setPrice(999.99);

        System.out.println("First Television:");
        tv1.viewBrandName();
        tv1.viewType();
        tv1.viewScreenSize();
        tv1.viewWeight();
        tv1.viewResolution();
        tv1.viewPrice();
        tv1.loading();
        tv1.optionsDisplay();
        tv1.status();

        Television tv2 = new Television();
        tv2.setBrandName("Samsung");
        tv2.setType("QLED");
        tv2.setScreenSize(65);
        tv2.setPrice(1299.99);

        System.out.println("\nSecond Television:");
        tv2.viewBrandName();
        tv2.viewType();
        tv2.viewScreenSize();
        tv2.viewPrice();

        Television tv3 = new Television();
        tv3.setBrandName("Sony");
        tv3.setType("LED");
        tv3.setScreenSize(75);
        tv3.setResolution("8K");
        tv3.setPrice(1999.99);

        System.out.println("\nThird Television:");
        tv3.viewBrandName();
        tv3.viewType();
        tv3.viewScreenSize();
        tv3.viewResolution();
        tv3.viewPrice();

        System.out.println("\nTotal Televisions created: " + Television.getObjectCount());
    }
}
