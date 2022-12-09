package entities;

public class Singleton { 
    private static final Singleton singleton;
    private int counter;
    static {
        singleton= new Singleton();
    }
    private Singleton(){
        System.out.println("Instanciation du Singleton");
    }
    public static Singleton getInstance()
    {
        return singleton;
    }
    public  void traiter (String taskName)
    {
        System.out.println("Traitement de la tâche "+taskName);
        for (int i = 0; i < 5; i++) {
            synchronized (this)
            {
                ++counter;
            }
            System.out.println(".."+counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Fin du traitement de la tâche "+taskName+" compteur= "+counter);
    }
}
