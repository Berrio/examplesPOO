package Ejercicio18;
import java.util.ArrayList;

public interface Entregable<T> {

    public void entregar();
    public void devolver();
    public Boolean isEntregado();
    public T compareTo(T[] t);

}
