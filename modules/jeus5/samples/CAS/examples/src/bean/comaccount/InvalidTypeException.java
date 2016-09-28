/*
 *
 * Copyright 2000 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Sun Microsystems, Inc.  
 * Use is subject to license terms.
 * 
 */

package comaccount;

public class InvalidTypeException extends Exception {

   public InvalidTypeException() { }

   public InvalidTypeException(String msg) {
      super(msg);
   }
}
