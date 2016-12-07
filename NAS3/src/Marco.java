
public class Marco {
	/**
     * Tablero con marco 
     * 
     * @author(Marta Navarro Edo)
     * 
     */
    
     public static void main (String[] args){
    
    pintar();
     }
    public void pintar() {
        for(int o = 0; o<=10; o++){
            if(o== 0 || o ==10){
                System.out.print("  ");
               for(int p = 0; p <=10;p++){
                
                System.out.print("___");
                
                }
               System.out.println();
               System.out.println();
            }else if(o==1){
                        for(int u = 0; u <1; u++){
                        System.out.print("");
                        for(int i = 0; i<casillas.length; i++) {
                            System.out.print("|   ");
                            for(int j = 0; j<casillas[i].length; j++) {
                                System.out.print(casillas[i][j].getContenido());
                                System.out.print("   ");
                            }
                            System.out.print("|");
                            System.out.println();
                            
                            
                            
                            
                        }
                        
                    }
               }
        }
        }
}
