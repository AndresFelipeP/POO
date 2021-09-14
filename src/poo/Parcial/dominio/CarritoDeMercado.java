package poo.Parcial.dominio;

import poo.taller.punto2a.dominio.Mecato;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeMercado {
    public static final byte CAPACIDAD = 20 ;
    private String supermercado;
    private List<Producto> productos;

    public CarritoDeMercado(String supermercado){
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();
    }

    public boolean agregar(Producto p) {
        if (this.productos.size() < CAPACIDAD) {
            if (p == null) {
                this.productos.add(p);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Producto buscar(String nombre) {
        Producto ProductoBuscado = null;

        for (Producto p: this.productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                ProductoBuscado = p;
                break;
            }
        }

        return ProductoBuscado;
    }

    public List<Producto> buscarPorTipo(String tipo) {
        Producto ProductoBuscado = null;

        for (Producto p: this.productos) {
            if (p.getTipo().equalsIgnoreCase(tipo)) {
                ProductoBuscado = p;
                break;
            }
        }

        return productos;
    }


    public boolean sacar(String nombre){
        Producto ProductoBuscado = buscar(nombre);
        for(Producto p: this.productos) {
            productos.remove(nombre);
          return true;
        }
        return false;
    }

    public int calcularValorTotal(){
        int precioTotal = 0;
        for(Producto p: this.productos){
            precioTotal =+ p.getPrecio();
        }


        return precioTotal;

    }

    public Producto obtenerProductoMasCaro(){

    }
}
