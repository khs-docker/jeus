********************************************************************************
*                      topic ������ ���� ����� ���� ����                      *
********************************************************************************
�������:

1. command prompt�� ���� directory ( $JEUS_HOME/samples/jms/examples/topic )
   �� �Űܳ��´�.

2. 1�� ��ο��� >jant �����Ѵ�

3. 1�� ��ο��� >jant run_receiver �����ؼ� Non-Durable Subscriber ���ؼ� 
   �޽����� ���� �غ��Ѵ�. 
   
4. �ٸ� command shell���� 1�� directory��η� ���� >jant run_sender �����ؼ�
   �޽����� ������. 
   ( 3�� topic msg receiver���� message�� �޴� ���� Ȯ�� �� �� �ִ�. )

5. http://localhost:8088/jms_topic/MsgSender.jsp ȣ���ؼ� �޽����� �������� �ִ�.
   (* 8088�� port number ref-> servlet engine directory�� WEBMain.xml ����)

6. ��ġ�� ������� �����ϱ� ���ؼ��� : 1���� >jant undeploy�� �����Ѵ�.

7. ���� ���� : 1���� >jant clean �����Ѵ�.

   
