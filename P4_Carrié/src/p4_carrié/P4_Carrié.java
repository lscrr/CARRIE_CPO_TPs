/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4_carrié;

/**
 *
 * @author lisa carrié
 */
public class P4_Carrié {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i <= 21; i++){
         Jeton J = new Jeton ("Jaune");
         String c = J.lireCouleur();
    System.out.println("jeton num "+i + " couleur :"+c);
        
        }
    for (int j=0; j>21 && j<=42; j++){   
        Jeton J = new Jeton ("Rouge");
        J.lireCouleur();
    
}
    }
    
}
