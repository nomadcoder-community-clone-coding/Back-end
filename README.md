# backEnd

## 01 실행하는 방법

### 대상: spring.datasource.password를 물어볼 수 있는 사람

1. jar 파일을 다운 받는다.

3. cmd 창을 열어(window) jar 파일이 있는 곳으로 위치 이동 후 실행한다.

   ```
   java -jar demo-0.0.1-SNAPSHOT.jar --spring.datasource.password=
   ```
   
3. 중단하고 싶을 때는 cmd 창에서 ctrl + c 를 눌러준다.

### 대상: 외부 인원

1. nomadclone이라는 이름으로 database를 생성하고 [파일](https://github.com/nomadcoder-community-clone-coding/backEnd/wiki/schema)에 적힌 sql을 실행한다.
2. 프로젝트 파일을 다운받아 intelliJ에서 import 시킨다.
3. properties.yml의 db 관련 속성값을 local 환경에 맞춘다.
4. 실행

## 02 API 명세서

[#link](https://github.com/nomadcoder-community-clone-coding/backEnd/wiki)