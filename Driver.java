/**
 * Shows functionality of LinkedStack, ArrayStack, ArrayQueue and LinkedQueue classes
 *
 * @author Mohammad Chaudhry
 * T00554758
 */
public class Driver {
    public static void main(String[] args){
//        Please decomment the method corresponding the to ADT you would like to test.
//        LinkedStackTests();
//        ArrayStackTests();
//        LinkedQueueTests();
//        ArrayQueueTests();
    }
    public static void LinkedStackTests(){
        System.out.println("LinkedStack Testing\n");
        LinkedStack<Integer> linkedStack = new LinkedStack();

//        Testing push()
        linkedStack.push(10);
        System.out.println("Pushed 10");
        linkedStack.push(24);
        System.out.println("Pushed 24");

//        Printing the stack post push. Additionally testing functionality of toString()
        System.out.println("The stack after 10 and 24 have been pushed on, in that order");
        System.out.println(linkedStack.toString());

//        Pop should return 24
        try{
            System.out.println("Popped: "+linkedStack.pop());
        }catch(Exception e){
            System.out.println(e);
        }

//        Peek should return 10
        try{
            System.out.println("Peek: "+linkedStack.peek());
        }catch(Exception e){
            System.out.println(e);
        }

//        Pop should return 10
        try{
            System.out.println("Popped: "+linkedStack.pop());
        }catch(Exception e){
            System.out.println(e);
        }

//        Printing the stack post pop. Should be empty
        System.out.println("\nThe stack should be empty");
        System.out.println("\n"+linkedStack.toString());


//        Pop should return an error
        System.out.println("Trying to pop on an empty stack");
        try{
            System.out.println("Popped: "+linkedStack.pop());
        }catch(Exception e){
            System.out.println(e);
        }

//        Peek should return an error
        System.out.println("Trying to peek on an empty stack");
        try{
            System.out.println("Peek: "+linkedStack.peek());
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void ArrayStackTests(){
        System.out.println("ArrayStack Testing\n");
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

//        Testing push()
        arrayStack.push(10);
        System.out.println("Pushed 10");
        arrayStack.push(24);
        System.out.println("Pushed 24");

//        Printing the stack post push. Additionally testing functionality of toString()
        System.out.println("The stack after 10 and 24 have been pushed on, in that order");
        System.out.println(arrayStack.toString());

//        Pop should return 24
        try{
            System.out.println("Popped: "+arrayStack.pop());
        }catch(Exception e){
            System.out.println(e);
        }

//        Peek should return 10
        try{
            System.out.println("Peek: "+arrayStack.peek());
        }catch(Exception e){
            System.out.println(e);
        }

//        Pop should return 10
        try{
            System.out.println("Popped: "+arrayStack.pop());
        }catch(Exception e){
            System.out.println(e);
        }

//        Printing the stack post pop. Should be empty
        System.out.println("\nThe stack should be empty");
        System.out.println("\n"+arrayStack.toString());


//        Pop should return an error
        System.out.println("Trying to pop on an empty stack");
        try{
            System.out.println("Popped: "+arrayStack.pop());
        }catch(Exception e){
            System.out.println(e);
        }

//        Peek should return an error
        System.out.println("Trying to peek on an empty stack");
        try{
            System.out.println("Peek: "+arrayStack.peek());
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void LinkedQueueTests(){
        System.out.println("LinkedQueue Testing\n");
        LinkedQueue<Integer> linkedQueue = new LinkedQueue();
//        Testing push()
        linkedQueue.enqueue(10);
        System.out.println("Queued 20");
        linkedQueue.enqueue(24);
        System.out.println("Queued 24");

//        Printing the queue post enqueue operations. Additionally testing functionality of toString()
        System.out.println("\nThe queue after 10 and 24 have been enqueued, in that order");
        System.out.println(linkedQueue.toString()+"\n");

//        Dequeue should return 24
        try{
            System.out.println("Dequeued: "+linkedQueue.dequeue());
        }catch(Exception e){
            System.out.println(e);
        }

//        First should return 10
        try{
            System.out.println("First: "+linkedQueue.first());
        }catch(Exception e){
            System.out.println(e);
        }

//        Dequeue should return 10
        try{
            System.out.println("Dequeued: "+linkedQueue.dequeue());
        }catch(Exception e){
            System.out.println(e);
        }

//        Printing the queue post dequeue. Should be empty
        System.out.println("\nThe queue should be empty");
        System.out.println(linkedQueue.toString()+"\n");


//        Dequeue should return an error
        System.out.println("Trying to dequeue on an empty queue");
        try{
            System.out.println("Dequeue: "+linkedQueue.dequeue());
        }catch(Exception e){
            System.out.println(e);
        }

//        Peek should return an error
        System.out.println("\nTrying the first() operation on an empty queue");
        try{
            System.out.println("First: "+linkedQueue.first());
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void ArrayQueueTests(){
        System.out.println("ArrayQueue Testing\n");
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        Testing push()
        arrayQueue.enqueue(10);
        System.out.println("Queued 10");
        arrayQueue.enqueue(24);
        System.out.println("Queued 24");

//        Printing the queue post enqueue operations. Additionally testing functionality of toString()
        System.out.println("\nThe queue after 10 and 24 have been enqueued, in that order");
        System.out.println(arrayQueue.toString()+"\n");

//        Dequeue should return 24
        try{
            System.out.println("Dequeued: "+arrayQueue.dequeue());
        }catch(Exception e){
            System.out.println(e);
        }

//        First should return 10
        try{
            System.out.println("First: "+arrayQueue.first());
        }catch(Exception e){
            System.out.println(e);
        }

//        Dequeue should return 10
        try{
            System.out.println("Dequeued: "+arrayQueue.dequeue());
        }catch(Exception e){
            System.out.println(e);
        }

//        Printing the queue post dequeue. Should be empty
        System.out.println("\nThe queue should be empty");
        System.out.println(arrayQueue.toString()+"\n");


//        Dequeue should return an error
        System.out.println("Trying to dequeue on an empty queue");
        try{
            System.out.println("Dequeue: "+arrayQueue.dequeue());
        }catch(Exception e){
            System.out.println(e);
        }

//        Peek should return an error
        System.out.println("\nTrying the first() operation on an empty queue");
        try{
            System.out.println("First: "+arrayQueue.first());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
