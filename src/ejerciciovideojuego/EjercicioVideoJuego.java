package ejerciciovideojuego;

//imports
import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Norayio
 */

public class EjercicioVideoJuego {

    public static void main(String[] args) {
        
        // creamos un ArrayList de tipo VideoJuego
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>( );
        
        // crear 5 videojuegos y guardarlos en la colección
        VideoJuego vjuego1 = new VideoJuego( );
        
        /**
         *  videoJuego 1
         */
        vjuego1.setCodigo(123);
        vjuego1.setTitulo("Banjo Kazooie");
        vjuego1.setConsola("Nintendo 64");
        vjuego1.setCantJugadores(4);
        vjuego1.setCategoria("plataforma");
        
         /**
          * videoJuego 2, 3, 4, 5
          */
        VideoJuego vjuego2 = new VideoJuego( 456, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
        VideoJuego vjuego3 = new VideoJuego( 789, "Age of Empire II", "PC", 1, "Estratefia");
        VideoJuego vjuego4 = new VideoJuego( 101, "Counter Strike 1.6", "PC", 1, "Shooter");
        VideoJuego vjuego5 = new VideoJuego( 100, "Mario Kart", "Nintendo 64", 2, "plataforma");
        
        // agregamos los videojuegos creados a la lista "listaVideoJuegos"
        listaVideoJuegos.add(vjuego1);
        listaVideoJuegos.add(vjuego2);
        listaVideoJuegos.add(vjuego3);
        listaVideoJuegos.add(vjuego4);
        listaVideoJuegos.add(vjuego5);
        
        // recorrer el ArrayList y mostrar por consola
        
        /**
         *  por cada videoJuego : de la listaVideoJuegos
         */
        for (VideoJuego videoJuego : listaVideoJuegos ) {
            
            System.out.println("titulo: "+ videoJuego.getTitulo( ) );
            System.out.println("consola: "+ videoJuego.getConsola( ) );
            System.out.println("cantidad de jugadores: "+ videoJuego.getCantJugadores( ) );
            
        }
        
        // espacios para mejor lectura
        System.out.println("----------");
        System.out.println("----------");
        
        // cambiar el nombre y la cantidad de jugadores de dos video juegos a elección
        // mostrar los datos de todos los video juegos para ver los cambios.
        
        /**
         *  Banjo Kazooie
         */
        vjuego1.setTitulo("Banjo Kazooie II");
        vjuego1.setCantJugadores(1);
        
        /**
         *  Mario Kart
         */
        vjuego5.setTitulo("Mario Kart 64");
        vjuego5.setCantJugadores(5);
        
        
       // recorrer el ArrayList y mostrar por consola los video juegos que sean de Nintendo 64
       for ( VideoJuego videoJuego : listaVideoJuegos ) {
           
           if ( videoJuego.getConsola( ).equals("Nintendo 64") ) {
               
               System.out.println(videoJuego.toString( ) );
           } else {
               System.out.println("no es de Nintendo 64");
           }
           
       }
        
       
       
       
       
    }
    
}
