#To Run this application:
1. Run the gradle task : 	clean appStart  [ press ctrl + alt + shift + R ]
2. Hit rest call as    : 	http://localhost:8087/auditspringmvc/test/{uid}/{username}
    replace uid & username with proper values
    
    #Observe the logs in root folder of project for audit
3. Stop the application with 'appStop' gradle task. 

#for reference 
   https://www.programcreek.com/java-api-examples/index.php?api=org.audit4j.core.AuditManager
   http://audit4j.org/documentation/
   
--> This example contains default behavior for appenders & layout for simplicity.
--> Next will cover more detailed configuration with custom logging and layout.