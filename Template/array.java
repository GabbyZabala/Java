public class array {
    public static void main(String[] args) {
        String[] oneDimension = { "Sky", "Land", "Earth" };
        // oneDimension is the Layers Bricks
        // Callers is digging layer by layer
        System.out.println("\n\tOne Eye");
        for (String callers : oneDimension) {
            System.out.print(callers);
        }
        System.out.println("\n\tSecond Eye");
        String[][] twoDimension = { // two dimension arrray explore the ways multi array in one plane
                { "Heaven", "Cloud", "air" }, // example the heaven is the first world
                { "Sky", "Land", "Earth" }, // the earth is the second world
                { "Hot Ceilling", "Floors", "Burning floors" }, // the hell is the third world
                { "an", "adan", "eve" }
        };
        for (int i = 0; i < 3; i++) {
            for (String Calling : twoDimension[i]) {
                System.err.print(Calling);
            }
            System.err.print("\n");
        }
        System.out.println("\n\tThird Eye");
        String[][][] threedimension = {
                { // Reality one
                        { "World", "level" }, // Sample World
                        { "nigga", "you" } // sample world too
                },
                { // Reality Two
                        { "Heaven", "Cloud" }, // example the heaven is the first world
                        { "Sky", "Land", "Earth" }, // the earth is the second world
                        { "Hot Ceilling", "Floors", "Burning floors" } // the hell is the third world
                },
                { // Reality Three
                        { "Danger", "Evil" },
                        { "Identity", "Threat" },
                        { "unknown", "void" }
                }
        };
        for (int i = 0; i < threedimension.length; i++) {
            for (int y = 0; y < threedimension[i].length; y++) {
                for (String worldDetails : threedimension[i][y]) {
                    System.out.print(worldDetails);
                }
                System.out.println("\n\t");
            }
            System.err.println("\n\t\t");
        }
    }
}