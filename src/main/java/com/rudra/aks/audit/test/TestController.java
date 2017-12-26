package com.rudra.aks.audit.test;

import java.util.Date;
import java.util.UUID;

import org.audit4j.core.dto.AuditEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rudra.aks.audit.handler.DemoAuditor;

@RestController
@RequestMapping("/")
public class TestController {

	DemoAuditor auditor = new DemoAuditor();
	
	@GetMapping("/test/{id}/{uname}")
	public String test(@PathVariable("id")int id, @PathVariable("uname")String username) {
		
		try {
			AuditEvent event = new AuditEvent();
			
			UUID uuid = UUID.randomUUID();
			event.setUuid(uuid.getMostSignificantBits());
			
			event.setAuditId(id);
			event.setActor(username);
			event.setAction("test method");
			event.setTimestamp(new Date());
			auditor.auditEvents(event);
			
			return "auditing done";
		} catch (Exception e) {
			System.out.println("auditing failed due to : " + e);
			return "failed";
		}
	}
}
