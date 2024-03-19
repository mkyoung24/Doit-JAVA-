# 스택(Stack)
![스택](https://github.com/mkyoung24/Algorithm/assets/103173521/863627aa-ac96-40a4-8a8c-4358c9096c14)
- 데이터를 일시적으로 쌓아 놓는 자료구조
- 데이터의 입력과 순서는 후입선출(LIFO: Last In First Out)
- **푸시(push)** : 스택에 데이터를 넣는 작업
- **팝(pop)** : 스택에서 데이터를 꺼내는 작업
- **꼭대기(top)** : 푸시와 팝이 이루어지는 쪽
- **바닥(bottom)** : 스택의 가장 아랫부분
- **스택 포인터(stack pointer)** : 스택에 쌓여 있는 데이터 수

# 큐(Queue)
![큐](https://github.com/mkyoung24/Algorithm/assets/103173521/47352eff-0898-4959-a14d-c841c6d6d5ae)
- 스택과 마찬가지로 데이터를 일시적으로 쌓아 놓는 자료구조
- 가장 먼저 넣은 데이터를 가장 먼저 꺼내는 선입선출(FIFO: First In First Out)
- **인큐(en-queue)** : 큐에 데이터를 넣는 작업
- **디큐(de-queue)** : 데이터를 꺼내는 작업
- **프런트(front)** : 데이터가 나오는 쪽
- **리어(rear)** : 데이터를 넣는 쪽

## 덱(Deque)
![덱](https://github.com/mkyoung24/Algorithm/assets/103173521/aeafbf89-df66-4fc1-a738-350728f78ad4)
- Double-Ended Queue의 줄임말로 큐의 양쪽으로 엘리먼트의 삽입과 삭제를 수행할 수 있는 자료구조
- Stack 및 Queue를 모두 사용할 수 있음
- 양방향 끝에서 데이터 추가, 삭제가 용이

## 우선순위 큐(Priority Queue)
- 일반적인 큐의 구조 FIFO(First In First Out)을 가지면서, 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조
- PriorityQueue를 사용하기 위해선 우선순위 큐에 저장할 객체는 필수적으로 Comparable Interface를 구현해야 함
- PriorityQueue는 Heap을 이용하여 구현하는 것이 일반적
- `최대 값이 우선순위인 큐 = 최대 힙, 최소 값이 우선순위인 큐 = 최소 힙`
### 특징
1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조
2. 내부요소는 힙으로 구성되어 이진트리 구조로 이루어짐
3. 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NlogN)
4. 우선순위를 중요시해야 하는 상황에서 주로 쓰임


# :file_folder: 출처
<https://velog.io/@gillog/Java-Priority-Queue%EC%9A%B0%EC%84%A0-%EC%88%9C%EC%9C%84-%ED%81%90>
<https://soft.plusblog.co.kr/24>
