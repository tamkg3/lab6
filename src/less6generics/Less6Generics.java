/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less6generics;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Dark Magician
 */
public class Less6Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lists = new ArrayList();
        lists.add(5);
        lists.add(0.7f);
        lists.add(true);
        lists.add("Tam");
        for(Object x: lists)
        {
           
            System.out.println(x);
            
        }
    }
    
}
