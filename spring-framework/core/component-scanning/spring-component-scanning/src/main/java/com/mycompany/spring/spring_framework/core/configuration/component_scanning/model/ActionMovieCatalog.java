/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.component_scanning.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author colin
 *
 */
@Component
@Qualifier("Action")
public class ActionMovieCatalog implements MovieCatalog {

}
