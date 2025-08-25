package command;

import decorator.DescuentoPorcentajeGlobal;

public class AplicarDescuentoGlobalCommand implements Command {
    private final ContextoPrecio ctx;
    private final double porcentaje;

    public AplicarDescuentoGlobalCommand(ContextoPrecio ctx, double porcentaje) {
        this.ctx = ctx;
        this.porcentaje = porcentaje;
    }

    @Override
    public void ejecutar() {
        ctx.setActual(new DescuentoPorcentajeGlobal(ctx.getActual(), porcentaje));
    }
}
