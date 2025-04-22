public abstract class NumberConverter {
    protected String number;
    protected int base;

    public NumberConverter(String number, int base) {
        this.number = number;
        this.base = base;
    }

    public abstract String toDecimal();
    public abstract String toBinary();
    public abstract String toOctal();
    public abstract String toHex();

    
}
