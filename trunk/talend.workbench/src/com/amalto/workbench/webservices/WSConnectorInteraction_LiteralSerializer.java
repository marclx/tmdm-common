// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

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

public class WSConnectorInteraction_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_JNDIName_QNAME = new QName("", "JNDIName");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_function_QNAME = new QName("", "function");
    private static final QName ns2_WSConnectorFunction_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSConnectorFunction");
    private CombinedSerializer ns2myns2_WSConnectorFunction__WSConnectorFunction_LiteralSerializer;
    private static final QName ns1_parameters_QNAME = new QName("", "parameters");
    private static final QName ns2_WSBase64KeyValue_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSBase64KeyValue");
    private CombinedSerializer ns2_myWSBase64KeyValue_LiteralSerializer;
    
    public WSConnectorInteraction_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSConnectorInteraction_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2myns2_WSConnectorFunction__WSConnectorFunction_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSConnectorFunction.class, ns2_WSConnectorFunction_TYPE_QNAME);
        ns2_myWSBase64KeyValue_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSBase64KeyValue.class, ns2_WSBase64KeyValue_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSConnectorInteraction instance = new com.amalto.workbench.webservices.WSConnectorInteraction();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_JNDIName_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_JNDIName_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setJNDIName((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_JNDIName_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_function_QNAME)) {
                member = ns2myns2_WSConnectorFunction__WSConnectorFunction_LiteralSerializer.deserialize(ns1_function_QNAME, reader, context);
                instance.setFunction((com.amalto.workbench.webservices.WSConnectorFunction)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_function_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_parameters_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_parameters_QNAME))) {
                    value = ns2_myWSBase64KeyValue_LiteralSerializer.deserialize(ns1_parameters_QNAME, reader, context);
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.amalto.workbench.webservices.WSBase64KeyValue[values.size()];
            member = values.toArray((Object[]) member);
            instance.setParameters((com.amalto.workbench.webservices.WSBase64KeyValue[])member);
        }
        else {
            instance.setParameters(new com.amalto.workbench.webservices.WSBase64KeyValue[0]);
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSConnectorInteraction instance = (com.amalto.workbench.webservices.WSConnectorInteraction)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSConnectorInteraction instance = (com.amalto.workbench.webservices.WSConnectorInteraction)obj;
        
        if (instance.getJNDIName() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getJNDIName(), ns1_JNDIName_QNAME, null, writer, context);
        ns2myns2_WSConnectorFunction__WSConnectorFunction_LiteralSerializer.serialize(instance.getFunction(), ns1_function_QNAME, null, writer, context);
        if (instance.getParameters() != null) {
            for (int i = 0; i < instance.getParameters().length; ++i) {
                ns2_myWSBase64KeyValue_LiteralSerializer.serialize(instance.getParameters()[i], ns1_parameters_QNAME, null, writer, context);
            }
        }
    }
}
