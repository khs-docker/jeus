********************************************************************************
*                        Java Message Service ���� ����                        *
********************************************************************************

I. ���� ���� ���
   �� �������� �⺻������ Ant�� ����ؼ� �������ϰ� �����ϵ��� �Ǿ� �ֽ��ϴ�.
   �׸���, Example Server�� ����ؼ� �����մϴ�. Example Server�� JEUS_HOME��
   �ִ� readme.txt ������ VI. JEUS ���� �κ��� �����Ͻʽÿ�.

   * Build �� compile
    > jant

   * Ŭ���̾�Ʈ ����
    > jant run_sender   <== �޽��� ������
    > run_receiver      <== �޽��� �ޱ�

   * Queue ���� �޽��� ����͸�
     > jant run_browser <== Queue Destination �� ����ִ� �޽��� ����͸�

   * ������ ���丮 �� ���� ����
     > jant clean

   ����: jant�� JEUS_HOME/bin ���丮�� ������, JEUS_HOME/lib/etc/ant�� �ִ�
   Ant�� ������� �ݴϴ�.

   �̿ܿ� ������ Compile �� ���࿡ ���� �ڼ��� ������ �� ��� ���丮��
   �ִ� readme.txt ������ �����Ͻʽÿ�.


II. ���� ����
   �� ������ Example Server�� JMS ������ ����ؼ� message service
   ������ �����ִ� �����Դϴ�.

   * queue       : queue Destination �� ����ؼ� Asynchronous �ϰ� �޽�����
                   ó���ϴ� ����(jsp ���Ͽ��� �޽����� ������ ���� ����)
   * syncProcess : queue Destination �� ����ؼ� synchronous �ϰ� �޽�����
                   ó���ϴ� ����
   * topic       : topic Destination �� ����ؼ� Asynchronous �ϰ� �޽�����
                   ó���ϴ� ����(jsp ���Ͽ��� �޽����� ������ ���� ����)