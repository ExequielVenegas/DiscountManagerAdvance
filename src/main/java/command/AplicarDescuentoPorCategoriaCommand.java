package command;


import decorator.DescuentoPorCategoria;

public class AplicarDescuentoPorCategoriaCommand implements Command {
    private final ContextoPrecio ctx;
    private final String categoria;
    private final double porcentaje;

    public AplicarDescuentoPorCategoriaCommand(ContextoPrecio ctx, String categoria, double porcentaje) {
        this.ctx = ctx;
        this.categoria = categoria;
        this.porcentaje = porcentaje;
    }

    @Override
    public void ejecutar() {
        ctx.setActual(new DescuentoPorCategoria(ctx.getActual(), categoria, porcentaje));
    }
}
