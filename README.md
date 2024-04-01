# 문자열 검색
- 어떤 문자열 안에 특정 문자열이 들어 있는지 조사하고, 들어 있다면 그 위치를 찾는 것


## 브루트-포스
![브루트-포스법](https://github.com/mkyoung24/Algorithm/assets/103173521/0410184c-5886-4873-b28a-990f314fac74)
- 텍스트 "ABABCDEFGHA"에서 패턴 "ABC"를 브루트-포스법(brute force method)을 사용해 검색하는 과정
1. 텍스트의 첫 문자 'A'부터 시작하는 3개의 문자와 "ABC"가 일치하는지 검사함
2. 패턴을 1칸 뒤로 옮김
3. 패턴을 다시 1칸 뒤로 옮김


### String.indexOf 메소드로 문자열 검색하기
- java.lang.String 클래스는 문자열을 검색하는 indexOf 메서드와 lastIndexOf 메서드를 제공함
```
  1)int indexOf(String str)
  2)int indexOf(String str, int fromlndex)
  3)int lastIndexOf(String str)
  4)int lastIndexOf(String str, int fromIndex)
```

   
