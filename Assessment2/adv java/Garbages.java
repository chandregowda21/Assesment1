public class Garbages {
    public void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        Garbages obj1 = new Garbages();
        obj1 = null;
        System.gc();
    }
}