package com.airhacks.ping.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    @ConfigProperty(name = "message")
    String message;

    @Path("pong")
    @GET
    public String pongMethod() {
        return this.message + " Jakarta EE with MicroProfile";
    }

    @GET
    @Path("pang")
    public Student pong() {
        Student s=  new Student("Teo",88).addLesson(new Lesson("Maths",new Grade(3.67,new Teacher("Makis", "Assistant professor"))));
        s.addLesson(new Lesson("Java",new Grade(7.98,new Teacher("Takis", "Associate Professor "))));
        return s;
    }
}
