/*
 *
 * Copyright 2000 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */

package comaccount;

public class InsufficientBalanceException extends Exception {

   public InsufficientBalanceException() { }

   public InsufficientBalanceException(String msg) {
      super(msg);
   }
}
