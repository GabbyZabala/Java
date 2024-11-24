public class Homie {
    public String Name;
    public int Age;
    public String PetName;
    public String Friend;
    public String IsHomieRacist;

    public void display_crimeRecord() {
        System.out.println("\nHomie's Name: \t" + Name);
        System.out.println(Name + " Age: \t" + (Age > 20 ? "Ye're Old Asf" : "He's too young"));
        System.out.println(Name + " Pet: \t" + PetName);
        System.out.println(Name + " Connection: \t" + Friend);
        System.out.println(
                "Is " + Name + " Racist?\t" + (IsHomieRacist == null ? "Hes Not I Swear Officer" : IsHomieRacist));
    }

    public void car_sounds_questMark() {
        System.err.println("He Sleep like: brroooooooommmmmmm, Brrrr, Brrrrroooom");
    }

    public void fav_gun() {
        System.err.println("and the AK goes: brbrrrrt brrt rbtt yatatatatata, cachaw~ wait thats lightning macqueen");
    }

    public Homie(String N, int A, String Pet, String F) {
        Name = N;
        Age = A;
        PetName = Pet;
        Friend = F;
    }

    public Homie(String N, int A, String Pet, String F, String isRacist) {
        Name = N;
        Age = A;
        PetName = Pet;
        Friend = F;
        IsHomieRacist = isRacist;
    }

    public Homie(String N, int A, String Pet) {
        Name = N;
        Age = A;
        PetName = Pet;
    }

    public static void main(String[] args) {
        Homie n = new Homie("Raynell", 19, "llenyar", "Jerome0");
        n.display_crimeRecord();
        n.car_sounds_questMark();
        n.fav_gun();

        Homie i = new Homie("Jan Russel", 20, "Reader", "Raynel", "Yes");
        i.display_crimeRecord();

        Homie g = new Homie("Jeroboam", 19, "None");
        g.display_crimeRecord();
    }
}