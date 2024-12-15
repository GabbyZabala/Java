public class ZabalaAct8 {
    public static void main(String[] args) {
        Driver drive = new Driver("Kurt", "Zabala");
        drive.AddDriverProfile("Santa Lucia Nabua Baras Camarines ","PH, EAR", "M");
        drive.AddDriverLicense("0NW-23-9918SW","STUDENT","2026/09/05");
        //OPtional tong sa baba XD
        drive.AddDriverWandH(90.0,5.9);

        drive.ShowDriverinfo();
        drive.ShowDriverLicenseInfo();
    }
}
