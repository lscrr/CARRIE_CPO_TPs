/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4_carrié;

/**
 *
 * @author lisa carrié
 */
public class Grille {
    Cellule CellulesJeu [][]= new Cellule [6][7];
    
    public Grille (){
        CellulesJeu = new Cellule [6][7];
    }
    
    public  boolean ajouterJetonDansColonne (Jeton j, int col){
        if (CellulesJeu[0][col]!= null){
        return false;
        }else{
            for (int i=0; i<=5; i++){
                if (CellulesJeu[i][col]!=null){
                    CellulesJeu[i-1][col].affecterJeton(j);
                    return true;
                }
            }
        }
    }
}
