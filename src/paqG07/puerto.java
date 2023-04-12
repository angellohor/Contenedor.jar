package paqG07;
import paqG07.*;
public class puerto {
    public almacen[] a = new almacen[3];

    public puerto() {
        a[0] = new almacen();
        a[1] = new almacen();
        a[2] = new almacen();
    }

    public boolean espacio(int num) {
        if (a[num].espacioa()){
            return true;
        } else return true;
    }

    public void apila(contenedor c) {
        if (a[0].apilacontenedor(c)) {
        } else if (a[1].apilacontenedor(c)) {
        } else if (a[2].apilacontenedor(c)) {
        }
    }

    public String desapila(int hub, int colum) {
        String desapilado = this.a[hub].desapilacontenedor(colum).toString();
        return desapilado;
    }
}
