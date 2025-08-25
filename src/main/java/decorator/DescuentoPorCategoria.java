package decorator;


import component.Component;

public class DescuentoPorCategoria extends Decorator {
    private final String categoriaObjetivo;
    private final double porcentaje;

    public DescuentoPorCategoria(Component envuelto, String categoria, double porcentaje) {
        super(envuelto);
        this.categoriaObjetivo = categoria.toUpperCase();
        this.porcentaje = porcentaje;
    }

    @Override
    public double getPrecio() {
        double precio = envuelto.getPrecio();
        if (envuelto.getCategoria().toUpperCase().equals(categoriaObjetivo)) {
            precio *= (1.0 - porcentaje);
        }
        return Math.round(precio * 100.0) / 100.0;
    }
}
