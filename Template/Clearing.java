public class Clearing {

    public static void clear() {
        if (System.getProperty("os.name").contains("Windows")) {
            // For Windows
            System.out.print("\033c");
        } else {
            // For Linux/macOS
            System.out.print("\033[H\033[2J"); // ANSI escape code for clearing
            System.out.flush();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is before clearing the console.");
        clear(); // Clear the console
        System.out.println("This is after clearing the console.");
    }
}
