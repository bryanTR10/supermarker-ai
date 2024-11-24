package com.iud.supermarker.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SimulacionCobro {
    public static void main(String[] args){
        // crear una lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Jose Rodriguez", 1));
        clientes.add(new Cliente("Daniela Campo", 2));
        clientes.add(new Cliente("Patricio Rodriguez", 3));

        // Crear una cajera
        Cajera cajera = new Cajera("Sandra");
        
        // Simular el proceso de cobro para cliente
        for (Cliente cliente : clientes) {
            // Simular la compra del cliente
            List<Producto> productos = generarCompraAleatoria();
            
            // Realizar el cobro
            cajera.cobrar(cliente, productos);
        }
        
    }
    
    // Metodo para generar una aleatoria de productos
    private static List<Producto> generarCompraAleatoria() {
        List<Producto> productos = new ArrayList<>();
        Random random = new Random();
        int numProductos = random.nextInt(5) + 1;
        
        for (int i =0; i < numProductos; i++) {
            String nombreProducto = "Producto " + (i +1);
            double precio = random.nextDouble() * 100; 
            productos.add(new Producto(nombreProducto, precio));
        }
        return productos;
    }

}
