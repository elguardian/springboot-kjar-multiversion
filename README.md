# springboot-kjar-multiversion

This is a example project to use as an example of immutable spring boot jar (better said self contained kie server spring boot application).
In order to make it work you need 

Compile all projects: 
business-application-model-v1/
business-application-model-v2/
business-application-kjar-v1/
business-application-kjar-v2/
business-application-service/

with the next command:

mvn clean install -DskipTests

execute in the base directory

java -jar business-application-service/target/business-application-service-1.0-SNAPSHOT.jar

POST to
http://localhost:8090/rest/server/containers/Evaluation-2.0.0-SNAPSHOT/processes/Evaluation.Evaluation/instances
http://localhost:8090/rest/server/containers/Evaluation-1.0.0-SNAPSHOT/processes/Evaluation.Evaluation/instances

{
  "employeeEvaluation": {
    "com.company.model.EmployeeEvaluation": {
      "employee": "egonzalez"
    }
  }
}

Differnt model transient dependencies must show in the log
