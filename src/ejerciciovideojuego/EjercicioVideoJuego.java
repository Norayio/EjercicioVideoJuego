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
        
        
        
        
    }
    
}
