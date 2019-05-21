/**
 * Defines a queue collection.
 *
 * @author Mohammad Chaudhry
 * @version 4.0
 * References:
 * 1. https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * 2. https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
 */
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayQueue<T> implements QueueADT<T> {
    private ArrayList queue;
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Constructor
     */
    public ArrayQueue(){
        this(DEFAULT_CAPACITY);
    }
    /**
     * Constructor
     */
    public ArrayQueue(int size){
        queue = new ArrayList(size);
    }
    /**
     * Adds one element to the rear of this queue.
     * @param element  the element to be added to the rear of the queue
     */
    public void enqueue(T element){
        queue.add(element);
    }

    /**
     * Removes and returns the element at the front of this queue.
     * @return the element at the front of the queue
     */
    public T dequeue() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        return (T) queue.remove(0); //TODO Fix
    }

    /**
     * Returns without removing the element at the front of this queue.
     * @return the first element in the queue
     */
    public T first() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("queue");

        return (T) queue.get(0); //TODO Fix
    }

    /**
     * Returns true if this queue contains no elements.
     * @return true if this queue is empty
     */
    public boolean isEmpty(){
        return (size()==0); //TODO Fix
    }

    /**
     * Returns the number of elements in this queue.
     * @return the integer representation of the size of the queue
     */
    public int size(){
        return queue.size(); //TODO Fix
    }

    /**
     * Returns a string representation of this queue.
     * @return the string representation of the queue
     */
    public String toString(){
        String s = "Queue: ";
        ListIterator<T> stackIterator = queue.listIterator();
        while(stackIterator.hasNext()){
            s += stackIterator.next() + " ";
        }
        return s;
    }
}
