import java.util.ArrayList;
import java.util.List;

public class ImmutableQueueHirokazu<T> implements Queue<T> {
    private List<T> queueList;

    public ImmutableQueueHirokazu() {
        queueList = new ArrayList<T>();
    }

    private ImmutableQueueHirokazu(List<T> list) {
        this.queueList = list;
    }

    public Queue<T> enQueue(T t) {
        List<T> l = new ArrayList<T>(queueList);
        l.add(t);
        return new ImmutableQueueHirokazu<T>(l);
    }

    public Queue<T> deQueue() {
        List<T> l = new ArrayList<T>(queueList);
        // constractorでqueueList初期化のためnull判定不要
        if (!l.isEmpty()) {
            l.remove(0);
        }
        return new ImmutableQueueHirokazu<T>(l);
    }

    public T head() {
        // constractorでqueueList初期化のためnull判定不要
        return queueList.isEmpty() ? null : queueList.get(0);
    }

    public boolean isEmpty() {
        // constractorでqueueList初期化のためnull判定不要
        return queueList.isEmpty();
    }
}