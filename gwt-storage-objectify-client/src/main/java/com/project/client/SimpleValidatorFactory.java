package com.project.client;

import javax.validation.Validator;

import com.google.gwt.core.client.GWT;
import com.project.shared.entities.User;
import de.knightsoftnet.validators.client.AbstractGwtValidatorFactory;
import de.knightsoftnet.validators.client.GwtValidation;
import de.knightsoftnet.validators.client.impl.AbstractGwtValidator;

public final class SimpleValidatorFactory extends AbstractGwtValidatorFactory {

  @GwtValidation(User.class)
  public interface GwtValidator extends Validator {
  }

  @Override
  public AbstractGwtValidator createValidator() {
    return GWT.create(GwtValidator.class);
  }
}