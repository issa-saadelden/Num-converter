/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issa
 */
public class trimZero {
    public static  String Trim(String s){
        String result ="";
        boolean x = true;
        int i =0;
        while(i < s.length()){
            if(s.charAt(i) == '0' && x == true)
            {
                i++;
                continue;
            }
            else
            {
                 result += s.charAt(i);
                 i++;
                 x = false;
            }
        }
        return result;
    }
}
