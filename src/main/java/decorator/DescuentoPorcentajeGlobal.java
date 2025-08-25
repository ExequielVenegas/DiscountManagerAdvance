package decorator;


import component.Component;

public class DescuentoPorcentajeGlobal extends Decorator {
    private final double porcentaje;

    public DescuentoPorcentajeGlobal(Component envuelto, double porcentaje) {
        super(envuelto);
        this.porcentaje = porcentaje;
    }

    @Override
    public double getPrecio() {
        return Math.round(envuelto.getPrecio() * (1.0 - porcentaje) * 100.0) / 100.0;
    }
}
