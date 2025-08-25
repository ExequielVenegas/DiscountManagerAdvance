
import command.AplicarDescuentoGlobalCommand;
import command.AplicarDescuentoPorCategoriaCommand;
import command.ContextoPrecio;
import command.ProcesadorDeDescuentos;
import component.Component;
import component.Producto;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Component polera = new Producto("Polera básica", "POLERAS", 14990);
        Component pantalon = new Producto("Pantalón chino", "PANTALONES", 25990);

        // Caso A
        ContextoPrecio ctxA = new ContextoPrecio(polera);
        ProcesadorDeDescuentos invokerA = new ProcesadorDeDescuentos();
        invokerA.agregar(new AplicarDescuentoGlobalCommand(ctxA, 0.10));
        invokerA.agregar(new AplicarDescuentoPorCategoriaCommand(ctxA, "POLERAS", 0.20));
        invokerA.procesar();
        System.out.println("Polera final: $" + ctxA.getActual().getPrecio());

        // Caso B
        ContextoPrecio ctxB = new ContextoPrecio(pantalon);
        ProcesadorDeDescuentos invokerB = new ProcesadorDeDescuentos();
        invokerB.agregar(new AplicarDescuentoGlobalCommand(ctxB, 0.10));
        invokerB.agregar(new AplicarDescuentoPorCategoriaCommand(ctxB, "POLERAS", 0.20));
        invokerB.procesar();
        System.out.println("Pantalón final: $" + ctxB.getActual().getPrecio());
    }
}
