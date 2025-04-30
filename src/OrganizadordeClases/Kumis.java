package OrganizadordeClases;

public class Kumis extends ProductoLacteo {

    public Kumis() {
        super("Kumisiño", 12); // 12 horas de fermentación
    }

    @Override
    public void procesar() {
        System.out.println(" PROCESO INICIAL PARA EL KUMIS : Fermentando Leche para Kumis ;  Tiempo de Fermentación : "+tiempoFermentacion+" Horas");
    }
}

