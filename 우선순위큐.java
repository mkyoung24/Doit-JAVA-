import java.util.PriorityQueue;

class Vehicle implements Comparable<Vehicle> {
	private String name;
	private int time;
	
	public Vehicle(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTime() {
		return this.time;
	}
	
	
	@Override
	public int compareTo(Vehicle target) {
		if (this.time < target.getTime()) return -1;		//자신의 값이 작으면 -1
		else if (this.time > target.getTime()) return 1;	//자신의 값과 같으면 0
		return 0;											//자신보다 값이 크면 1
	}
	
}


public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue<Vehicle> q = new PriorityQueue<Vehicle>();
		
		q.offer(new Vehicle("대중교통", 70));
		q.offer(new Vehicle("자가용", 45));
		q.offer(new Vehicle("도보", 400));
		q.offer(new Vehicle("자전거", 125));
		
		while (!q.isEmpty()) {
			Vehicle v = q.poll();
			System.out.println(v.getName() + " 시간 :" + v.getTime());
		}

	}
}
