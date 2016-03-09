/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbasics;

import webConfig.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Zeeshan
 */
public class springController extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        /*Used for Context load Files....
        such as database (loads middle teir and database tier)*/
       return new Class<?>[] { RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        /*Used for DispatcherServlet
        such as beans (load controllers, views and handler mappings.*/
        return new Class<?>[] { WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        /*Declared as default dispatcher or controller*/
        return new String[] { "/" };
    }
    
}
