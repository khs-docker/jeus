********************************************************************************
*                        Java Message Service 예제 정보                        *
********************************************************************************

I. 예제 실행 방법
   본 예제들은 기본적으로 Ant를 사용해서 컴파일하고 실행하도록 되어 있습니다.
   그리고, Example Server를 사용해서 동작합니다. Example Server는 JEUS_HOME에
   있는 readme.txt 파일의 VI. JEUS 실행 부분을 참고하십시오.

   * Build 및 compile
    > jant

   * 클라이언트 실행
    > jant run_sender   <== 메시지 보내기
    > run_receiver      <== 메시지 받기

   * Queue 에서 메시지 모니터링
     > jant run_browser <== Queue Destination 에 들어있는 메시지 모니터링

   * 생성된 디렉토리 및 파일 삭제
     > jant clean

   참고: jant는 JEUS_HOME/bin 디렉토리에 있으며, JEUS_HOME/lib/etc/ant에 있는
   Ant를 실행시켜 줍니다.

   이외에 별도의 Compile 및 실행에 관한 자세한 설명은 각 모듈 디렉토리에
   있는 readme.txt 파일을 참고하십시오.


II. 예제 설명
   본 예제는 Example Server의 JMS 엔진을 사용해서 message service
   사용법을 보여주는 예제입니다.

   * queue       : queue Destination 을 사용해서 Asynchronous 하게 메시지를
                   처리하는 예제(jsp 파일에서 메시지를 보내는 예제 포함)
   * syncProcess : queue Destination 을 사용해서 synchronous 하게 메시지를
                   처리하는 예제
   * topic       : topic Destination 을 사용해서 Asynchronous 하게 메시지를
                   처리하는 예제(jsp 파일에서 메시지를 보내는 예제 포함)