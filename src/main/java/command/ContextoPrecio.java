package command;

import component.Component;

public class ContextoPrecio {
    private Component actual;

    public ContextoPrecio(Component base) {
        this.actual = base;
    }

    public Component getActual() {
        return actual;
    }

    public void setActual(Component nuevo) {
        this.actual = nuevo;
    }
}
