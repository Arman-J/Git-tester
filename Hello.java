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
    public static boolean memberIsLikelyToAttendMeeting(int grade, double meetings) {
        if(grade >= 9 && grade <= 12) {
            if(meetings >= 1) {
                return true;
            }
            else { return false; }
        }
        else { return false; }
    }
    public static void main(String[] args) {
        p(memberIsLikelyToAttendMeeting(3, 4.5));
        p(memberIsLikelyToAttendMeeting(12, 8.9));//damm how that even possiable
        p(memberIsLikelyToAttendMeeting(8, 0.0000003));
        p(memberIsLikelyToAttendMeeting(10, 0.0000003));
    }
}
