********************************************************************************
*                              Web Service 예제 정보                           *
********************************************************************************

I. 예제 실행 방법
   본 예제들은 기본적으로 Ant를 사용해서 컴파일하고 실행하도록 되어 있습니다.
   그리고, Example Server를 사용해서 동작합니다. Example Server는 JEUS_HOME에
   있는 readme.txt 파일의 VI. JEUS 실행 부분을 참고하십시오.

   * Build 및 Deploy
    > jant

   * 클라이언트 실행
    > jant run

   * Undeploy
     > jant undeploy

   * 생성된 디렉토리 및 파일 삭제
     > jant clean

   * Build, Deploy, Client run, Undeploy
     (예제에 따라서 4가지를 한꺼번에 실행하는 경우도 있다.)
     > jant

   참고: jant는 JEUS_HOME/bin 디렉토리에 있으며, JEUS_HOME/lib/etc/ant에 있는
   Ant를 실행시켜 줍니다.

   이외에 별도의 Compile 및 Deploy 과정이 필요한 경우에는 각 모듈 디렉토리에
   있는 readme.txt 파일을 참고하십시오.

II. 예제 설명

  * Employee : 사원 조회, 등록, 삭제, 수정을 하는 웹서비스
      DotNetClient : EmployeeService에 대한 .net Client 예제
      EmployeeService : EmployeeService 예제
      j2seClient : EmployeeSerivce에 대한 J2se Client 예제

  * DataTypes : 여러 Data Type을 주고 받는 예제
      DataEchoService : DataEchoService 예제
      delphiClient : DataEchoService에 대한 Delphi Client 예제(Delphi 7.0 사용)
      dotNetClient : DataEchoService에 대한 .net Client 예제
      j2seClient : DataEchoService에 대한 J2se Client 예제
