import java.util.ArrayList;
import java.util.List;

public class ImmutableQueue<T> implements Queue<T>{

    private final List<T> queueList;

    private ImmutableQueue(List<T> queueList) {
        this.queueList = new ArrayList<>(queueList);
    }

    public ImmutableQueue() {
        this.queueList = new ArrayList<>();;
    }

    public ImmutableQueue<T> enQueue(T t) {
        ArrayList<T> newQueueList = new ArrayList<>(queueList);
        newQueueList.add(t);
        return new ImmutableQueue<>(newQueueList);
    }

    public ImmutableQueue<T> deQueue() {
        List<T> newQueueList = new ArrayList<>(queueList);
        newQueueList.remove(0);
        return new ImmutableQueue<>(newQueueList);
    }

    public T head() {
        return queueList.isEmpty() ? null : queueList.get(0);
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }
}
