/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issa
 */
public class OctalConverter extends NumberConverter{

    public OctalConverter(String number) {
        super(number, 8);
    }
    
    @Override
    public String toDecimal() {
        number = toBinary();
        NumberConverter convert = new BinaryConverter(number); 
        return convert.toDecimal();
    }

    @Override
    public String toBinary() {
     StringBuilder binaryResult = new StringBuilder();
    
    for (int i = 0; i < number.length(); i++) {
        int octalDigit = Character.getNumericValue(number.charAt(i));
        if (octalDigit < 0 || octalDigit > 7) {
            throw new IllegalArgumentException("Invalid octal digit: " + number.charAt(i));
        }
        String binaryGroup = String.format("%3s", Integer.toBinaryString(octalDigit)).replace(' ', '0');
        binaryResult.append(binaryGroup);
    }
    
    // Trim leading zeros
    while (binaryResult.length() > 1 && binaryResult.charAt(0) == '0') {
        binaryResult.deleteCharAt(0);
    }
    
    return binaryResult.toString();
    }

    
    @Override
    public String toOctal() {
        return this.number;
    }

    @Override
    public String toHex() {
        number = toDecimal();
        NumberConverter convert = new DecimalConverter(number); 
        return convert.toHex();
    }
    
    
}
