# Log란 ?
* * * 
- 연속된 데이터의 기록, 프로그램이 실행되면서 console에 무언가 출력되는 것들을 의미
- 1. 비즈니스 로직에서 로그성 코드를 분리.
- 2. 상황에 따라 유연하게 대처 할 수 있도록 로그를 레벨로 분리하여 노출 및 관리
- 3. 특정한 로그는 정해진 파일에 저장.

이러한 요구사항들이 생겨 여러가지의 Logging Framework 들이 등장했다.
ex) logback-classic , log4j , java.util.logging , simple , ....

이러한 로깅 관련 라이브러리들을, 하나의 통일된 방식으로 사용할 수 있게 제공하는 로깅 facade interface 
Slf4j 를 사용한다. 

# Slf4j 설정 방법 

1. maven, gradle 프로젝트에 logback , slf4j의 의존성을 추가한다 . 

  implementation 'org.projectlombok:lombok'    
	implementation('org.slf4j:jcl-over-slf4j')
	implementation('ch.qos.logback:logback-classic')

