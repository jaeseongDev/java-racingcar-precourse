# 미션 - 자동차 경주 게임

## 기능 구현 목록
- [x] 경주할 자동차 이름 입력받기
    - [x] [예외처리] 이름은 1글자 이상 5글자 이하만 가능하다. (문자열의 양끝에 있는 공백을 제거한 글자 수가 5글자 이하여야 한다.)
    - [x] [예외처리] 이름으로 공백 또는 빈 값을 사용할 수는 없다.
    - [x] [예외처리] 경주할 자동차가 2대 이상이어야 한다. 
    - [x] [예외처리] 경주할 자동차의 이름이 중복되면 안 된다. (문자열의 양끝에 있는 공백 제거 후 비교하기)
    - [x] [예외처리] 자동차의 이름을 생성할 때, 문자열의 양쪽 끝 공백을 제거하고 생성한다.
- [ ] 시도할 횟수 입력받기
    - [ ] [예외처리] 숫자여야 한다.
    - [ ] [예외처리] 1 이상의 숫자여야 한다.
- [ ] 1번의 시도 때마다 0~9 사이의 random의 값에 따라서 이동하기
    - [ ] random 값이 4 이상일 경우 전진 (3 이하의 값일 경우 가만히 있음)
- [ ] 1번의 시도가 끝날 때마다 실행 결과 출력하기
- [ ] 우승자 출력하기
    - [ ] 우승자가 1명 이상일 수 있다.

## 유의 사항
- [ ] 에러 문구는 ```[ERROR]```로 시작해야 한다.