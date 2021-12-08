public class Hello {
    public static int Addfive(int Hi){
        return Hi + 5;
    }
    public static void p(String val) {
        System.out.println(val);
    }
    public static void p(int val) {
        System.out.println(val);
    }
    public static void main(String[] args) {
        int x = 2;
        while (x <= 512){
            p(x);
            x = x*2;
        }
    }
}
