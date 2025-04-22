public class BinaryConverter extends NumberConverter {
    public BinaryConverter(String number) {
        super(number, 2);
    }

    @Override
    public String toDecimal() {
        int result = 0;
      String re = "";
      for (int i = number.length()-1; i >= 0; i--) {
          
             re += number.charAt(i);
       } 
      number = re;
      for (int i = 0; i < number.length(); i++) {
          
              result += (Math.pow(2, i)) * ((int)number.charAt(i) -48);
       }
       return Integer.toString(result);
    }

    @Override
    public String toBinary() {
        return this.number;
    }

    @Override
    public String toOctal() {
        number = toDecimal();
        NumberConverter convert = new DecimalConverter(number);
     return convert.toOctal();
    }

    @Override
    public String toHex() {
        number = toDecimal();
        DecimalConverter decimalConverter = new DecimalConverter(number);
       return decimalConverter.toHex();
    }
    
}
