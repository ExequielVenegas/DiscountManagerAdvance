package decorator;


import component.Component;

public abstract class Decorator implements Component {
    protected final Component envuelto;

    protected Decorator(Component envuelto) {
        this.envuelto = envuelto;
    }

    @Override
    public String getNombre() {
        return envuelto.getNombre();
    }

    @Override
    public String getCategoria() {
        return envuelto.getCategoria();
    }

    @Override
    public double getPrecioBase() {
        return envuelto.getPrecioBase();
    }
}
