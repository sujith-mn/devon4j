package com.devonfw.module.security.csrf.service.api.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.springframework.security.web.csrf.CsrfToken;

import com.devonfw.module.rest.common.api.RestService;

/**
 * The CSRF REST service provides access to get the CSRF token used to protect against <a href="https://owasp.org/www-community/attacks/csrf">CSRF attacks</a>
 */
@Path("/security/v1")
public interface CsrfRestService extends RestService {

  /**
   * @param request {@link HttpServletRequest} to retrieve the current session from.
   * @param response {@link HttpServletResponse} to send additional information.
   * @return the Spring Security {@link CsrfToken} from the server session.
   */
  @GET
  @Path("/csrftoken/")
  CsrfToken getCsrfToken(@Context HttpServletRequest request, @Context HttpServletResponse response);

}
