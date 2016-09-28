********************************************************************************
*                        Enterprise JavaBeans 예제 정보                        *
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

   참고: jant는 JEUS_HOME/bin 디렉토리에 있으며, JEUS_HOME/lib/etc/ant에 있는
   Ant를 실행시켜 줍니다.

   이외에 별도의 Compile 및 Deploy 과정이 필요한 경우에는 각 모듈 디렉토리에
   있는 readme.txt 파일을 참고하십시오.


II. 예제 설명
   * ejb/basic                : 4가지 EJB의 기본 예제
      beanManaged             : Bean-managed Entity Bean의 예제
      containerManaged/ejb11  : CMP 1.x Entity Bean의 예제
      containerManaged/ejb20  : CMP 2.x Entity Bean의 예제
      statefulSession         : Stateful Session의 예제
      statelessSession        : Stateless Session의 예제

   * ejb/ejbql                : EJB QL 예제
      basic                   : EJB QL의 기본 예제
      aggregation             : EJB QL의 집합 합수 예제
      relationQuery           : EJB Relation에서의 EJB QL 사용 예제

   * ejb/relation             : EJB Relation 예제
      otom                    : One-to-Many Relation의 예제
      mtom                    : Many-to-Many Relation의 예제
