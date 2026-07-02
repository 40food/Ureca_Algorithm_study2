## 🧩 문제 정보

- 플랫폼: PGS
- 문제 이름: 같은 숫자는 싫어
- 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586

---

## 💡 문제 설명
<!--문제에 대한 간단한 요약 (내가 이 문제를 얼마나 파악하고 있는지 확인)-->

- 연속으로 나타나는 숫자를 제거해서 배열로 return

---

## 🚀 접근 방법
<!--
- 어떤 방식으로 접근했는지
- 왜 이 알고리즘을 선택했는지
- 핵심 로직
-->

- stack에 숫자를 넣고 peek 확인해서 겹치면 넣지 않음
- 마지막에 숫자들을 빼서 배열로 return

---

## ⏱️ 시간 복잡도

- 시간: O(n)
- 공간: O(n)

---

## 🌅 느낀 점
<!--배운 점 / 아쉬운 점 / 개선 포인트-->

#### stack, arraylist 등을 int[]로 바꾸는 방법
`변수명.stream().mapToInt(Integer::intValue).toArray()`