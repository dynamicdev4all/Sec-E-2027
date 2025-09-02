public class First {
    public static void main(String[] args) {
        // System.out.println("JAVA");
        String name = "Deepak"; // POOL
        String name2 = new String("Deepak").intern(); // POOL
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
