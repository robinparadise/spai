package es.jelu.sia.junit;

public class Punto {
    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double modulo() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double fase() {
        return Math.atan((double) this.y / this.x);
    }

    @Override
    public String toString() {
        return "Punto[" + x + "," + y + "]";
    }
}
