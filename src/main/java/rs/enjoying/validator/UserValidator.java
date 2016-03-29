package rs.enjoying.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation;

import rs.enjoying.data.UserData;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class clazz) {
      return UserData.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
      UserData user = (UserData) target;
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "user.error.username");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "user.error.firstName");
      
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "user.error.lastName");
      
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "user.error.email");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "user.error.password");
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cpassword", "user.error.cpassword");
      if(user.getCpassword().compareTo(user.getPassword())!=0)
      {
    	  errors.rejectValue("cpassword", "user.error.Password");
      }
      
      
    }
}
