# Test

네이버 로그인시 localhost:8080/login으로 가지는 에러 -> application.properties 변경으로 해결 (오타였던 것)

collation_server utf8mb4 설정 오류 -> character_set_server 을 utf8mb4로 설정 해주기 

5장
오류내용
java.lang.AssertionError:
Expecting:
<"html코드">
to contain:
 <"스프링 부트로 시작하는 웹 서비스">

해결
indexControllerTest의  assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");를
assertThat(body).contains("스프링부트로 시작하는 웹 서비스 Ver.2");로 변경하여 해결

index 안에 해당 내용이 없다는 오류메시지였던것 같다.

7장
RDS 연결 오류 (DB Browser)
인텔리제이 우측상당에 있는 Database로 연결해서 해결(유료버전만 있는 듯함)

8장
에러 내용
Invalid or corrupt jarfile /home/ec2-user/app/step1/ 

해결 
원인 depoly.sh 오타 
책 
echo "> 새 애플리케이션 배포" JAR_NAME=$(ls -tr $REPOSITORY/ | grep jar | tail -n 1)


EC2 및 RDS 연결 오류
deploy.sh의 오타 해결

311페이지 CURL 오류나는 것 해결하는중.


