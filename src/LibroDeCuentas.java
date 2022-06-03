import java.util.ArrayList;

public class LibroDeCuentas {
    private ArrayList<Gastos> gastos = new ArrayList<>();

    public ArrayList<Gastos> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<Gastos> gastos) {
        this.gastos = gastos;
    }

    public void anadirGasto(Gastos gasto) {
        gastos.add(gasto);
    }

    public Gastos eliminarGasto() {
        return gastos.remove(0);
    }

    public int size() {
        return gastos.size();
    }
    @Override
    public String toString() {
        return gastos + "";
    }
}
