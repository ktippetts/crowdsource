package com.darkcanyon.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.darkcanyon.dto.Account;


@Path( "/v1/account" )
public class AccountService 
{
	@POST
	@Consumes({APPLICATION_JSON})
	@Produces({APPLICATION_JSON})
	public Response createAccount(Account account)
	{
		return Response.created(URI.create("uri")).build();
	}
	
	@POST
	@Path("/find/{username}")
	@Consumes({APPLICATION_JSON})
	@Produces({APPLICATION_JSON})
	public Response findAccount(String username, Account account)
	{
		return Response.ok().build();
	}
}
