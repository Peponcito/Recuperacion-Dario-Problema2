public class Gastos {
    private String concepto;
    private float importe;

    public Gastos(String concepto, float importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }


    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "\nConcepto : "+ concepto + "\nImporte: " + importe;
    }
}
