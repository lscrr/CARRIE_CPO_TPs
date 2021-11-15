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
                if (CellulesJeu[i][col].jetonCourant==null){
                    CellulesJeu[i-1][col].affecterJeton(j);
                return true;
                }  
            }
        }
        return true;
    }
    
    public boolean etreRemplie(){
        for(int j=0; j<=6; j++){
            if (CellulesJeu[0][j]== null){
                return false; 
            } else {
            return true;
            }  
        }
        return true;
    }
    
    public void viderGrille (){
        for (int i=0; i<= 5; i++){
            for (int j=0; j<=6; j++){
                CellulesJeu[i][j].jetonCourant=null;
            }
        }
    }
    
    public void afficherGrilleSurConsole (){
        for (int i=0; i<=5; i++){
            for (int j=0; j<=6; j++){
                System.out.print(CellulesJeu[i][j]);
            }
        }
    }
    
    public boolean celluleOccupee (int a, int b){
        for  (a=0; a<=5; a++){
            for ( b=0 ; b<=6; b++){
                if (CellulesJeu[a][b]==null){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return true;
    }
    
    public String lireCouleurDuJeton (int  a , int b){
            return CellulesJeu[a][b].lireCouleurDuJeton();
        }
    }
    
    public boolean etreGagnantePourJouer (Joueur G){
        
    }
    
    public boolean colonneRemplie (int i){
        
    }
}
