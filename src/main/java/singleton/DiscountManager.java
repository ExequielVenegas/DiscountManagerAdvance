package singleton;

import command.Command;
import command.ContextoPrecio;
import command.ProcesadorDeDescuentos;
import component.Component;

import java.util.List;

public class DiscountManager {
    private static final DiscountManager INSTANCE = new DiscountManager();

    private DiscountManager() {
    }

    public static DiscountManager getInstance() {
        return INSTANCE;
    }

    public double aplicarDescuentos(Component producto, List<Command> comandos) {
        ContextoPrecio ctx = new ContextoPrecio(producto);
        ProcesadorDeDescuentos invoker = new ProcesadorDeDescuentos();
        for (Command cmd : comandos) invoker.agregar(cmd);
        invoker.procesar();
        return ctx.getActual().getPrecio();
    }
}
