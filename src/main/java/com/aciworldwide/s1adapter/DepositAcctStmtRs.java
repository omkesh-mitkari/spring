
package com.aciworldwide.s1adapter;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-11T16:59:50.252+05:30
 * Generated source version: 3.2.4
 */

@WebFault(name = "response", targetNamespace = "http://aciworldwide.com/S1Adapter")
public class DepositAcctStmtRs extends Exception {

    private com.aciworldwide.s1adapter.DepAcctStmtInqOutType response;

    public DepositAcctStmtRs() {
        super();
    }

    public DepositAcctStmtRs(String message) {
        super(message);
    }

    public DepositAcctStmtRs(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DepositAcctStmtRs(String message, com.aciworldwide.s1adapter.DepAcctStmtInqOutType response) {
        super(message);
        this.response = response;
    }

    public DepositAcctStmtRs(String message, com.aciworldwide.s1adapter.DepAcctStmtInqOutType response, java.lang.Throwable cause) {
        super(message, cause);
        this.response = response;
    }

    public com.aciworldwide.s1adapter.DepAcctStmtInqOutType getFaultInfo() {
        return this.response;
    }
}
