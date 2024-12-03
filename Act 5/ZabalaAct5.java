class MobilePhone {
    String Brand;
    String Model;
    String Color;
    Double MemorySizeGB;
    int Battery;

    MobilePhone(String EnterBrand, String EnterModel, String EnterPhoneColor, int EnterMemorySizeinGB,
            int EnterBatterySize) {
        this.Brand = EnterBrand;
        this.Model = EnterModel;
        this.Color = EnterPhoneColor;
        this.MemorySizeGB = EnterMemorySizeinGB + .0;
        this.Battery = EnterBatterySize;
    }

    void ShowPhoneData() {
        System.out.println("The brand of the phone is: " + Brand);
        System.out.println("The model of the phone is: " + Model);
        System.out.println("The color of the phone is: " + Color);
        System.out.println("The storage size of memory card installed on the phone is: " + MemorySizeGB + "GB");
        System.out.println("The battery of the phone is: " + Battery + "mAh\n");
    }

    void receiveText() {
        System.out.println("Tototot, Totot, Tototot! You received a message!\n");
    }

    void call() {
        System.out.println("The number you have dialed is either unattended or out of coverage area, Please try\r\n" + //
                " your call later.");
    }
}

public class ZabalaAct5 {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Nokia", "230", "Black", 32, 1200);
        phone.ShowPhoneData();

        phone.receiveText();
        System.out.println("Dialing!");
        phone.call();
    }
}
