class Driver {
    public String Fullname;
    private String Address, // basics details
            Nationality,
            Gender;
    private int Age;
    private Double Weight = 0.0, // Physical stuff
            Height = 0.0;
    private String LicenseID, // ID Details
            LicenseType,
            DateExp;

    Driver(String Firtname, String LastName){
        Fullname = Firtname + LastName;
    }
    public void AddDriverProfile(String Address, String Nationality, String Sex) {
        this.Address = Address;
        this.Nationality = Nationality;
        this.Gender = Sex;
        this.Address = Address;
    }

    public void AddDriverWandH(Double Weight, Double Height) {
        this.Weight = Weight;
        this.Height = Height;
    }

    public void AddDriverLicense(String ID, String Type, String DateExp) {
        LicenseID = ID;
        LicenseType = Type;
        this.DateExp = DateExp;
    }

    public void ShowDriverinfo() {
        System.err.println("Driver’s name:\t\t" + Fullname);
        System.out.println("Age:\t\t\t" + Age);
        System.out.println("Nationality:\t\t" + Nationality);
        System.out.println("Sex: \t\t\t" + Gender);
        System.out.print((Weight > 0 ? "Weight:\t\t\t" + Weight + "\n" : ""));//Optional huhu XD
        System.out.print((Height > 0 ? "Height:\t\t\t" + Height + "\n" : ""));//Optional huhu XD
        System.out.println("Address:\t\t" + Address);
    }

    public void ShowDriverLicenseInfo() {
        System.out.println("Expiration date:\t" + DateExp);
        System.out.println("License number:\t\t" + LicenseID);
        System.out.println("License type:\t\t" + LicenseType);
    }
}
