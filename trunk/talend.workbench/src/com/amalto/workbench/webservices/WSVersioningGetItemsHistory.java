// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSVersioningGetItemsHistory {
    protected java.lang.String versioningSystemName;
    protected com.amalto.workbench.webservices.WSItemPK[] wsItemPKs;
    
    public WSVersioningGetItemsHistory() {
    }
    
    public WSVersioningGetItemsHistory(java.lang.String versioningSystemName, com.amalto.workbench.webservices.WSItemPK[] wsItemPKs) {
        this.versioningSystemName = versioningSystemName;
        this.wsItemPKs = wsItemPKs;
    }
    
    public java.lang.String getVersioningSystemName() {
        return versioningSystemName;
    }
    
    public void setVersioningSystemName(java.lang.String versioningSystemName) {
        this.versioningSystemName = versioningSystemName;
    }
    
    public com.amalto.workbench.webservices.WSItemPK[] getWsItemPKs() {
        return wsItemPKs;
    }
    
    public void setWsItemPKs(com.amalto.workbench.webservices.WSItemPK[] wsItemPKs) {
        this.wsItemPKs = wsItemPKs;
    }
}
