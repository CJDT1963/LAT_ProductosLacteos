package OrganizadordeClases;

public class Yogurt extends ProductoLacteo {

    public Yogurt() {
        super("Yoguso", 10); // 8 horas de fermentación
    }

    @Override
    public void procesar() {
        System.out.println(" PROCESO INICIAL PARA EL YOGURT : Pasteurizando leche para yogurt;  Tiempo de Fermentacion : "+tiempoFermentacion+" Horas");
    }
}


