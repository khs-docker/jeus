********************************************************************************
*                        Enterprise JavaBeans ���� ����                        *
********************************************************************************

I. ���� ���� ���
   �� �������� �⺻������ Ant�� ����ؼ� �������ϰ� �����ϵ��� �Ǿ� �ֽ��ϴ�.
   �׸���, Example Server�� ����ؼ� �����մϴ�. Example Server�� JEUS_HOME��
   �ִ� readme.txt ������ VI. JEUS ���� �κ��� �����Ͻʽÿ�.

   * Build �� Deploy
    > jant

   * Ŭ���̾�Ʈ ����
    > jant run

   * Undeploy
     > jant undeploy

   * ������ ���丮 �� ���� ����
     > jant clean

   ����: jant�� JEUS_HOME/bin ���丮�� ������, JEUS_HOME/lib/etc/ant�� �ִ�
   Ant�� ������� �ݴϴ�.

   �̿ܿ� ������ Compile �� Deploy ������ �ʿ��� ��쿡�� �� ��� ���丮��
   �ִ� readme.txt ������ �����Ͻʽÿ�.


II. ���� ����
   * ejb/basic                : 4���� EJB�� �⺻ ����
      beanManaged             : Bean-managed Entity Bean�� ����
      containerManaged/ejb11  : CMP 1.x Entity Bean�� ����
      containerManaged/ejb20  : CMP 2.x Entity Bean�� ����
      statefulSession         : Stateful Session�� ����
      statelessSession        : Stateless Session�� ����

   * ejb/ejbql                : EJB QL ����
      basic                   : EJB QL�� �⺻ ����
      aggregation             : EJB QL�� ���� �ռ� ����
      relationQuery           : EJB Relation������ EJB QL ��� ����

   * ejb/relation             : EJB Relation ����
      otom                    : One-to-Many Relation�� ����
      mtom                    : Many-to-Many Relation�� ����
