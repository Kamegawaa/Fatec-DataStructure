public class Main {
    public static void main(String[] args) {
        DoublyLinkedBase<Integer> list = new DoublyLinkedBase<>();

        // Exemplo 1: Adicionar elementos no início e no final
        System.out.println("Exemplo 1: Adicionar elementos");
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.printList();

        // Exemplo 2: Remover elementos
        System.out.println("\nExemplo 2: Remover elementos");
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();

        // Exemplo 3: Adicionar mais elementos e verificar tamanho
        System.out.println("\nExemplo 3: Adicionar e verificar tamanho");
        list.addLast(30);
        list.addLast(40);
        list.printList();
        System.out.println("Tamanho da lista: " + list.size());

        // Exemplo 4: Remover até ficar vazia
        System.out.println("\nExemplo 4: Esvaziar a lista");
        list.removeFirst();
        list.removeFirst();
        list.printList();
        System.out.println("Lista está vazia? " + list.isEmpty());
    }
}
