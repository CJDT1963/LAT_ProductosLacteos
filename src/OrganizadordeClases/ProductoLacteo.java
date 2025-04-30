package OrganizadordeClases;

  public abstract class ProductoLacteo {
      protected String nombre;
      protected int tiempoFermentacion;

      public ProductoLacteo(String nombre, int tiempoFermentacion) {
          this.nombre = nombre;
          this.tiempoFermentacion = tiempoFermentacion;
      }
      public abstract void procesar();
      public void envasar() {
          System.out.println(" PROCESO SALIDA DE PRODUCCION : Envasando el Producto marca : " + nombre );
      }
  }


