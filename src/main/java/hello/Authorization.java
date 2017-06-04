package hello;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.thymeleaf.extras.springsecurity4.auth.AuthUtils;

import org.thymeleaf.util.Validate;


public final class Authorization {


//    private final IExpressionContext context;
    private final Authentication authentication;
    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private final ServletContext servletContext;
    
    


    public Authorization(
//            final IExpressionContext context,
            final Authentication authentication, 
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext) {
        
        super();

//        this.context = context;
        this.authentication = authentication;
        this.request = request;
        this.response = response;
        this.servletContext = servletContext;
        
    }


//    public IExpressionContext getContext() {
//        return this.context;
//    }

    public Authentication getAuthentication() {
        return this.authentication;
    }


    public HttpServletRequest getRequest() {
        return this.request;
    }


    public HttpServletResponse getResponse() {
        return this.response;
    }


    public ServletContext getServletContext() {
        return this.servletContext;
    }



    // Synonym method
//    public boolean expr(final String expression) {
//        return expression(expression);
//    }


//    public boolean expression(final String expression) {
//        Validate.notEmpty(expression, "Access expression cannot be null");
//        return AuthUtils.authorizeUsingAccessExpression(
//                this.context, expression, this.authentication, this.request, this.response, this.servletContext);
//        
//    }
    

    
    
    public boolean url(final String url) {
        return url("GET", url);
    }

    public boolean adm() {
    	return true;
    }
    
    public boolean url(final String method, final String url) {
        Validate.notEmpty(url, "URL cannot be null");
        return AuthUtils.authorizeUsingUrlCheck(
                url, method, this.authentication, this.request, this.servletContext);
        
    }

    
}