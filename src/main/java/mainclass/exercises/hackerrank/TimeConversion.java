package mainclass.exercises.hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:01:00PM";
        System.out.println("The input: " + s);
        System.out.println("The output: " + timeConversion(s));
    }

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        if (s.contains("PM") && hour != 12) {
            hour += 12;
        }
        if (s.contains("AM") && hour == 12) {
            hour = 0;
        }
        String hourString = String.format("%02d", hour);
        s = s.replaceFirst("\\d{2}", hourString);
        s = s.replaceAll("(AM|PM)", "");
        return s;
    }
}
