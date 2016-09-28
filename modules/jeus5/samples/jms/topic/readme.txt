********************************************************************************
*                      topic 예제의 실행 방법에 대한 설명                      *
********************************************************************************
실행순서:

1. command prompt를 현재 directory ( $JEUS_HOME/samples/jms/examples/topic )
   에 옮겨놓는다.

2. 1의 경로에서 >jant 실행한다

3. 1의 경로에서 >jant run_receiver 실행해서 Non-Durable Subscriber 통해서 
   메시지를 받을 준비한다. 
   
4. 다른 command shell에서 1의 directory경로로 가서 >jant run_sender 실행해서
   메시지를 보낸다. 
   ( 3의 topic msg receiver에서 message를 받는 것을 확인 할 수 있다. )

5. http://localhost:8088/jms_topic/MsgSender.jsp 호출해서 메시지를 보낼수도 있다.
   (* 8088은 port number ref-> servlet engine directory의 WEBMain.xml 참조)

6. 배치된 웹모듈을 제거하기 위해서는 : 1에서 >jant undeploy를 실행한다.

7. 지울 때는 : 1에서 >jant clean 실행한다.

   
