package ping;

import com.tmax.ws.security.WSPasswordCallback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;


public class PingPWCallback implements CallbackHandler
{
   public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException
   {
      for (int i = 0; i < callbacks.length; i++)
      {
         if (callbacks[i] instanceof WSPasswordCallback)
         {
            WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

            if (pc.getUsage() == WSPasswordCallback.USERNAME_TOKEN)
            {
               pc.setPassword("usertoken_password");
            }

            if (pc.getUsage() == WSPasswordCallback.DECRYPT)
            {
               pc.setPassword("key_password");
            }

            if (pc.getUsage() == WSPasswordCallback.SIGNATURE)
            {
               pc.setPassword("key_password");
            }
         }
      }
   }
}
