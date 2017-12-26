package com.rudra.aks.audit.handler;

import org.audit4j.core.AuditManager;
import org.audit4j.core.dto.AuditEvent;

public class DemoAuditor {

	AuditManager manager;
	
	public DemoAuditor() {
		manager = AuditManager.getInstance();
	}
	
	public void auditEvents(AuditEvent event) {
		manager.audit(event);
		
	}
}
