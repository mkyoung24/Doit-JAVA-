![자바컬렉션프레임워크](https://github.com/mkyoung24/Algorithm/assets/103173521/02c36bbf-70e9-4280-9d7c-e8cfa213e070)

# 컬렉션 프레임워크
- `컬렉션(Collection)` : 여러 객체(데이터)를 담을 수 있는 자료구조, 다수의 데이터 그룹 또는 집합
- `프레임워크(Framework)` : 복잡하게 설명할 수 있지만 간단하게 표준화된 프로그래밍 방식
- `컬렉션 프레임워크(Collection Framework)` : 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것

## 컬렉션 프레임워크 장점
1. 인터페이스와 다형성을 이용한 객체지향적 설계를 통해 표준화되어 있기 때문에, 사용법을 익히기에도 편리하고 재사용성이 높음
2. 데이터 구조 및 알고리즘의 고성능 구현을 제공하여 프로그램의 성능과 품질을 향상시킴
3. 이미 구현되어 있는 API를 사용하면 되기에, 새로운 API를 익히고 설계하는 시간이 줄어듬


## Iterable 인터페이스
- 컬렉션 인터페이스들의 가장 최상위 인터페이스
- 컬렉션들을 배우다 보면 자료들을 순회할때 이터레이터 객체를 다뤄보게 될텐데, 이 이터레이터 객체를 관리하는 인터페이스

## Collection 인터페이스
- List, Set, Queue에 상속을 하는 실질적인 최상위 컬렉션 타입
- 즉, 업캐스팅으로 다양한 종류의 컬렉션 자료형을 받아 자료를 삽입하거나 삭제, 탐색 기능을 할 수 있음


## List
- 저장 순서가 유지되는 컬렉션을 구현하는데 사용
- 같은 요소의 중복 저장을 허용
- 배열과 마찬가지로 index로 요소에 접근
- 리스트는 자료형 크기가 고정이 아닌 데이터 양에 따라 동적으로 늘어났다 줄어들 수 있음(가변적)
- 요소 사이에 빈공간을 허용하지 않아 삽입/삭제 할때마다 배열 이동이 일어남


### ArrayList
- 배열을 이용하여 만든 리스트
- 데이터의 저장순서가 유지되고 중복을 허용
- 데이터량에 따라 공간(capacity)가 자동으로 늘어나거나 줄어들음
- 단방향 포인터 구조로 자료에 대한 순차적인 접근에 강점이 있어 조회가 빠름
- 삽입/삭제가 느리다는 단점이 있음. 단, 순차적으로 추가/삭제 하는 경우에는 가장 빠름
- 특정 원소 조회가 많은 경우 사용하는 것이 좋음

```java
  List<String> arrayList = new ArrayList<>();

  arrayList.add("Hello");
  arrayList.add("World");

  arrayList.get(0)    //"Hello"
```

### LinkedList
- 노드와 포인터를 이용하여 만든 리스트
- 특정 원소를 조회하는 경우 첫 노드보다 순회해야 하기 때문에 ArrayList에 비해 느림
- 데이터의 중간 삽입, 삭제 빈번할 경우 빠른 성능을 보장함
- 조회보다 삽입/삭제가 많은 경우 사용하는 것이 좋음
- 자바의 LinkedList는 Doubly LinkedList(양방향 포인터 구조)로 삽입/삭제 시 포인터를 끊고 새로운 노드에 연결만하면 되기 때문에 빠름
- LinkedList는 리스트 용도 이외에도, 스택, 큐, 트리 등의 자료구조의 근간이 됨

```java
  List<String> linkedList = new LinkedList<>();

  linkedList.add("Hello");
  linkedList.add("World");

  linkedList.get(0);      //"Hello"
```

### Vector
- ArrayList와 비슷하게 배열로 만들어진 리스트로 과거의 대용량 처리를 위해 사용함
- 모든 메소드가 동기화(synchronized) 되어 있어 thread-safe
- 비교적 성능이 좋지 않고 무거워 잘 쓰이지 않음

```java
  List<Integer> vector = new Vector<>();

  vector.add(10);
  vector.add(20);

  vector.get(0);      //10
```

### Stack
- LIFO(Last In First Out)
- Stack은 Vector를 상속하기 때문에 문제점이 많아 잘 안쓰임(대신 ArrayDeque 사용)

```java
  Stack<Integer> stack = new Stack<>();

  stack.push(30);
  stack.push(50);

  stack.pop();    //50
  stack.pop();    //30
```

## Queue
- FIFO(First In First Out)
- 자바에서는 Queue는 인터페이스이고 필요에 따라 큐 컬렉션을 골라 사용할 수 있음

### PriorityQueue
- 일반적인 큐와는 조금 다르게, 원소에 우선 순위(priority)를 부여하여 우선 순위가 높은 순으로 정렬되고 꺼냄
- 수행할 작업이 여러 개 있고 시간이 제한되어 있을 때 우선순위가 높은 것부터 수행할때 쓰임(네트워크 제어, 작업 스케쥴링)
- 우선순위 큐에 저장할 객체는 필수적으로 Comparable 인터페이스를 구현해야 함
- 저장공간으로 배열을 사용하며, 각 요소를 힙(heap) 형태로 저장함
- null 저장 불가

```java
  // 우선순위 큐에 저장할 객체는 필수적으로 Comparable를 구현
  class Student implements Comparable<Student> {
      String name; // 학생 이름
      int priority; // 우선순위 값

      public Student(String name, int priority) {
          this.name = name;
          this.priority = priority;
      }

      @Override
      public int compareTo(Student user) {
          // Student의 priority 필드값을 비교하여 우선순위를 결정하여 정렬
          if (this.priority < user.priority) {
              return -1;
          } else if (this.priority == user.priority) {
              return 0;
          } else {
              return 1;
          }
      }

      @Override
      public String toString() {
          return "Student{" +
                  "name='" + name + '\'' +
                  ", priority=" + priority +
                  '}';
      }
  }
```

```java
  public static void main(String[] args) {

    // 오름차순 우선순위 큐
    Queue<Student> priorityQueue = new PriorityQueue<>();

    priorityQueue.add(new Student("주몽", 5));
    priorityQueue.add(new Student("세종", 9));
    priorityQueue.add(new Student("홍길동", 1));
    priorityQueue.add(new Student("임꺽정", 2));

    // 우선순위 대로 정렬되어 있음
    System.out.println(priorityQueue);
    // [Student{name='홍길동', priority=1}, Student{name='임꺽정', priority=2}, Student{name='주몽', priority=5}, Student{name='세종', priority=9}]

    // 우선순위가 가장 높은 값을 참조
    System.out.println(priorityQueue.peek()); // Student{name='홍길동', priority=1}

    // 차례대로 꺼내기
    System.out.println(priorityQueue.poll()); // Student{name='홍길동', priority=1}
    System.out.println(priorityQueue.poll()); // Student{name='임꺽정', priority=2}
    System.out.println(priorityQueue.poll()); // Student{name='주몽', priority=5}
    System.out.println(priorityQueue.poll()); // Student{name='세종', priority=9}
}
```

### Deque
- 양쪽으로 넣고 빼는 것이 가능한 큐
- 스택과 큐를 하나로 합쳐놓은 것과 같으며 스택으로 사용할 수도 있고, 큐로 사용할 수도 있음
- 구현체로 ArrayDeque와 LinkedList등이 있음

```java
  Deque<Integer> deque = new ArrayDeque<>();

  deque.offerLast(100);    // [100]
  deque.offerFirst(10);    // [10, 100]
  deque.offerFirst(20);    // [20, 10, 100]
  deque.offerLast(30);     // [20, 10, 100, 30]

  deque.pollFirst();      // 20 <- [10, 100, 30]
  deque.pollLast();       // [10, 100] -> 30
  deque.pollFirst();      // 10 <- [100]
  deque.pollLast();       // [] -> 100
```

```java
  Queue<String> linkedList = new LinkedList<>();    // Queue 타입으로 받음

  linkedList.offer("Hello");
  linkedList.offer("World");
  linkedList.offer("Power");

  linkedList.poll();    // "Hello" - 선입선출

  System.out.println(linkedList);    // [World, Power]         
```

## Set
- 데이터의 중복을 허용하지 않고 순서를 유지하지 않는 데이터의 집합 리스트
- 순서 자체가 없으므로 인덱스로 객체를 검색해서 가져오는 get(index) 메서드도 존재하지 않음
- 중복 저장이 불가능하기 때문에 심지어 null 값도 하나만 저장할 수 있음

### HashSet 
- 배열과 연결 노드를 결합한 자료구조 형태
- 가장 빠른 임의 검색 접근 속도를 가짐
- 추가, 삭제, 검색, 접근성이 모두 뛰어남
- 대신 순서를 전형 예측할 수 없음

```java
  Set<Integer> hashSet = new HashSet<>();

  hashSet.add(10);
  hashSet.add(20);
  hashSet.add(30);
  hashSet.add(10);    //중복된 요소 추가

  hashSet.size();    // 3 - 중복된건 카운트 X

  hashSet.toString();    // [20, 10, 30] - 자료 순서가 뒤죽박죽
```

### LinkedHashSet
- 중복을 허용하진 않지만 순서를 가짐
- 추가된 순서 또는 가장 최근에 접근한 순서대로 접근 가능
- 만일 중복을 제거하는 동시에 저장한 순서를 유지하고 싶다면, HashSet 대신 LinkedHashSet을 사용

```java
  Set<Integer> linkedHashSet = new LinkedHashSet<>();

  linkedHashSet.add(10);
  linkedHashSet.add(20);
  linkedHashSet.add(30);
  linkedHashSet.add(10);    //중복된 수 추가

  linkedHashSet.size();    // 3 - 중복된건 카운트 X

  linkedHashSet.toString();    // [10, 20, 30] - 대신 자료가 들어온 순서대로 출력
```

### TreeSet
- 이진 검색 트리(binary search tree) 자료구조의 형태로 데이터를 저장
- 중복을 허용하지 않고, 순서를 가지지 않음
- 데이터를 정렬하여 저장하고 있다는 특징이 있음
- 정렬, 검색, 범위 검색에 높은 성능을 뽐냄

```java
  Set<Integer> treeSet = new TreeSet<>();

  treeSet.add(7);
  treeSet.add(4);
  treeSet.add(9);
  treeSet.add(1);
  treeSet.add(5);

  treeSet.toString();    // [1, 4, 5, 7, 9] - 자료가 알아서 정렬됨
```

## Map
- 키(key)와 값(value)의 쌍으로 연관지어 이루어진 데이터의 집합
- 값(value)은 중복되서 저장될 수 있지만, 키(key)는 해당 Map에서 고유해야만 함
- 만일 기존에 저장된 데이터와 중복된 키와 값을 저장하면 기존의 값은 없어지고 마지막에 저장된 값이 남게 됨
- 저장 순서가 유지되지 않음

```java
  Map<String, Integer> map = new HashMap<>();
  map.put("a", 1);
  map.put("b", 2);
  map.put("c", 3);

  //Map.Entry 인터페이스를 구현하고 있는 Key-Value 쌍을 가지고 있는 HashMap의 Node 객체들의 Set 집합을 반환
  Set<Map.Entry<String, Integer>> entry = map.entrySet();

  System.out.println(entry);

  for (Map.Entry<String, Integer> e : entry) {
       System.out.printf("{ %s : %d }\n", e.getKey(), e.getValue());
  }

  /*
    [a=1, b=2, c=3]

    { a : 1 }
    { b : 2 }
    { c : 3 }
  */
```

### HashMap
- Hashtable을 보완한 컬렉션
- 배열과 연결이 결합된 Hashing 형태로, 키(key)와 값(value)을 묶어 하나의 데이터로 저장함
- 중복을 허용하지 않고 순서를 보장하지 않음
- 키와 값으로 null이 허용됨
- 추가, 삭제, 검색, 접근성이 모두 뛰어남
- HashMap은 비동기로 작동하기 때문에 멀티 쓰레드 환경에서는 어울리지 않음

```java
  Map<String, String> hashMap = new HashMap<>();

  hashMap.put("love", "사랑");
  hashMap.put("apple", "사과");
  hashMap.put("baby", "아기");

  hashMap.get("apple"); // "사과"

  // hashmap의 key값들을 set 집합으로 반환하고 순회
  for(String key : hashMap.keySet()) {
      System.out.println(key + " => " + hashMap.get(key));
  }
  /*
    love => 사랑
    apple => 사과
    baby => 아기
  */
```

### LinkedHashMap 
- HashMap을 상속하기 때문에 흡사하지만, Entry들이 연결 리스트를 구성하여 데이터의 순서를 보장함
- 들어온 순서대로 순서를 가짐

```java
  Map<Integer, String> hashMap = new HashMap<>();

  hashMap.put(10000000, "one");
  hashMap.put(20000000, "two");
  hashMap.put(30000000, "tree");
  hashMap.put(40000000, "four");
  hashMap.put(50000000, "five");

  for(Integer key : hashMap.keySet()) {
      System.out.println(key + " => " + hashMap.get(key)); // HashMap 정렬 안됨
  }

  // ----------------------------------------------

  Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

  linkedHashMap.put(10000000, "one");
  linkedHashMap.put(20000000, "two");
  linkedHashMap.put(30000000, "tree");
  linkedHashMap.put(40000000, "four");
  linkedHashMap.put(50000000, "five");

  for(Integer key : linkedHashMap.keySet()) {
      System.out.println(key + " => " + linkedHashMap.get(key)); // LinkedHashMap 정렬됨
  }

  /*
    20000000 => two
    40000000 => four
    10000000 => one
    30000000 => tree
    50000000 => five

    10000000 => one
    20000000 => two
    30000000 => tree
    40000000 => four
    50000000 => five
  */
```

### TreeMap
- 이진 검색 트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 저장(Tree Set과 같은 원리)
- TreeMap은 SortedMap 인터페이스를 구현하고 있어 Key 값을 기준으로 정렬되는 특징을 가지고 있음
- 정렬된 순서로 키/값 쌍을 저장하므로 빠른 검색(특히 범위 검색)이 가능함
- 단, 키와 값을 저장하는 동시에 정렬을 행하기 때문에 저장시간이 다소 오래 걸림

```java
  Map<Integer, String> treeMap = new TreeMap<>();

  treeMap.put(1, "Toby");
  treeMap.put(2, "Ruth");
  treeMap.put(3, "jennifer");
  treeMap.put(4, "Mark");
  treeMap.put(5, "Dan");
  treeMap.put(6, "Gail");

  for(Integer key : treeMap.keySet()) {
      System.out.println(key + " => " + treeMap.get(key));
  }

  /*
    1 => Toby
    2 => Ruth
    3 => jennifer
    4 => Mark
    5 => Dan
    6 => Gail
  */
```

### HashTable
- Key를 특정 해시 함수를 통해 해싱한 후 나온 결과를 배열의 인덱스로 사용하여 Value를 찾는 방식
- HashMap 보다는 느리지만 동기화가 기본 지원됨
- 키와 값으로 null이 허용X

```java
  Map<String, Integer> hashtable = new HashMap<>();

  hashtable.put("연필", 200);
  hashtable.put("볼펜", 3000);
  hashtable.put("샤프", 300);
  hashtable.put("필통", 15000);

  for (String key : hashtable.keySet()) {
      System.out.println(key + " => " + hashtable.get(key));
  }

  /*
    필통 => 15000
    볼펜 => 3000
    샤프 => 300
    연필 => 200
  */
```


## 컬렉션 프레임워크 선택 시점
- `ArrayList`
    - 리스트 자료구조를 사용한다면 기본 선택
    - 임의의 요소에 대한 접근성이 뛰어남
    - 순차적인 추가/삭제 제일 빠름
    - 요소의 추가/삭제 불리
- `LinkedList`
    - 요소의 추가/삭제 유리
    - 임의의 요소에 대한 접근성이 좋지 않음
- `HashMap / HashSet`
    - 해싱을 이용해 임의의 요소에 대한 추가/삭제/검색/접근성 모두 뛰어남
    - 검색에 최고성능
- `TreeMap / TreeSet`
    - 요소 정렬이 필요할때
    - 검색(특히 범위 검색)에 적합
    - 검색 성능은 HashMap보다 떨어짐
- `LinkedHashMap / LinkedHashSet` : HashMap과 HashSet에 저장 순서 유지 기능을 추가
- `Queue` : 스택(LIFO) / 큐(FIFO) 자료구조가 필요하면 ArrayDeque 사용
- `Stack, Hashtable` : 가급적 사용 X


***
## :file_folder: 출처
- <https://inpa.tistory.com/entry/JCF-%F0%9F%A7%B1-Collections-Framework-%EC%A2%85%EB%A5%98-%EC%B4%9D%EC%A0%95%EB%A6%AC>
- <https://jellili.tistory.com/64>
