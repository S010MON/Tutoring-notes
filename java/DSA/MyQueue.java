package DSA;

public interface MyQueue<E>
{
    void enqueue(E element);

    E dequeue();

    boolean isEmpty();
}
