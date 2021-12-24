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

EC2 및 RDS 연결 오류
2021-12-23 16:02:42.663 ERROR 1869 --- [main] o.s.b.web.embedded.tomcat.TomcatStarter  : Error starting Tomcat context. Exception: org.springframework.beans.facto
mcatStarter  : Error starting Tomcat context. Exception: org.springframework.beans.faositoryFilterRegistration' defined in class path resource [org/springframework/boot/auto
ctory.UnsatisfiedDependencyException. Message: Error creating bean with name 'session expressed through method 'sessionRepositoryFilterRegistration' parameter 1; nested exce
RepositoryFilterRegistration' defined in class path resource [org/springframework/booting bean with name 'springSessionRepositoryFilter' defined in class path resource [org/
t/autoconfigure/session/SessionRepositoryFilterConfiguration.class]: Unsatisfied depepSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springSes
ndency expressed through method 'sessionRepositoryFilterRegistration' parameter 1; neory.BeanCreationException: Error creating bean with name 'sessionRepository' defined in
sted exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Euration$SpringBootJdbcHttpSessionConfiguration.class]: Bean instantiation via factory me
rror creating bean with name 'springSessionRepositoryFilter' defined in class path re: Failed to instantiate [org.springframework.session.jdbc.JdbcIndexedSessionRepository]:
source [org/springframework/boot/autoconfigure/session/JdbcSessionConfiguration$SprinntimeException: Driver org.mariadb.jdbc.Driver claims to not accept jdbcUrl, jdbc:h2:mem
gBootJdbcHttpSessionConfiguration.class]: Unsatisfied dependency expressed through me
thod 'springSessionRepositoryFilter' parameter 0; nested exception is org.springframe
work.beans.factory.BeanCreationException: Error creating bean with name 'sessionReposcation with 'debug' enabled.
itory' defined in class path resource [org/springframework/boot/autoconfigure/session: Application run failed
/JdbcSessionConfiguration$SpringBootJdbcHttpSessionConfiguration.class]: Bean instanteating bean with name 'sessionRepositoryFilterRegistration' defined in class path resour
iation via factory method failed; nested exception is org.springframework.beans.BeanIon.class]: Unsatisfied dependency expressed through method 'sessionRepositoryFilterRegis
nstantiationException: Failed to instantiate [org.springframework.session.jdbc.JdbcInedDependencyException: Error creating bean with name 'springSessionRepositoryFilter' def
dexedSessionRepository]: Factory method 'sessionRepository' threw exception; nested eonConfiguration$SpringBootJdbcHttpSessionConfiguration.class]: Unsatisfied dependency ex
xception is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims to notis org.springframework.beans.factory.BeanCreationException: Error creating bean with nam
accept jdbcUrl, jdbc:h2:mem://localhost/~/testdb;MODE=MYSQL

Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error cr.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
eating bean with name 'sessionRepositoryFilterRegistration' defined in class path reseating bean with name 'springSessionRepositoryFilter' defined in class path resource [or
ource [org/springframework/boot/autoconfigure/session/SessionRepositoryFilterConfigurttpSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springS
ation.class]: Unsatisfied dependency expressed through method 'sessionRepositoryFilte.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
rRegistration' parameter 1; nested exception is org.springframework.beans.factory.Uns nested exception is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims t
atisfiedDependencyException: Error creating bean with name 'springSessionRepositoryFi
lter' defined in class path resource [org/springframework/boot/autoconfigure/session/eating bean with name 'springSessionRepositoryFilter' defined in class path resource [or
JdbcSessionConfiguration$SpringBootJdbcHttpSessionConfiguration.class]: Unsatisfied dttpSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springS
ependency expressed through method 'springSessionRepositoryFilter' parameter 0; neste.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
d exception is org.springframework.beans.factory.BeanCreationException: Error creatin nested exception is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims t
g bean with name 'sessionRepository' defined in class path resource [org/springframew
ork/boot/autoconfigure/session/JdbcSessionConfiguration$SpringBootJdbcHttpSessionConfeating bean with name 'springSessionRepositoryFilter' defined in class path resource [or
iguration.class]: Bean instantiation via factory method failed; nested exception is o
rg.springframework.beans.BeanInstantiationException: Failed to instantiate [org.sprineating bean with name 'springSessionRepositoryFilter' defined in class path resource [or
gframework.session.jdbc.JdbcIndexedSessionRepository]: Factory method 'sessionRepositttpSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springS
ory' threw exception; nested exception is java.lang.RuntimeException: Driver org.marittpSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springS
adb.jdbc.Driver claims to not accept jdbcUrl, jdbc:h2:mem://localhost/~/testdb;MODE=M.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
YSQL
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error crttpSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springS
eating bean with name 'springSessionRepositoryFilter' defined in class path resource.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
[org/springframework/boot/autoconfigure/session/JdbcSessionConfiguration$SpringBootJd nested exception is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims t
bcHttpSessionConfiguration.class]: Unsatisfied dependency expressed through method 's.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
pringSessionRepositoryFilter' parameter 0; nested exception is org.springframework.beeating bean with name 'springSessionRepositoryFilter' defined in class path resource [or
ans.factory.BeanCreationException: Error creating bean with name 'sessionRepository'ttpSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springS
defined in class path resource [org/springframework/boot/autoconfigure/session/JdbcSe.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
ssionConfiguration$SpringBootJdbcHttpSessionConfiguration.class]: Bean instantiation nested exception is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims t
via factory method failed; nested exception is org.springframework.beans.BeanInstanti
ationException: Failed to instantiate [org.springframework.session.jdbc.JdbcIndexedSeeating bean with name 'springSessionRepositoryFilter' defined in class path resource [or
ssionRepository]: Factory method 'sessionRepository' threw exception; nested exceptiottpSessionConfiguration.class]: Unsatisfied dependency expressed through method 'springS
n is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims to not accept.beans.BeanInstantiationException: Failed to instantiate [org.springframework.session.jd
jdbcUrl, jdbc:h2:mem://localhost/~/testdb;MODE=MYSQL nested exception is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims t
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiat
e [org.springframework.session.jdbc.JdbcIndexedSessionRepository]: Factory method 'seeating bean with name 'springSessionRepositoryFilter' defined in class path resource [or
ssionRepository' threw exception; nested exception is java.lang.RuntimeException: Dri nested exception is java.lang.RuntimeException: Driver org.mariadb.jdbc.Driver claims t
ver org.mariadb.jdbc.Driver claims to not accept jdbcUrl, jdbc:h2:mem://localhost/~/t
estdb;MODE=MYSQL


