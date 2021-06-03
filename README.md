# backEnd

실행방법

1. jar 파일을 다운 받는다.

2. create database.md 파일을 따라서 데이터베이스를 생성한다.

3. cmd 창을 열어(window) jar 파일이 있는 곳으로 위치 이동 후 아래 명령문을 입력한다.
이 때, database의 이름은 nomadclone으로 고정시켜두었고, username과 password를 자신의 환경에 맞게 고쳐 입력해준다.
   
   ```
   java -jar demo-0.0.1-SNAPSHOT.jar --spring.datasource.username=jueun --spring.datasource.password=jueun
   ```
   
4. 중단하고 싶을 때는 cmd 창에서 ctrl + c 를 눌러준다.