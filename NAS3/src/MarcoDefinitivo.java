
public class MarcoDefinitivo {
	
	public void pintar() {
        //"Tapa" del marco del tablero.
        System.out.print(" ");
        for(int p = 0; p <casillas.length-1 ;p++){
               System.out.print("_____");     
         }
        System.out.println();
        
        //Creación del resto del marco y del tablero.
        for(int o = 0; o<=9; o++){
            if(o== 0 ){//Primera línea en la cual no ha empezado el tablero.
               System.out.print("|     ");
               for(int p = 0; p <casillas.length-1 ;p++){
                System.out.print("    ");
                }
               System.out.print("  |");
               System.out.println();   
            }else if(o==1){//Creación del tablero y de los bordes del marco.
                 System.out.print("");
                 int i =0;
                 //Bucle creador de todo.
                        while( i<casillas.length) {
                            System.out.print("|   ");
                            //For creador de las líneas del tablero.
                            for(int j = 0; j<casillas[i].length; j++) {
                                System.out.print(casillas[i][j].getContenido());
                                System.out.print("   ");
                            }
                            System.out.print("|");
                            System.out.println();
                            i++;
                          //Bordes del marco  
                              if( i == 1 || i==3 || i==5 || i== 7 || i==2 || i==4 || i==6 ){   
                              System.out.print("|    ");
                              for( int m = 0; m<casillas.length-1; m++){
                                System.out.print("    ");
                                } 
                             System.out.print("   |");
                              System.out.println();
                  
                        }
                }
            }else if(o==9){//Base para el marco.
                System.out.print("|");
                for( int m = 0; m<casillas.length-1; m++){
                  System.out.print("_____");
                }              
                System.out.print("|");
                System.out.println();
            }
        }
    }
}
