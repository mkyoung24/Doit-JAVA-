import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_test {
	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		d.addFirst("E1");
		d.addFirst("E2");
		d.addFirst("E3");
		System.out.println(d.removeFirst());
		System.out.println(d.removeFirst());
		System.out.println(d.removeFirst());
		
		Deque<String> q = new ArrayDeque<>();
        q.addFirst("E1");
        q.addFirst("E2");
        q.addFirst("E3");
        System.out.println(q.removeLast());
        System.out.println(q.removeLast());
        System.out.println(q.removeLast());

	}
}
