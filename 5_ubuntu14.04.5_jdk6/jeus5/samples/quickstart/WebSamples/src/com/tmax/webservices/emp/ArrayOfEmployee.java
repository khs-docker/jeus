/**
 * ArrayOfEmployee.java
 *
 * This file was auto-generated from WSDL
 *  by the JEUS Web Services Wsdl-to-Java Emitter
 */

package com.tmax.webservices.emp;

public class ArrayOfEmployee  implements java.io.Serializable {
    private com.tmax.webservices.emp.Employee[] item;

    public ArrayOfEmployee() {
    }

    public ArrayOfEmployee(
           com.tmax.webservices.emp.Employee[] item) {
           this.item = item;
    }


    /**
     * Gets the item value for this ArrayOfEmployee.
     * 
     * @return item
     */
    public com.tmax.webservices.emp.Employee[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this ArrayOfEmployee.
     * 
     * @param item
     */
    public void setItem(com.tmax.webservices.emp.Employee[] item) {
        this.item = item;
    }

    public com.tmax.webservices.emp.Employee getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.tmax.webservices.emp.Employee _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEmployee)) return false;
        ArrayOfEmployee other = (ArrayOfEmployee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
