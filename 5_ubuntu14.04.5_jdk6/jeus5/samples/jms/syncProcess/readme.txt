********************************************************************************
*                syncProcess 예제의 실행 방법에 대한 설명                      *
********************************************************************************
실행순서:

1. command prompt 를 
   현재 directory ($JEUS_HOME/samples/jms/examples/syncProcess )에 옮겨놓는다.

2. 1의 경로에서 >jant 실행한다.

3. 1의 경로에서 >jant run_receiver 실행해서 Sychronous 한 receiver 를 실행해서 
   메시지를 받을 준비한다. ( 1분 동안 메시지가 도착하지 않으면 종료한다. )

4. 다른 command shell에서 1의 directory경로로 가서 >jant run_sender 실행한다.
   ( msg receiver에서 message를 받는 것을 확인 )

5. 지울 때는 : 1의 경로에서 >ant clean 실행한다.


   