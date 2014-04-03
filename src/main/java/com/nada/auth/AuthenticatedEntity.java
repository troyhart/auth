/* Copyright (C) 2014 Troy Hart. */
package com.nada.auth;

/**
 * @author thart
 *
 */
public interface AuthenticatedEntity
{
  String getUserPrincipalName();
  boolean isUserInRole(String role);
}
