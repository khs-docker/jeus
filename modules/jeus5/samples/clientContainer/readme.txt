*****************************************************************************
*                        Client Container ���� ����                         *
*****************************************************************************

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
   * clientcontainer                : 2���� client container ����
      simpleBean_applet             : applet container �⺻ ����
      simpleBean_application        : client container �⺻ ����

   * jnlp                           : JNLP ����
      HelloJeus                     : jnlp container �⺻ ����
