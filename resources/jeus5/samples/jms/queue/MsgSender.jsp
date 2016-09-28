<%@ page contentType="text/html;charset=euc-kr"
    import="javax.naming.*, java.io.*, javax.jms.*, javax.jms.Queue"%>

<%!
    String literal;
    boolean persistent;
    int priority;
    long ttl;
    String replyto;
    String msgText;
%>

<%

    try {
      if (request.getMethod().equals("GET")) {
%>

<html>
    <head><title>JMS Message Sender</title></head>
    <body BGCOLOR=#FFFFFF>
        <font FACE="Verdana">
        <p><h1><font color=#DB1260 face="Verdana">Submit a JMS Message at Queue</font></h1>
        <form METHOD="POST" ACTION="MsgSender.jsp">
            <table bgcolor=#EEEEEE cellpadding=2 border=0 align=center>
                <TR>
                    <TD>Destination:</TD>
                    <TD><select name=dest>
                        <option value=topic selected>JMS Queue</option></select>   
                </TR>
                <TR>
                    <TD>Message Type:</TD>
                    <TD><select name=persistent>
                        <option value=persistent selected>Persistent</option>
                        <option value=nonpersistent>Non Persistent</option></select>
                </TR>
                <TR>
                    <TD>Priority:</td>
                    <TD><select name=priority>
                        <option value=0>0</option>
                        <option value=1>1</option>
                        <option value=2>2</option>
                        <option value=3>3</option>
                        <option value=4 selected>4</option>
                        <option value=5>5</option>
                        <option value=6>6</option>
                        <option value=7>7</option>
                        <option value=8>8</option>
                        <option value=9>9</option></select>
                </TR>
                <TR>
                    <TD>Time to live:</td>
                    <TD><select name=timetolive>
                        <option value=0 selected>Never expires</option>
                        <option value=60000>one minute</option>
                        <option value=600000>ten minutes</option>
                        <option value=3600000>one hour</option>
                        <option value=86400000>one day</option></select>
                </TR>
                <TR>
                    <TD>Reply to:</TD>
                    <TD><select name=replyto>
                        <option value=none selected>ExampleQueue</option></select>
                </TR>
                <TR><TD>Message Text:</TD><TD><input NAME="msgtext" SIZE=60></TD></TR>
                <TR>
                    <TD colspan=2 align=center><input TYPE="submit" VALUE="Send Message"></TD>
                </TR>
            </table>
        </form>
        </font>
    </body>
</html>

<%
      
      } else {
        persistent = request.getParameter("persistent").equals("persistent");
        priority = Integer.parseInt(request.getParameter("priority"));
        ttl = Long.parseLong(request.getParameter("timetolive"));
        replyto = request.getParameter("replyto");
        msgText = request.getParameter("msgtext");
        
        sendQueueMessage(persistent, priority, ttl, replyto, msgText);

%>

<HTML>
    <HEAD><TITLE>Message Status</TITLE></HEAD>
    <BODY BGCLOR=#FFFFFF><p>
        <h1><FONT COLOR=#DB1260 FACE="Verdana">Message Status</FONT></h1>
        Message Submitted: <%=msgText %>
    </BODY>
</HTML>

<%
        return;
      }
    } catch (Exception e) {
            e.printStackTrace();
    }

%>



<%!
        public void sendQueueMessage(boolean persistent, int priority, long ttl, 
                             String replyto, String topicMessage) throws NamingException, JMSException {
            Context ctx = new InitialContext();
            QueueConnectionFactory qconFactory;
            QueueConnection qcon;
            QueueSession qsession;
            QueueSender qsender;
            Queue queue;
            Topic topic;
            TextMessage msg;

            qconFactory = (QueueConnectionFactory) ctx.lookup("QueueConnectionFactory");
            qcon = qconFactory.createQueueConnection();
            qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            queue = (Queue) ctx.lookup("ExampleQueue");
            qsender = qsession.createSender(queue);
            msg = qsession.createTextMessage();
            if (replyto.equals("queue")) {
                msg.setJMSReplyTo(queue);
            }
            else if (replyto.equals("topic")) {
                topic = (Topic) ctx.lookup("ExampleTopic");
                msg.setJMSReplyTo(topic);
            }
            msg.setText(topicMessage);

            qcon.start();
            qsender.send(msg,
                                     persistent ? DeliveryMode.PERSISTENT : DeliveryMode.NON_PERSISTENT,
                                     priority,
                                     ttl);

            qsender.close();
            qsession.close();
            qcon.close();
        }

%>
