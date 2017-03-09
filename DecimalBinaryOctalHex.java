
public class DecimalBinaryOctalHex implements IDecimalBinaryOctalHex {
    @Override
    public void decimalToBinary(int a) {
        System.out.println(a + " in Base 2 : " + Integer.toString(a, 2));
    }

    @Override
    public void decimalToOctal(int a) {
        System.out.println(a + " in Base 8 : " + Integer.toString(a, 8));
    }

    @Override
    public void decimalToHex(int a) {
        System.out.println(a + " in Base 16 : " + Integer.toString(a, 16));
    }

    @Override
    public void binaryToDecimal(String number) {
        System.out.println(number + " in Base 10 : " + Integer.parseInt(number, 2));
    }

    @Override
    public void octalToDecimal(String number) {
        System.out.println(number + " in Base 10 : " + Integer.parseInt(number, 8));
    }

    @Override
    public void hexToDecimal(String number) {
        System.out.println(number + " in Base 10 : " + Integer.parseInt(number, 16));
    }
}
