********************************************************************************
*                      queue ������ ���� ����� ���� ����                      *
********************************************************************************
�������:

1. command prompt�� ���� directory ($JEUS_HOME/samples/jms/examples/queue )
   ��ġ�� �Űܳ��´�.

2. 1 �� ��ο��� >jant �����Ѵ�.

3. 1�� ��ο��� >jant run_sender�����ؼ� �޽����� ������.
   ( �޽����� ExampleQueue �� ������. ) 

4. �ٸ� command shell���� 1�� directory��η� ���� jant run_browser �����Ѵ�.
   ( Queue�� ����ִ� message Ȯ�ε� �����ϴ�. )

5. command shell���� 1�� directory ��η� ���� jant run_receiver �����Ѵ�.
   ( message�� �޴� ���� Ȯ�� �� �� �ִ�. )

6. http://localhost:8088/jms_queue/MsgSender.jsp ȣ���ؼ� �޽����� �������� �ִ�.
   (* 8088�� port number ref-> servlet engine directory�� WEBMain.xml ����)

7. ��ġ�� �� ����� ���� �ϱ� ���ؼ��� : 1�� ��ο��� >jant undeploy�� �����Ѵ�.

8. ���� ���� : 1�� ��ο��� >jant clean �����Ѵ�.

