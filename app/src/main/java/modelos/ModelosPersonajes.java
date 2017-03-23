package modelos;

import com.oscar.hdn2_oscar_crespo.R;

import java.util.ArrayList;

import beans.PersonajeBean;

public class ModelosPersonajes {
    public static ArrayList <PersonajeBean> getPersonaje () {
        ArrayList<PersonajeBean> personajes = new ArrayList<>();

        personajes.add(new PersonajeBean(
                R.drawable.nave_descripcion,
                "Protagonista",
                "Esta es la nave que controlaremos nosotros. Es una rápida nave de carreras" +
                        "que usaremos para acabar con todos los enemigos. " +
                        "Podremos movernos arriba y abajo " +
                        " con las flechas del teclado y disparar pulsando el boton espacio",
                R.drawable.nave));
        personajes.add(new PersonajeBean(
                R.drawable.nave_descripcion,
                "Enemigo",
                "Esta es la nave que usarán los enemigos más débiles. Nuestro objetivo será abatir " +
                        "a tantas de estas naves como podamos para poder enfrentarnos al " +
                        "boss final.",
                R.drawable.nave));
        personajes.add(new PersonajeBean(
                R.drawable.nave_descripcion,
                "Boss",
                "Es el enemigo más poderoso, mucho más grande que los enemigos normales, más fuerte " +
                        "y con ataques especiales. Deberemos derrotarlo para ganar la partida",
                R.drawable.nave));

        return personajes;
    }
}
