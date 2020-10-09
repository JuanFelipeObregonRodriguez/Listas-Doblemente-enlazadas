/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

/**
 *
 * @author Juan Obregon
 */
public class ListasDoblementeEnlazadas {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addFirst(9);
        list.addFirst(8);
        list.print();
    }
}
    

