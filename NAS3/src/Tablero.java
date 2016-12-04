/**
 * Write a description of class Prints here.
 * 
 * @author (marta) 
 * @version (chuli)
 */
public class Prints
{
    public static void main (String[] args){
        //Mensaje de bienvenida a los jugadores.
        System.out.println("¡BIENVENIDOS AL JUEGO DE LOS PINGÜINOS!");
        //Reglas del juego.
        System.out.println();
        System.out.println("·Reglas del juego:");
        System.out.println("-Los pingüinos se mueven en línes recta unicamente." + "\n" + "-Los movimientos se limitan a ARRIBA/ABAJO , DERECHA/IZQUIERDA." + 
                            "\n" + "-Un pingüino sólo puede escoger como destino una placa de hielo que no esté ocupada." + "\n" + 
                            "-NO puede cruzar por placas de hielo ocupadas por otro pingüino, ni por espacios en los que no haya hielo.");
       //Cuando acaba el juego.
       System.out.println();
       System.out.println("¿CUÁNDO ACABA EL JUEGO?");
       System.out.println("·El juego acaba cuando ningún pingüino puede moverse por las placas.");
       //Quien gana.
        System.out.println();
        System.out.println("¿QUIÉN GANA?");
        System.out.println("·Gana el jugador que mayor número peces haya cazado.Si los dos tienen el mismo número es empate.");
        
    
    
    
    }
}



