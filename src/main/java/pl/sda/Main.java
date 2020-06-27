package pl.sda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List - 2 rodzaje, wewnetrzna struktura + własna implementacja
        //Set
        //Map
        //sortowanie
        //iterowanie for each, iterator, get - dlaczego nie uzywac, porownanie do tablicy

        //ownListDemo();


        //TODO: co Nam da użycie interfejsu w tym miejscu?
        List<String> someList = new LinkedList<>();
        someList.add("ala");
        someList.add("ma");
        someList.add("ładnego");
        someList.add("kota");
        someList.add("kota");
        someList.add("kota");
        someList.add("!");

        String value = someList.get(2);

        someList.add(3, "rudego");
        someList.set(3 , "niebieskiego");
        System.out.println(someList);

        //printList(someList);

        Iterator<String> iterator = someList.iterator();
        //iterator.hasNext()
        //iterator.next()
                //iter = iter.getNext()
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String word : someList) {
            System.out.println(word);
        }

        // nie polecam :(
        for(int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
            // i = 0 head
            // i = 1 head.getNext()
            // i = 2 head.getNext().getNext()
            // i = 3 head.getNext().getNext().getNext()
        }


        System.out.println("Tutaj czesc dotyczaca Seta");


        List<String> otherList = new LinkedList<>();
        List<String> listWithoutDupes = new LinkedList<>();

        otherList.add("5");
        otherList.add("5");
        otherList.add("10");
        // set nie pozwala na duplikaty + nie trzyma kolejnosci
        Set<String> set = new HashSet<>(someList);
        set.addAll(otherList);

        for(String setElement: set) {
            System.out.println(setElement);
        }

        listWithoutDupes.addAll(set);
        System.out.println("Lista bez duplikatow");
        for (String notDuplicate : listWithoutDupes) {
            System.out.println(notDuplicate);
        }
        //TODO: jak sortowac liste
    }

    public static void printList(List<String> list) {
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    private static void ownListDemo() {
        Node node1 = new Node();
        node1.setValue("Ala");
        Node node2 = new Node();
        node2.setValue("ma");
        Node node3 = new Node();
        node3.setValue("ładnego");
        Node node4 = new Node();
        node4.setValue("kota");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        //node4.setNext(null);


        System.out.println(node1.getValue());
        System.out.println(node1.getNext().getValue());
        System.out.println(node1.getNext().getNext().getValue());
        System.out.println(node1.getNext().getNext().getNext().getValue());
        System.out.println(node1.getNext().getNext().getNext().getNext());

        Node nodeExtra = new Node();
        nodeExtra.setValue("rudego");
        nodeExtra.setNext(node4);
        node3.setNext(nodeExtra);

        System.out.println("Po dodaniu elementu");
        System.out.println(node1.getValue());
        System.out.println(node1.getNext().getValue());
        System.out.println(node1.getNext().getNext().getValue());
        System.out.println(node1.getNext().getNext().getNext().getValue());
        System.out.println(node1.getNext().getNext().getNext().getNext().getValue());
        System.out.println(node1.getNext().getNext().getNext().getNext().getNext());

        node2.setNext(nodeExtra);
        System.out.println("Po usunieciu elementu");
        System.out.println(node1.getValue());
        System.out.println(node1.getNext().getValue());
        System.out.println(node1.getNext().getNext().getValue());
        System.out.println(node1.getNext().getNext().getNext().getValue());
        System.out.println(node1.getNext().getNext().getNext().getNext());

        System.out.println("Iteracja");
        Node head = node1;
        Node tail = node4;
        Node iterator = head;
        while (iterator != null) {
            System.out.println(iterator.getValue());
            iterator = iterator.getNext();
        }
    }
}
