public class Main2 {
  public static void main(String[] args) {
    int camionCapacity = 9;
    int oldLocal = 34;
    int newLocal = 0;
    int nbTravel = 0;

    while (oldLocal > 1) {
      if (oldLocal < camionCapacity) {
        camionCapacity = oldLocal;
      }

      oldLocal = oldLocal - camionCapacity;
      newLocal = newLocal + camionCapacity;
      nbTravel++;

      if (newLocal == 34 && oldLocal == 0) {
        System.out.println("////////////////////////////////////////////////////////////////////////");
        System.out.println("le nouveau Local a " + newLocal + " carton");
        System.out.println("l'ancien Local a " + oldLocal + " carton");
        System.out.println("le dernier voyage du camion contenais " + camionCapacity + " carton");
        System.out.println("Le nombre d'aller retour est de " + nbTravel);
        System.out.println("////////////////////////////////////////////////////////////////////////");
      }
    }
  }
}