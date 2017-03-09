package lt.vtvpmc.functionality;

import lt.vtvpmc.interfaces.ITrigonometry;

public class Trigonometry implements ITrigonometry {

    @Override
    public double sin(double a) {
        return Math.sin(a);
    }

    @Override
    public double cos(double a) {
        return Math.cos(a);
    }

    @Override
    public double tg(double a) {
        return Math.tan(a);
    }

    @Override
    public double ctg(double a) {
        return 1 / Math.tan(a);
    }
}
