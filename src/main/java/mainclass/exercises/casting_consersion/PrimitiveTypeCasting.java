package mainclass.exercises.casting_consersion;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        byte dataByte = 10;
        short dataShort = 7;
        char dataChar = 'u';

        short convShort = dataByte;
        int convInt = convShort;
        long convLong = convInt;

        System.out.println("The implicit casting (byte -> short -> int -> long): " + convLong);

        double convDouble = convInt;
        System.out.println("The implicit casting (int -> double): " + convDouble);

        int convIntFromChar = dataChar;
        System.out.println("The implicit casting (char -> int): " + convIntFromChar);

        float convFloat = dataShort;
        double convDoubleFromFloat = convFloat;
        System.out.println("The implicit casting (short -> float -> double): " + convDoubleFromFloat);

        long valueLong = 8;
        int valueInt = (int) valueLong;
        short valueShort = (short) valueInt;
        byte valueByte = (byte) valueShort;
        System.out.println("The explicit casting (long - > int -> short -> byte): " + valueByte);
    }
}
