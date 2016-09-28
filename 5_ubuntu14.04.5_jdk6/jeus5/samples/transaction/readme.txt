********************************************************************************
*                           Transaction 예제 정보                              *
********************************************************************************

I. 예제 실행 방법
   본 예제들은 기본적으로 Ant를 사용해서 컴파일하고 실행하도록 되어 있습니다.
   그리고, Example Server를 사용해서 동작합니다. Example Server는 JEUS_HOME에
   있는 readme.txt 파일의 VI. JEUS 실행 부분을 참고하십시오.

   * Build 준비
    >jant createtable

   * Build 및 Deploy
    > jant

   * 클라이언트 실행
    > jant run

   * Undeploy
     > jant undeploy

   * 생성된 디렉토리 및 파일 삭제
     > jant clean

   참고: jant는 JEUS_HOME/bin 디렉토리에 있으며, JEUS_HOME/lib/etc/ant에 있는
   Ant를 실행시켜 줍니다.

   이외에 별도의 Compile 및 Deploy 과정이 필요한 경우에는 각 모듈 디렉토리에
   있는 readme.txt 파일을 참고하십시오.


II. 예제 설명
   본 예제는 Example Server의 LocalXA 데이터소스를 사용해서 Transaction의
   사용법을 보여주는 예제입니다.

   * bmt    : Bean-managed Transaction의 예제
   * cmt    : Container-managed Transaction의 예제
