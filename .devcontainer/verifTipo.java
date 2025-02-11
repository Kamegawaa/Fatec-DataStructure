public class verifTipo {
    public static void main(String[] args) {
        Object obj1 = "Tipo String";
        Object obj2 = 1;
        Object obj3 = 1.50;

        System.out.println("Tipo de Objeto 1: " + obj1.getClass().getSimpleName());
        System.out.println("Tipo de Objeto 2: " + obj2.getClass().getSimpleName());
        System.out.println("Tipo de Objeto 3: " + obj3.getClass().getSimpleName());
    }
}