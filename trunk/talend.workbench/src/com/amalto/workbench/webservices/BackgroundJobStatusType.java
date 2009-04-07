// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


import java.util.Map;
import java.util.HashMap;

public class BackgroundJobStatusType {
    private java.lang.String value;
    private static Map valueMap = new HashMap();
    public static final String _SCHEDULEDString = "SCHEDULED";
    public static final String _RUNNINGString = "RUNNING";
    public static final String _COMPLETEDString = "COMPLETED";
    public static final String _SUSPENDEDString = "SUSPENDED";
    public static final String _CANCEL_REQUESTEDString = "CANCEL_REQUESTED";
    public static final String _STOPPEDString = "STOPPED";
    
    public static final java.lang.String _SCHEDULED = new java.lang.String(_SCHEDULEDString);
    public static final java.lang.String _RUNNING = new java.lang.String(_RUNNINGString);
    public static final java.lang.String _COMPLETED = new java.lang.String(_COMPLETEDString);
    public static final java.lang.String _SUSPENDED = new java.lang.String(_SUSPENDEDString);
    public static final java.lang.String _CANCEL_REQUESTED = new java.lang.String(_CANCEL_REQUESTEDString);
    public static final java.lang.String _STOPPED = new java.lang.String(_STOPPEDString);
    
    public static final BackgroundJobStatusType SCHEDULED = new BackgroundJobStatusType(_SCHEDULED);
    public static final BackgroundJobStatusType RUNNING = new BackgroundJobStatusType(_RUNNING);
    public static final BackgroundJobStatusType COMPLETED = new BackgroundJobStatusType(_COMPLETED);
    public static final BackgroundJobStatusType SUSPENDED = new BackgroundJobStatusType(_SUSPENDED);
    public static final BackgroundJobStatusType CANCEL_REQUESTED = new BackgroundJobStatusType(_CANCEL_REQUESTED);
    public static final BackgroundJobStatusType STOPPED = new BackgroundJobStatusType(_STOPPED);
    
    protected BackgroundJobStatusType(java.lang.String value) {
        this.value = value;
        valueMap.put(this.toString(), this);
    }
    
    public java.lang.String getValue() {
        return value;
    }
    
    public static BackgroundJobStatusType fromValue(java.lang.String value)
        throws java.lang.IllegalStateException {
        if (SCHEDULED.value.equals(value)) {
            return SCHEDULED;
        } else if (RUNNING.value.equals(value)) {
            return RUNNING;
        } else if (COMPLETED.value.equals(value)) {
            return COMPLETED;
        } else if (SUSPENDED.value.equals(value)) {
            return SUSPENDED;
        } else if (CANCEL_REQUESTED.value.equals(value)) {
            return CANCEL_REQUESTED;
        } else if (STOPPED.value.equals(value)) {
            return STOPPED;
        }
        throw new IllegalArgumentException();
    }
    
    public static BackgroundJobStatusType fromString(String value)
        throws java.lang.IllegalStateException {
        BackgroundJobStatusType ret = (BackgroundJobStatusType)valueMap.get(value);
        if (ret != null) {
            return ret;
        }
        if (value.equals(_SCHEDULEDString)) {
            return SCHEDULED;
        } else if (value.equals(_RUNNINGString)) {
            return RUNNING;
        } else if (value.equals(_COMPLETEDString)) {
            return COMPLETED;
        } else if (value.equals(_SUSPENDEDString)) {
            return SUSPENDED;
        } else if (value.equals(_CANCEL_REQUESTEDString)) {
            return CANCEL_REQUESTED;
        } else if (value.equals(_STOPPEDString)) {
            return STOPPED;
        }
        throw new IllegalArgumentException();
    }
    
    public String toString() {
        return value.toString();
    }
    
    private Object readResolve()
        throws java.io.ObjectStreamException {
        return fromValue(getValue());
    }
    
    public boolean equals(Object obj) {
        if (!(obj instanceof BackgroundJobStatusType)) {
            return false;
        }
        return ((BackgroundJobStatusType)obj).value.equals(value);
    }
    
    public int hashCode() {
        return value.hashCode();
    }
}
