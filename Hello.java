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
    public static void p(boolean val) {
        System.out.println(val);
    }
    public static void main(String[] args) {
        Person Ben = new Person("Ben", 10, 1.4);
        Person John = new Person("John", 5, 7.0);
        Person Rain = new Person("Rain", 9, 8.9);//how she be doin that 8.9 meetings a week lmfao thats some dedication
        Person Jaco = new Person("Jaco", 9, 1);
        Person Cindy = new Person("Cindy", 9, 0);

        p("Is " + Ben.name + " going to attend?: " + (Ben.memberIsLikelyToAttendMeeting() ? "yes" : "no"));
        p("Is " + John.name + " going to attend?: " + (John.memberIsLikelyToAttendMeeting() ? "yes" : "no"));
        p("Is " + Rain.name + " going to attend?: " + (Rain.memberIsLikelyToAttendMeeting() ? "yes" : "no"));
        p("Is " + Jaco.name + " going to attend?: " + (Jaco.memberIsLikelyToAttendMeeting() ? "yes" : "no"));
        p("Is " + Cindy.name + " going to attend?: " + (Cindy.memberIsLikelyToAttendMeeting() ? "yes" : "no"));
    }
}
