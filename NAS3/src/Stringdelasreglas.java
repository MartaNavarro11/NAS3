
public class Stringdelasreglas {
	 /**
     * String para el mensaje de bienvenida.
     */
    public static String Bienvenida(){
       String s = "¡BIENVENIDOS AL JUEGO DE LOS PINGÜINOS!" + "\n" ;
       //String de las reglas del juego.
       s += "\n" + "·Reglas del juego:" + "\n" ;
       String reglamento = "-Los pingüinos se mueven en línes recta unicamente." + "\n" + "-Los movimientos se limitan a ARRIBA/ABAJO , DERECHA/IZQUIERDA." + 
                            "\n" + "-Un pingüino sólo puede escoger como destino una placa de hielo que no esté ocupada." + "\n" + 
                            "-NO puede cruzar por placas de hielo ocupadas por otro pingüino, ni por espacios en los que no haya hielo." + "\n"
                            + "-Sólo se pueden introducir números enteros." + "\n" ;
       //String de cuando se acaba el juego y de cuando gana un jugador.
       s += reglamento + "\n";
       String ganaracabar = "¿CUÁNDO ACABA EL JUEGO?" + "\n"+ "·El juego acaba cuando ningún pingüino puede moverse por las placas." +
                            "\n" + "\n" +  "¿QUIÉN GANA?" + "\n" + "·Gana el jugador que mayor número peces haya cazado.Si los dos tienen el mismo número es empate.";
       s+= ganaracabar + "\n" ;
       return s;
       }
}
