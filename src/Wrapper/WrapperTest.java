package Wrapper;

public class WrapperTest {

    public static void main(String[] args) {

        //2
        //String - stores text, such as "Hello". String values are surrounded by double quotes
        String s1 = "Hello";
        String s2 = String.valueOf("Hello");
        String s3 = new String("Hello");
        String s4 = Integer.toString(10);

        //Integer - stores integers (whole numbers), without decimals, such as 123 or -123
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        //Integer i3 = new Integer(10); @Depricated since version 9
        Integer i4 = Integer.parseInt("10");

        //Float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        Float f1 = 19.99F;
        Float f2 = Float.valueOf(19.99F);
        //Float f3 = new Float(19.99F); @Depricated since version 9
        Float f4 = Float.parseFloat("19.99");

        //Double
        Double d1 = 19.99D;
        Double d2 = Double.valueOf(19.99);
        //Double d3 = new Double(19.99D); @Depricated since version 9
        Double d4 = Double.parseDouble("19.99");

        //char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        char c1 = 'A';
        char c2 = Character.valueOf('A');
        //char c3 = new Character('A'); @Depricated since version 9
        char[] c4 = s1.toCharArray();

        //boolean - stores values with two states: true or false
        boolean b1 = true;
        boolean b2 = Boolean.valueOf(false);
        //boolean b3 = new Boolean(true); @Depricated since version 9
        boolean b4 = Boolean.parseBoolean("false");

        //3

        Double d3 = Double.valueOf("3.14159265358979323846");

        //byte, short, int, float, long
        byte bMin = -128;
        byte bMax = 127;

        short sMin = -32768;
        short sMax = 32767;

        int iMin = -2147483648;
        int iMax = 2147483647;

        float fMin = -3.141592653589793F;
        float fMax = 3.141592653589793F;

        long lMin = -9223372036854775808L;
        long lMax = 9223372036854775807L;

        bMin = d3.byteValue();
        sMin = d3.shortValue();
        iMin = d3.intValue();
        fMin = d3.floatValue();
        lMin = d3.longValue();

        // 4
        // 4.1 Создать 2 переменные типа Double, одной из них присвоить значение 0.0
        Double nonZeroValue = 1.0;
        Double zeroValue = 0.0;

        // 4.2 Создать переменную типа Double nanValue и присвоить ей значение, деления ненулевой переменной на нулевую
        Double nanValue = nonZeroValue / zeroValue;

        // 4.3 Создать переменную infinityValue и присвоить ей значение, деления нулевой переменной саму на себя
        Double infinityValue = zeroValue / zeroValue;

        // 4.4 Вывести nanValue и infinityValue на экран
        System.out.println("nanValue: " + nanValue);
        System.out.println("infinityValue: " + infinityValue);

        // 4.5 Добавить по 2 блока if для каждого числа в которых проверяется результат выполнения методов isNaN и isInfinity
        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        }
        if (infinityValue.isNaN()) {
            System.out.println("Переменная infinityValue = NaN");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Переменная nanValue = Infinity");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        // 5. Создать 2 переменные типа Long и присвоить обеим значения 120
        Long var1 = 120L;
        Long var2 = 120L;

        // 5.1 Вывести на экран результат сравнения этих переменных по оператору ==
        System.out.println("Сравнение var1 и var2 (120L) по оператору ==: " + (var1 == var2));

        // 5.2 Заменить значения переменных на 1200, перепроверить сравнение
        var1 = 1200L;
        var2 = 1200L;
        System.out.println("Сравнение var1 и var2 (1200L) по оператору ==: " + (var1 == var2));
    }
}
