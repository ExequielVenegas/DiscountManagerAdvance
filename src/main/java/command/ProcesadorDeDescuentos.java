package command;

import java.util.*;

public class ProcesadorDeDescuentos {
    private final List<Command> cola = new ArrayList<>();

    public void agregar(Command c) {
        cola.add(c);
    }

    public void procesar() {
        for (Command c : cola) c.ejecutar();
        cola.clear();
    }
}
