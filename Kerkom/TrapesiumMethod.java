/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kerkom01;
/**
 *
 * @author Mochamad Faishal
 */
public class haha {
    static double KelilingTrapesium(double atas, double bawah, double sisikanan, double sisikiri){
    double keliling = atas+bawah+sisikanan+sisikiri;
    return keliling;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Keliling Trapesium = "+KelilingTrapesium(6,8,10,10));
	
    }
    
}