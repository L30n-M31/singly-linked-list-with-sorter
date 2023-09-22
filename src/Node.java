/**
 * @author Leonhard Leung
 * Date: 09/22/2023
 */

import java.util.NoSuchElementException;

public class Node<T> {
    private Node<T> link;
    private T info;
    private int size = 0;

    Node(T data, Node<T> node) {
        info = data;
        link = node;
    } // end of constructor

    public void setInfo(T data) {
        info = data;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }

    public Node<T> getLink() {
        return link;
    }

    public T getInfo() {
        return info;
    }

    public int getSize() {
        return size;
    }

    public T get(int index) throws NoSuchElementException {
        Node<T> curr = link;
        for (int i = 0; i < size; i++) {
            if (i == index)
                return curr.getInfo();
            curr = curr.getLink();
        }
        throw new NoSuchElementException();
    } // end of get method

    public void insert(T data) {
        Node<T> newNode = new Node<>(data, null);

        if (link == null) {
            link = newNode;
        } else {
            Node<T> curr = link;
            Node<T> previousCurr = null;

            while (curr != null && curr.getInfo().toString().compareToIgnoreCase(newNode.getInfo().toString()) < 0) {
                previousCurr = curr;
                curr = curr.getLink();
            }
            if (previousCurr != null) {
                previousCurr.setLink(newNode);
                newNode.setLink(curr);
            } else {
                newNode.setLink(link);
                link = newNode;
            }
        }
        size++;
    } // end of insert method

    @Override
    public String toString() {
        return super.toString();
    } // end of toString method
} // end of Node class
