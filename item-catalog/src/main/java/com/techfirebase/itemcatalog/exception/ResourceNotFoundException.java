package com.techfirebase.itemcatalog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * This exception will be thrown whenever resource is not found.
 *
 * <p>This will tell Spring boot to respond with the specified HTTP status code whenever this
 * exception is thrown from our controller.
 *
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-24 19:00:33)
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  private final String resourceName;
  private final String fieldName;
  private final Object fieldValue;

  public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
    super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    this.resourceName = resourceName;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }

  public String getResourceName() {
    return resourceName;
  }

  public String getFieldName() {
    return fieldName;
  }

  public Object getFieldValue() {
    return fieldValue;
  }
}
