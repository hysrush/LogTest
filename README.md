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

  	implementation 'org.projectlombok:lombok'    :  __롬복에 대한 의존성__
	
	implementation('org.slf4j:jcl-over-slf4j')   :  __slf4j에 대한 의존성__
	
	implementation('ch.qos.logback:logback-classic') :  __logback에 대한 의존성__
	
2. logback.xml 설정 	
* * * 
-rogging 을 할때. 프로젝트의 resource 폴더에 rogback.xml 파일을 만들어 logback 설정을 넣어놓는다. 
이때, logback을 의존성에 추가했기때문에. 스프링에서, 프로젝트가 가동될때, logback.xml 이라는 파일이 
로그에 대한 설정파일이라는 것을 인지하고 읽는다.

-일반적으로 xml 파일에는 아래와 같이 설정을 한다.

<property name="LOGS_ABSOLUTE_PATH" value="./logs" />

 <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern> %d{yyyy-MM-dd HH:mm:ss.SSS} %highlight(%-5level) %magenta(%-4relative) --- [ %thread{10} ] %cyan(%logger{20}) : %msg%n </pattern>
        </encoder>
 </appender>
	
	
-appender는 어디에, 어떻게 로그를 저장할 것인지에 대한 설정을 의미한다 .
저장 방식에는 console, file, rollingfile , SMTPAppender, DBAppender 등등이 있으며.

1. consoleAppender : 콘솔에 로그를 어떤 포맷으로 출력할지 설정.
2. fileAppender : 파일에 로그를 찍는 방법.
3. RollingFileAppender : 여러개의 파일을 순회하며 로그를 찍는 방법.
4. SMTPAppender : 로그를 메일에 찍어 보내는 방법
5. DBAppender : 데이터베이스에 로그를 찍는방법

__보통 console 방식과 RollingFile 방식을 가장 자주 사용한다.__

- <property> 엘리먼트는 해당 설정파일에서 사용될 값을 정의하는 것으로 , LOGS_ABSOLUTE_PATH"
	라고 로그가 쌓일 경로를 지정 해놓았다.

- <encoder> 엘리먼트는 appender가 관리하는 OutputStream 에 쓸 시간과 내용을 제어 할 수 있다.
	encoder의 내부에서 로그를 찍을 pattern 을 정리한다.

- <pattern> 이 엘리먼트에서 작성된 패턴 룰에 의해서 로그가 찍힌다.	
Link: https://jdkblog.tistory.com/122


	
