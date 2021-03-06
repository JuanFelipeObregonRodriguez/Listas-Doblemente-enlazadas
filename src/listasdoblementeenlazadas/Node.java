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
public class Node {
    private Integer value;
    private Node nextElement;
    private Node previousElement;
 
    public Node(Integer value) {
        this.value = value;
    }
 
    public Integer getValue() {
        return value;
    }
 
    public void setValue(Integer value) {
        this.value = value;
    }
 
    public Node getNextElement() {
        return nextElement;
    }
 
    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }
 
    public Node getPreviousElement() {
        return previousElement;
    }
 
    public void setPreviousElement(Node previousElement) {
        this.previousElement = previousElement;
    }
 
    @Override
    public String toString() {
        return "Node [value=" + value + ", nextElement=" + ((nextElement != null) ? nextElement.getValue()
                : null) + ", previousElement=" +( (previousElement != null) ? previousElement.getValue() : null) + "]";
    }
 
}