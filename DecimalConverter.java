/*
 * Click nbfnumber://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issa
 */
public class DecimalConverter extends NumberConverter{

    public DecimalConverter(String number) {
        super(number, 10);
    }
    
    @Override
    public String toDecimal() {
        return this.number;
    }

    @Override
    public String toBinary() {
    String result= "";
    int s = Integer.parseInt(number);
        while(s >0){
            result =  Integer.toString(s%2) + result;
            s=s/2;
        }
        return result;
    }

    @Override
    public String toOctal() {
        int result=0;
      // int i=0;
        while(Integer.parseInt(number) != 0) {
            result = (result * 10) + Integer.parseInt(number)%8;
            number= Integer.toString(Integer.parseInt(number) / 8 );      
        }
        number="";
        String se =  Integer.toString(result);
        for (int i = se.length()-1; i >= 0; i--) {
             number += se.charAt(i);
       }
        return number; 
    }

    @Override
    public String toHex() {
        String result ="";
         while(Integer.parseInt(number) != 0) {
             if(Integer.parseInt(number)%16<=9 && Integer.parseInt(number)%16>=0)
                 result = (result) + Integer.parseInt(number)%16;
             else{
                 switch(Integer.toString(Integer.parseInt(number)%16)){
             case "10" -> result += "A";
             case "11" -> result += "B";
             case "12" -> result += "C";
             case "13" -> result += "D";
             case "14" -> result += "E";
             case "15" -> result += "F";
             default -> result += "?";
             
         } 
             }
                 
             
            number= Integer.toString(Integer.parseInt(number) / 16 );      
        }
        number="";
        String se = (result);
        for (int i = se.length()-1; i >= 0; i--) {
             number += se.charAt(i);
       }
        return number;
   }
    
    
}
