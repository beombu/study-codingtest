## Parametric Search

파라매트릭 서치(결정 알고리즘)는 바이너리 서치를 기반으로 구현된다.

이 둘의 차이점은 최적화 문제 -> 결정 문제로 바꾸어 푸는 것입니다.
(문제 상황을 만족하는 특정한 값 - 최소 값, 최대 값)

원하는 조건을 만족하는 가장 알맞는 값을 특정한 오차범위 이내에서 알고 싶은 경우 사용합니다.

- Binary Search : 배열에서 중앙값이 가르키는 값이 내가 찾는 값인지가 중요함
- Parametric Search : 원하는 조건을 만족하는 가장 알맞는 값을 찾는 것이 중요함

### 동작과정
1. 데이터를 정렬한다.
2. 범위를 반씩 좁혀간다.
3. S와 E가 값을 때까지 진행한다.

### 시간복잡도
`O( log N )`