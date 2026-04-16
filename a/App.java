public class App {

    public static boolean andOp(boolean a, boolean b) {
        return a && b;
    }

    public static boolean orOp(boolean a, boolean b) {
        return a || b;
    }

    public static void main(String[] args) {
        System.out.println("AND: " + andOp(true, false));
        System.out.println("OR: " + orOp(true, false));
    }
}