
public class EsteSII {
	  /**
     * Método que pinta el tablero y el marco . Es un bucle que recorre cada casilla y la pinta.
     */
    public void pintar() {
      System.out.print( "   ");
        for( int v = 1; v < casillas.length +1; v ++){
            System.out.print( (v - 1) +"   ");
            
        }
        System.out.println();
        //"Tapa" del marco del tablero.
        System.out.print("  ");
        for(int p = 1; p <casillas.length-1 ;p++){
               System.out.print("_____");     
            }
         System.out.print("_");
        System.out.println();
        
        //Creación del resto del marco y del tablero.
        for(int o = 0; o<=9; o++){
            if(o== 0 ){//Primera línea en la cual no ha empezado el tablero.
                System.out.print(" |");
                for( int m = 0; m<casillas.length; m++){
                  System.out.print("   ");
                }              
                System.out.print("       |");
                System.out.println();
             
            }else if(o==1){//Creación del tablero y de los bordes del marco.
                 System.out.print("");
                 int i =0;
                 //Bucle creador de todo.
                        while( i<casillas.length) {
                            System.out.print(i + "| ");
                            //For creador de las líneas del tablero.
                            for(int j = 0; j<casillas[i].length ; j++) {
                                System.out.print(casillas[i][j].getContenido());
                                if(j !=7){
                                System.out.print(" | ");
                              }else { System.out.print( " "); }
                            }
                            System.out.print("|");
                            System.out.println();
                            i++;
                          //Bordes del marco  
                              if( i == 1 || i==3 || i==5 || i== 7 || i==2 || i==4 || i==6 ){   
                              System.out.print(" |---");
                              for( int m = 1; m<casillas.length-1; m++){
                                  if(m!=7){
                                   System.out.print("----");
                                }else { System.out.print( "----"); }
                                } 
                             System.out.print("----|");
                              System.out.println();
                  
                        }
                }
            }else if(o==9){//Base para el marco.
                System.out.print(" |");
                for( int m = 0; m<casillas.length; m++){
                  System.out.print("___");
                }              
                System.out.print("_______|");
                System.out.println();
               }
             
        }
}
	

}
