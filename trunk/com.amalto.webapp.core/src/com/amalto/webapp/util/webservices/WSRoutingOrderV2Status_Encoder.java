// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.webapp.util.webservices;


import com.sun.xml.rpc.encoding.simpletype.*;
import javax.xml.namespace.QName;
import com.sun.xml.rpc.streaming.*;

public class WSRoutingOrderV2Status_Encoder extends SimpleTypeEncoderBase {
    
    private static final SimpleTypeEncoder encoder = XSDStringEncoder.getInstance();
    private static final WSRoutingOrderV2Status_Encoder instance = new WSRoutingOrderV2Status_Encoder();
    
    private WSRoutingOrderV2Status_Encoder() {
    }
    
    public static SimpleTypeEncoder getInstance() {
        return instance;
    }
    
    public String objectToString(Object obj, XMLWriter writer) throws Exception {
        java.lang.String value = ((WSRoutingOrderV2Status)obj).getValue();
        return encoder.objectToString(value, writer);
    }
    
    public Object stringToObject(String str, XMLReader reader) throws Exception {
        return WSRoutingOrderV2Status.fromValue((java.lang.String)encoder.stringToObject(str, reader));
    }
    
}
