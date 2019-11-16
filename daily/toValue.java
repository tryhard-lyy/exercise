package baogao3.Test3;

public class toValue {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        Float floats = new Float(3.14f);
        Boolean booleans = new Boolean(true);
        Character character = new Character('c');

        int i = integer.intValue();
        float f = floats.floatValue();
        boolean b = booleans.booleanValue();
        char c = character.charValue();

        int abc = 1;
        String str = Integer.toString(c);
        String str1 = String.valueOf(c);

        String strTemp = "878";
        int d = Integer.parseInt(strTemp);
        int d1 = Integer.valueOf(strTemp);


    }
}
