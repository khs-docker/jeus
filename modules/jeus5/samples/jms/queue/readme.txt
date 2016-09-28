********************************************************************************
*                      queue 예제의 실행 방법에 대한 설명                      *
********************************************************************************
실행순서:

1. command prompt를 현재 directory ($JEUS_HOME/samples/jms/examples/queue )
   위치로 옮겨놓는다.

2. 1 의 경로에서 >jant 실행한다.

3. 1의 경로에서 >jant run_sender실행해서 메시지를 보낸다.
   ( 메시지를 ExampleQueue 에 보낸다. ) 

4. 다른 command shell에서 1의 directory경로로 가서 jant run_browser 실행한다.
   ( Queue에 들어있는 message 확인도 가능하다. )

5. command shell에서 1의 directory 경로로 가서 jant run_receiver 실행한다.
   ( message를 받는 것을 확인 할 수 있다. )

6. http://localhost:8088/jms_queue/MsgSender.jsp 호출해서 메시지를 보낼수도 있다.
   (* 8088은 port number ref-> servlet engine directory의 WEBMain.xml 참조)

7. 배치된 웹 모듈을 제거 하기 위해서는 : 1의 경로에서 >jant undeploy를 실행한다.

8. 지울 때는 : 1의 경로에서 >jant clean 실행한다.

