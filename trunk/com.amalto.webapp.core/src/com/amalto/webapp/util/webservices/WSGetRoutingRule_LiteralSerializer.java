// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.webapp.util.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSGetRoutingRule_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsRoutingRulePK_QNAME = new QName("", "wsRoutingRulePK");
    private static final QName ns2_WSRoutingRulePK_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK");
    private CombinedSerializer ns2_myWSRoutingRulePK_LiteralSerializer;
    
    public WSGetRoutingRule_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSGetRoutingRule_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSRoutingRulePK_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.webapp.util.webservices.WSRoutingRulePK.class, ns2_WSRoutingRulePK_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSGetRoutingRule instance = new com.amalto.webapp.util.webservices.WSGetRoutingRule();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsRoutingRulePK_QNAME)) {
                member = ns2_myWSRoutingRulePK_LiteralSerializer.deserialize(ns1_wsRoutingRulePK_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsRoutingRulePK((com.amalto.webapp.util.webservices.WSRoutingRulePK)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsRoutingRulePK_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSGetRoutingRule instance = (com.amalto.webapp.util.webservices.WSGetRoutingRule)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.webapp.util.webservices.WSGetRoutingRule instance = (com.amalto.webapp.util.webservices.WSGetRoutingRule)obj;
        
        if (instance.getWsRoutingRulePK() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSRoutingRulePK_LiteralSerializer.serialize(instance.getWsRoutingRulePK(), ns1_wsRoutingRulePK_QNAME, null, writer, context);
    }
}
