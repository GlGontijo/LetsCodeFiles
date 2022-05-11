
package com.letscode.usuarios.springmysql.resource;

import com.letscode.usuarios.springmysql.model.client.User;
import com.letscode.usuarios.springmysql.model.client.UserRequest;
import com.letscode.usuarios.springmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Component
public class UserResource {
    @Autowired
    UserService userService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User save(final UserRequest userRequest) {
        return userService.save(userRequest);
    }
}