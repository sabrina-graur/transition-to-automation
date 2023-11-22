package mainclass.exercises;

public class WrapperClassCasting {
    public static void main(String[] args) {

        Integer dataInt = 7;
        Double dataDouble = 7.77;
        Float dataFloat = 77.7f;
        Character dataChar = 'S';

        int unboxedInt = dataInt;
        double unboxedDouble = dataDouble;
        float unboxedFloat = dataFloat;
        char unboxedChar = dataChar;
        System.out.println("Wrapper class int variable : " + dataInt);
        System.out.println("Unboxed int variable : " + unboxedInt);

        System.out.println("Wrapper class double variable : " + dataDouble);
        System.out.println("Unboxed double variable : " + unboxedDouble);

        System.out.println("Wrapper class float variable : " + dataFloat);
        System.out.println("Unboxed float variable : " + unboxedFloat);

        System.out.println("Wrapper class char variable : " + dataChar);
        System.out.println("Unboxed char variable : " + unboxedChar);
    }
}
