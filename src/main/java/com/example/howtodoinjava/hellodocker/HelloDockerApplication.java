package com.example.howtodoinjava.hellodocker;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDockerApplication.class, args);
	}
}

@RestController
class HelloDockerRestController {
	@GetMapping("/hello/{name}")
	public String helloDocker(@PathVariable(value = "name") String name) {
		String response = "Hello " + name + " Response received on : " + new Date();
		System.out.println(response);
		return response;
	}
}

//FROM openjdk:8-jdk-alpine
//VOLUME /tmp
//ADD target/hello-docker-0.0.1-SNAPSHOT.jar hello-docker-app.jar
//ENV JAVA_OPTS=""
//ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /hello-docker-app.jar" ]


//FROM openjdk:8-jdk-alpine
//
//COPY hello-docker-0.0.1-SNAPSHOT.jar /hello-docker-app.jar
//
//CMD["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/hello-docker-app.jar"]

//FROM java:8
//VOLUME /tmp
//ADD hello-docker-0.0.1-SNAPSHOT.jar hello-docker-app.jar
//RUN bash -c 'touch /hello-docker-app.jar'
//ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hello-docker-app.jar"]

//FROM java:8
//ADD target/hello-docker-0.0.1-SNAPSHOT.jar hello-docker-0.0.1-SNAPSHOT.jar
//EXPOSE 8085
//ENTRYPOINT ["java","-jar","hello-docker-0.0.1-SNAPSHOT.jar"]

