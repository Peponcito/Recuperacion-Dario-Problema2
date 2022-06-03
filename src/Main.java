import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        Gastos gasto;
        LibroDeCuentas libroDeCuentas = new LibroDeCuentas();
        String concepto;
        float importe;
        float sumaGastos = 0;


        while (!opcion.equals("4")) {
            System.out.println("1.  Añadir un gasto");
            System.out.println("2.  Ver lista de gastos");
            System.out.println("3.  Calcular gasto total");
            System.out.println("4.  Salir");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1" :
                    System.out.print("Concepto del gasto: ");
                    concepto = scanner.nextLine();
                    System.out.print("Importe del gasto: ");
                    importe = scanner.nextFloat();
                    scanner.nextLine();
                    gasto = new Gastos(concepto, importe);
                    libroDeCuentas.anadirGasto(gasto);
                    break;
                case "2" :
                    if (libroDeCuentas.size() == 0){
                        System.out.println("No hay gastos registrados");
                    }else {
                        System.out.println(libroDeCuentas);
                    }
                    break;
                case "3" :
                    int tamano = libroDeCuentas.size();
                    sumaGastos = 0;
                    for (int i = 0; i < tamano; i++) {
                        sumaGastos += libroDeCuentas.eliminarGasto().getImporte();
                    }
                    System.out.println("Gasto total: " + sumaGastos);
                    break;
                case "4" :
                    System.out.println("Bye Bye");
                    break;

            }
        }
    }
}