/**
 * Defines a stack collection.
 *
 * @author Mohammad Chaudhry
 * @version 4.0
 * References:
 * 1. https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * 2. https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
 */
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayStack<T> implements StackADT<T> {
    private ArrayList stack;
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Constructor
     */
    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }
    /**
     * Constructor
     * @param size is the initial size of the ArrayList object
     */
    public ArrayStack(int size){
        stack = new ArrayList(size);
    }
    /**
     * Adds the specified element to the top of this stack.
     * @param element element to be pushed onto the stack
     */
    public void push(T element){
        stack.add(element);
    }
    /**
     * Removes and returns the top element from this stack.
     * @return the element removed from the stack
     */
    public T pop() throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
        }
        return (T) stack.remove(size()-1); //TODO double check cast to type T
    }

    /**
     * Returns without removing the top element of this stack.
     * @return the element on top of the stack
     */
    public T peek(){
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
        }
        return (T) stack.get(size()-1); //TODO double check cast to type T
    }

    /**
     * Returns true if this stack contains no elements.
     * @return true if the stack is empty
     */
    public boolean isEmpty(){
        return (stack.size()==0);
    }

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
    public int size(){
        return stack.size();
    }

    /**
     * Returns a string representation of this stack.
     * @return a string representation of the stack
     */
    public String toString(){
        String s = "Stack:\n";
        ListIterator<T> stackIterator = stack.listIterator(size());
        while(stackIterator.hasPrevious()){
            s += stackIterator.previous() + "\n";
        }
        return s;
    }
}
