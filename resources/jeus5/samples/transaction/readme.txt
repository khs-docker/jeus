********************************************************************************
*                           Transaction ���� ����                              *
********************************************************************************

I. ���� ���� ���
   �� �������� �⺻������ Ant�� ����ؼ� �������ϰ� �����ϵ��� �Ǿ� �ֽ��ϴ�.
   �׸���, Example Server�� ����ؼ� �����մϴ�. Example Server�� JEUS_HOME��
   �ִ� readme.txt ������ VI. JEUS ���� �κ��� �����Ͻʽÿ�.

   * Build �غ�
    >jant createtable

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
   �� ������ Example Server�� LocalXA �����ͼҽ��� ����ؼ� Transaction��
   ������ �����ִ� �����Դϴ�.

   * bmt    : Bean-managed Transaction�� ����
   * cmt    : Container-managed Transaction�� ����
