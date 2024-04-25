# ArrayList vs LinkedList
![리스트](https://github.com/mkyoung24/Algorithm/assets/103173521/aedc7c17-6bca-4769-9cba-46d09a4bc535)

![리스트2](https://github.com/mkyoung24/Algorithm/assets/103173521/7402d3f1-25a6-4595-b587-60eb92905595)


## ArrayList
- 기본적으로 배열을 사용함.
- 크기를 지정하지 않고 동적으로 값을 삽입하고 삭제할 수 있음
- ArrayList는 각 데이터의 index를 가지고 있고 무작위 접근이 가능하기 때문에, 해당 index의 데이터를 한번에 가져올 수 있음
- 삽입과 삭제가 많다면 비효율적

### ArrayList의 문제점
- ArrayList는 배열 공간(capacity)가 꽉 차거나, 요소 중간에 삽입을 행하려 할때 기존의 배열을 복사해서 요소를 뒤로 한칸씩 일일히 이동해야 하는 작업이 필요함
    - 이러한 부가적인 연산은 시스템의 성능 저하로 이어져 삽입/삭제가 빈번하게 발생하는 프로세스의 경우 치명적일 수 있음


## LinkedList
- 내부적으로 양방향의 연결 리스트로 구성되어 있어 참조하려는 원소에 따라 처음부터 정방향 또는 역순으로 순회 가능
- 순차적 접근이기 때문에 검색의 속도가 느림
- 데이터를 추가, 삭제시 가리키고 있는 주소값만 변경해주면 되기 때문에 ArrayList에 비해 상당히 효율

### LinkedList의 장단점
|LinkedList 장점|LinkedList 단점|
|:---:|:---:|
|<span style="color:blue">자료의 삽입과 삭제가 용이</span>|<span style="color:red">포인터의 사용으로 인해 저장 공간의 낭비</span>|
|<span style="color:blue">리스트 내에서 자료의 이동이 불필요</span>|<span style="color:red">알고리즘이 복잡</span>|
|<span style="color:blue">사용 후 기억 장소의 재사용이 가능</span>|<span style="color:red">특정 자료의 탐색 시간이 많이 소요</span>|
|<span style="color:blue">연속적인 기억 장소의 할당이 불필</span>||


### 시간 복잡도 비교
|연산|LinkedList|ArrayList|추천|
|:---:|:---:|:---:|:---:|
|첫번째 위치에 insert/remove|O(1)|O(N)|LinkedList|
|마지막 위치에 insert/remove|O(1)|O(1) / O(N)|LinkedList|
|중간에 insert/remove|O(N) / search time + O(1)|O(N)|LinkedList|
|값으로 search|O(N)|O(N)|ArrayList|
|인덱스로 값 get|O(N)|O(1)|ArrayList|
|값으로 remove|O(N)|O(N)|LinkedList|


### 실제 성능 측정

![리스트3](https://github.com/mkyoung24/Algorithm/assets/103173521/b4451007-808a-4f10-9d01-d0413f9743d3)


***
## :file_folder: 출처
- <https://inpa.tistory.com/entry/JCF-%F0%9F%A7%B1-ArrayList-vs-LinkedList-%ED%8A%B9%EC%A7%95-%EC%84%B1%EB%8A%A5-%EB%B9%84%EA%B5%90>
- <https://dev-coco.tistory.com/19>
- <https://velog.io/@mdy0102/ArrayList-LinkedList%EC%9D%98-%ED%8A%B9%EC%A7%95%EA%B3%BC-%EC%B0%A8%EC%9D%B4#arraylist>
