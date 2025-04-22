/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issa
 */
public class HexadecimalConverter extends NumberConverter{

    public HexadecimalConverter(String number) {
        super(number, 16);
    }
    
    @Override
    public String toDecimal() {
        number = toBinary();
        NumberConverter convert = new BinaryConverter(number);
       return convert.toDecimal();
    }

    @Override
    public String toBinary() {
        number = number.replaceAll("\\number|0x", "");
    
    // Check if the input is a valid hexadecimal string
    if (!number.matches("[0-9A-Fa-f]+")) {
        throw new IllegalArgumentException("Input is not a valid hexadecimal string");
    }
    
    StringBuilder binary = new StringBuilder();
    for (int i = 0; i < number.length(); i++) {
        String hex = number.substring(i, i+1);
        int decimal = Integer.parseInt(hex, 16);
        String bin = Integer.toBinaryString(decimal);
        // Pad with zeros to ensure each hex digit is represented by 4 bits
        binary.append(String.format("%4s", bin).replace(' ', '0'));
    }
    
    return trimZero.Trim(binary.toString());

    }

    
    @Override
    public String toOctal() {
        number = toDecimal();
        NumberConverter convert = new DecimalConverter(number);
        return convert.toOctal();
    }

    @Override
    public String toHex() {
        return this.number;
    }
    
}
