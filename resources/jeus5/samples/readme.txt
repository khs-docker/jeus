********************************************************************************
*                        Tmax Soft JEUS 5 ���� ����                            *
********************************************************************************

I. ���� ���� ���
   �� �������� �⺻������ Ant�� ����ؼ� �������ϰ� �����ϵ��� �Ǿ� �ֽ��ϴ�.
   �׸���, Example Server�� ����ؼ� �����մϴ�. Example Server�� JEUS_HOME��
   �ִ� readme.txt ������ VI. JEUS ���� �κ��� �����Ͻʽÿ�.

   �� �������� ���̴� ������, �Ϲ������� ������ ���� ������ �����ŵ�ϴ�.

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


II. ���丮 ����

  ���� ���丮�� JEUS_HOME/samples ���丮�� ���ϸ�, ������ ������ �����ϴ�.

  JEUS_HOME/samples
   |
   +- CAS               : Client Access Services ����
   |
   +- clientContainer   : J2EE Client Container ����
   |
   +- ejb               : Enterprise JavaBeans ����
   |
   +- J2COM             : Java To COM ����
   |
   +- jms               : JMS ����
   |
   +- Scheduler         : JEUS Scheduler ����
   |
   +- snmp              : SNMP ����
   |
   +- transaction       : Transaction ����
   |
   +- WebService        : Java WebService ����
   |
   +- quickstart        : Quick Start configuration(Adventure Builder ����)
   |
   +- manual_examples   : �Ŵ��󿡼� �Ұ��� ����
   |
   +- common.xml        : ������ �������ϱ� ���� Ant�� ���� build ����
   |
   +- readme.txt        : �� ����
   |
   +- sample.properties : Ant�� build.xml ���Ͽ��� ����ϱ� ���� �⺻ ���� ����

