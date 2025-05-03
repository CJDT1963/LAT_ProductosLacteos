import OrganizadordeClases.Kumis;
import OrganizadordeClases.ProductoLacteo;
import OrganizadordeClases.Yogurt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("ll =============================================================");
        System.out.println(" *******  LAT Productos Lacteos Artesanales  ******* ");
        System.out.println("=============================================================");
        System.out.println("Proceso de Producción");
        System.out.println("==============================================================");

        ProductoLacteo yogurt = new Yogurt();
        yogurt.procesar();
        yogurt.envasar();

        System.out.println("==============================================================");

        ProductoLacteo kumis = new Kumis();
        kumis.procesar();
        kumis.envasar();


    }
}