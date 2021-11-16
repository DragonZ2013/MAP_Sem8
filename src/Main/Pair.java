package Main;

public class Pair<T,U> {
    T p1;
    U p2;

    public Pair(T p1, U p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public T getP1() {
        return p1;
    }

    public void setP1(T p1) {
        this.p1 = p1;
    }

    public U getP2() {
        return p2;
    }

    public void setP2(U p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "p1=" + p1.toString() +
                ", p2=" + p2.toString() +
                '}';
    }


}
