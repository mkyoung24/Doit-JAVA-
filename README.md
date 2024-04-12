# 복잡도
- 알고리즘의 성능을 나타내는 지표


## 시간 복잡도(Time Complexity)
- 알고리즘이 실행될 때 필요한 '입력 값'과 '연산 수행 시간'에 따라 '효율적인 알고리즘'을 나타내는 척도
- 즉, 입력 값이 커질수록 알고리즘의 수행 시간이 어떻게 증가하는지에 따른 지표를 의미
- 시간 복잡도는 '빅오 표기법(Big-O notation)'를 통해 표현하며, '수치가 작을수록 효율적인 알고리즘'을 의미


## 공간 복잡도(Space Complexity)
- 알고리즘이 실행될 때 필요한 '메모리 공간의 양'을 의미
- 즉, 알고리즘의 효율성을 판단하는 데 사용되며 일반적으로 메모리 사용량이 적을수록 더 효율적인 알고리즘
- 공간 복잡도는 일반적으로 알고리즘의 시간 복잡도와 함께 고려되며 알고리즘이 실행되는 환경에 따라 달라질 수 있음


## 빅오 표기법(Big-O notation)
- 알고리즘의 입력 크기에 대해 수행 시간이 어떤 방식으로 증가하는지를 표기하는 것으로 최악의 경우의 시간 복잡도를 의미
- 빅오 표기법을 통해 성능을 개선하거나 적절한 알고리즘을 선택할 수 있음


### 빅오 복잡성 차트(Big-O Complexity Chart)
![빅오차트](https://github.com/mkyoung24/Algorithm/assets/103173521/6b9049a6-fb18-42bc-8fcf-2af2526a83e1)


|표기법|이름|시간 복잡도|설명|예시|
|:---:|:---:|:---:|:---:|:---:|
|**O(1)**|상수|상수 시간|입력 크기와 상관없이 일정한 실행 시간을 가집니다.|배열에서 원소 하나 찾기|
|**O(logn)**|로그|로그 시간|입력 크기가 증가함에 따라 실행 시간이 로그함수의 형태로 증가합니다.|이진 탐색 알고리즘|
|**O(n)**|선형|선형 시간|입력 크기와 비례하는 실행 시간을 가집니다.|선형 탐색 알고리즘|
|**O(nlogn)**|로그 선형|선형 로그 시간|입력 크기가 증가함에 따라 실행 시간이 로그함수와 선형 함수의 곱의 형태로 증가합니다.|병합 정렬, 힙 정렬 알고리즘|
|**O(n^2)**|이차|이차 시간|입력 크기의 제곱에 비례하는 실행 시간을 가집니다.|선택 정렬, 버블 정렬, 퀵 정렬 알고리즘|
|**O(2^n)**|지수|지수 시간|입력 크기의 지수에 비례하는 실행 시간을 가집니다.|부분집합|
|**O(n!)**|계승|팩토리얼 시간|입력 크기의 팩토리얼에 비례하는 실행 시간을 가집니다.|외판원 문제|


#### 표기법 예시
1. O(1) : 상수 시간 알고리즘
```java
public static int getFirst(int[] nums) {
    return nums[0];
}
```
2. O(log n) : 로그 시간 알고리즘
```java
public static int binarySearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid -1;
        }
    }
    return -1;
}
```
3. O(n) : 선형 시간 알고리즘
```java
public static int[] reverse(int[] nums) {
    int[] reversed = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        reversed[nums.length - i - 1] = nums[i];
    }
    return reversed;
}
```
4. O(nlogn) : 로그 선형 알고리즘
```java
public static void mergeSort(int[] nums, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
}
```
5. O(n^2) : 이차 시간 알고리즘
```java
public static void selectionSort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        int midIdx = i;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] < nums[minIdx]) {
                midIdx = j;
            }
        }
        int tmp = nums[i];
        nums[i] = nums[minIdx];
        nums[minIdx] = tmp;
    }
}
```
6. O(2^n) : 지수 시간 알고리즘
```java
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```



***
## :file_folder: 출처
- <https://adjh54.tistory.com/186>
- <https://dev-cool.tistory.com/19>
