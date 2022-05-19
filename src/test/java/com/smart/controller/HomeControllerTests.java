package com.smart.controller;

import com.smart.controller.HomeController;
import com.smart.dao.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

//package com.smart.controller;
//
//import com.smart.dao.UserRepository;
//import com.smart.entities.User;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.ui.Model;
//
//import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSessionContext;
//import java.util.Collection;
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class HomeControllerTests {
    @Autowired
    HomeController homeController;
    @MockBean
    private BCryptPasswordEncoder passwordEncoder;
    @MockBean
    private UserRepository userRepository;

    @Autowired
    Model model;

    @Test
    public void homeTest(Model model) {

        model.addAttribute("title", "Home - Smart Contact Manager");
        String str = homeController.home(model);
        assertEquals("home", str);
    }

}

//    @Test
//    public void aboutTest() {
//        Model model = new Model() {
//            public Model mergeAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Object getAttribute(String attributeName) {
//                return null;
//            }
//
//            public boolean containsAttribute(String attributeName) {
//                return false;
//            }
//
//            public Map<String, Object> asMap() {
//                return null;
//            }
//
//            public Model addAttribute(String attributeName, Object attributeValue) {
//                return null;
//            }
//
//            public Model addAttribute(Object attributeValue) {
//                return null;
//            }
//
//            public Model addAllAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Model addAllAttributes(Collection<?> attributeValues) {
//                return null;
//            }
//        };
//        model.addAttribute("title", "About - Smart Contact Manager");
//        this.homeController.about(model);
//        Assert.assertTrue(true);
//    }
//
//    @Test
//    public void signUpTest() {
//        Model model = new Model() {
//            public Model mergeAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Object getAttribute(String attributeName) {
//                return null;
//            }
//
//            public boolean containsAttribute(String attributeName) {
//                return false;
//            }
//
//            public Map<String, Object> asMap() {
//                return null;
//            }
//
//            public Model addAttribute(String attributeName, Object attributeValue) {
//                return null;
//            }
//
//            public Model addAttribute(Object attributeValue) {
//                return null;
//            }
//
//            public Model addAllAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Model addAllAttributes(Collection<?> attributeValues) {
//                return null;
//            }
//        };
//        model.addAttribute("title", "Register - Smart Contact Manager");
//        model.addAttribute("user", new User());
//        this.homeController.signup(model);
//        Assert.assertTrue(true);
//    }
//
//    @Test
//    public void customeLoginTest() {
//        Model model = new Model() {
//            public Model mergeAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Object getAttribute(String attributeName) {
//                return null;
//            }
//
//            public boolean containsAttribute(String attributeName) {
//                return false;
//            }
//
//            public Map<String, Object> asMap() {
//                return null;
//            }
//
//            public Model addAttribute(String attributeName, Object attributeValue) {
//                return null;
//            }
//
//            public Model addAttribute(Object attributeValue) {
//                return null;
//            }
//
//            public Model addAllAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Model addAllAttributes(Collection<?> attributeValues) {
//                return null;
//            }
//        };
//        model.addAttribute("title", "Register - Smart Contact Manager");
//        model.addAttribute("user", new User());
//        this.homeController.customLogin(model);
//        Assert.assertTrue(true);
//    }
//
//    @Test
//    public void registerUserTest() {
//        Model model = new Model() {
//            public Model mergeAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Object getAttribute(String attributeName) {
//                return null;
//            }
//
//            public boolean containsAttribute(String attributeName) {
//                return false;
//            }
//
//            public Map<String, Object> asMap() {
//                return null;
//            }
//
//            public Model addAttribute(String attributeName, Object attributeValue) {
//                return null;
//            }
//
//            public Model addAttribute(Object attributeValue) {
//                return null;
//            }
//
//            public Model addAllAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Model addAllAttributes(Collection<?> attributeValues) {
//                return null;
//            }
//        };
//        User user = new User();
//        boolean b = true;
//        HttpSession session = new HttpSession() {
//            public void setMaxInactiveInterval(int interval) {
//            }
//
//            public void setAttribute(String name, Object value) {
//            }
//
//            public void removeValue(String name) {
//            }
//
//            public void removeAttribute(String name) {
//            }
//
//            public void putValue(String name, Object value) {
//            }
//
//            public boolean isNew() {
//                return false;
//            }
//
//            public void invalidate() {
//            }
//
//            public String[] getValueNames() {
//                return null;
//            }
//
//            public Object getValue(String name) {
//                return null;
//            }
//
//            public HttpSessionContext getSessionContext() {
//                return null;
//            }
//
//            public ServletContext getServletContext() {
//                return null;
//            }
//
//            public int getMaxInactiveInterval() {
//                return 0;
//            }
//
//            public long getLastAccessedTime() {
//                return 0L;
//            }
//
//            public String getId() {
//                return null;
//            }
//
//            public long getCreationTime() {
//                return 0L;
//            }
//
//            public Enumeration<String> getAttributeNames() {
//                return null;
//            }
//
//            public Object getAttribute(String name) {
//                return null;
//            }
//        };
//        BindingResult result1 = new BindingResult() {
//            public void setNestedPath(String nestedPath) {
//            }
//
//            public void rejectValue(String field, String errorCode, Object[] errorArgs, String defaultMessage) {
//            }
//
//            public void rejectValue(String field, String errorCode, String defaultMessage) {
//            }
//
//            public void rejectValue(String field, String errorCode) {
//            }
//
//            public void reject(String errorCode, Object[] errorArgs, String defaultMessage) {
//            }
//
//            public void reject(String errorCode, String defaultMessage) {
//            }
//
//            public void reject(String errorCode) {
//            }
//
//            public void pushNestedPath(String subPath) {
//            }
//
//            public void popNestedPath() throws IllegalStateException {
//            }
//
//            public boolean hasGlobalErrors() {
//                return false;
//            }
//
//            public boolean hasFieldErrors(String field) {
//                return false;
//            }
//
//            public boolean hasFieldErrors() {
//                return false;
//            }
//
//            public boolean hasErrors() {
//                return false;
//            }
//
//            public String getObjectName() {
//                return null;
//            }
//
//            public String getNestedPath() {
//                return null;
//            }
//
//            public List<ObjectError> getGlobalErrors() {
//                return null;
//            }
//
//            public int getGlobalErrorCount() {
//                return 0;
//            }
//
//            public ObjectError getGlobalError() {
//                return null;
//            }
//
//            public Object getFieldValue(String field) {
//                return null;
//            }
//
//            public Class<?> getFieldType(String field) {
//                return null;
//            }
//
//            public List<FieldError> getFieldErrors(String field) {
//                return null;
//            }
//
//            public List<FieldError> getFieldErrors() {
//                return null;
//            }
//
//            public int getFieldErrorCount(String field) {
//                return 0;
//            }
//
//            public int getFieldErrorCount() {
//                return 0;
//            }
//
//            public FieldError getFieldError(String field) {
//                return null;
//            }
//
//            public FieldError getFieldError() {
//                return null;
//            }
//
//            public int getErrorCount() {
//                return 0;
//            }
//
//            public List<ObjectError> getAllErrors() {
//                return null;
//            }
//
//            public void addAllErrors(Errors errors) {
//            }
//
//            public String[] resolveMessageCodes(String errorCode, String field) {
//                return null;
//            }
//
//            public String[] resolveMessageCodes(String errorCode) {
//                return null;
//            }
//
//            public Object getTarget() {
//                return null;
//            }
//
//            public Object getRawFieldValue(String field) {
//                return null;
//            }
//
//            public PropertyEditorRegistry getPropertyEditorRegistry() {
//                return null;
//            }
//
//            public Map<String, Object> getModel() {
//                return null;
//            }
//
//            public PropertyEditor findEditor(String field, Class<?> valueType) {
//                return null;
//            }
//
//            public void addError(ObjectError error) {
//            }
//        };
//        this.homeController.registerUser(user, result1, b, model, session);
//        Assert.assertTrue(true);
//    }
//
//    @Test
//    public void registerUserNotTest() {
//        Model model = new Model() {
//            public Model mergeAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Object getAttribute(String attributeName) {
//                return null;
//            }
//
//            public boolean containsAttribute(String attributeName) {
//                return false;
//            }
//
//            public Map<String, Object> asMap() {
//                return null;
//            }
//
//            public Model addAttribute(String attributeName, Object attributeValue) {
//                return null;
//            }
//
//            public Model addAttribute(Object attributeValue) {
//                return null;
//            }
//
//            public Model addAllAttributes(Map<String, ?> attributes) {
//                return null;
//            }
//
//            public Model addAllAttributes(Collection<?> attributeValues) {
//                return null;
//            }
//        };
//        User user = new User();
//        boolean b = false;
//        HttpSession session = new HttpSession() {
//            public void setMaxInactiveInterval(int interval) {
//            }
//
//            public void setAttribute(String name, Object value) {
//            }
//
//            public void removeValue(String name) {
//            }
//
//            public void removeAttribute(String name) {
//            }
//
//            public void putValue(String name, Object value) {
//            }
//
//            public boolean isNew() {
//                return false;
//            }
//
//            public void invalidate() {
//            }
//
//            public String[] getValueNames() {
//                return null;
//            }
//
//            public Object getValue(String name) {
//                return null;
//            }
//
//            public HttpSessionContext getSessionContext() {
//                return null;
//            }
//
//            public ServletContext getServletContext() {
//                return null;
//            }
//
//            public int getMaxInactiveInterval() {
//                return 0;
//            }
//
//            public long getLastAccessedTime() {
//                return 0L;
//            }
//
//            public String getId() {
//                return null;
//            }
//
//            public long getCreationTime() {
//                return 0L;
//            }
//
//            public Enumeration<String> getAttributeNames() {
//                return null;
//            }
//
//            public Object getAttribute(String name) {
//                return null;
//            }
//        };
//        BindingResult result1 = new BindingResult() {
//            public void setNestedPath(String nestedPath) {
//            }
//
//            public void rejectValue(String field, String errorCode, Object[] errorArgs, String defaultMessage) {
//            }
//
//            public void rejectValue(String field, String errorCode, String defaultMessage) {
//            }
//
//            public void rejectValue(String field, String errorCode) {
//            }
//
//            public void reject(String errorCode, Object[] errorArgs, String defaultMessage) {
//            }
//
//            public void reject(String errorCode, String defaultMessage) {
//            }
//
//            public void reject(String errorCode) {
//            }
//
//            public void pushNestedPath(String subPath) {
//            }
//
//            public void popNestedPath() throws IllegalStateException {
//            }
//
//            public boolean hasGlobalErrors() {
//                return false;
//            }
//
//            public boolean hasFieldErrors(String field) {
//                return false;
//            }
//
//            public boolean hasFieldErrors() {
//                return false;
//            }
//
//            public boolean hasErrors() {
//                return false;
//            }
//
//            public String getObjectName() {
//                return null;
//            }
//
//            public String getNestedPath() {
//                return null;
//            }
//
//            public List<ObjectError> getGlobalErrors() {
//                return null;
//            }
//
//            public int getGlobalErrorCount() {
//                return 0;
//            }
//
//            public ObjectError getGlobalError() {
//                return null;
//            }
//
//            public Object getFieldValue(String field) {
//                return null;
//            }
//
//            public Class<?> getFieldType(String field) {
//                return null;
//            }
//
//            public List<FieldError> getFieldErrors(String field) {
//                return null;
//            }
//
//            public List<FieldError> getFieldErrors() {
//                return null;
//            }
//
//            public int getFieldErrorCount(String field) {
//                return 0;
//            }
//
//            public int getFieldErrorCount() {
//                return 0;
//            }
//
//            public FieldError getFieldError(String field) {
//                return null;
//            }
//
//            public FieldError getFieldError() {
//                return null;
//            }
//
//            public int getErrorCount() {
//                return 0;
//            }
//
//            public List<ObjectError> getAllErrors() {
//                return null;
//            }
//
//            public void addAllErrors(Errors errors) {
//            }
//
//            public String[] resolveMessageCodes(String errorCode, String field) {
//                return null;
//            }
//
//            public String[] resolveMessageCodes(String errorCode) {
//                return null;
//            }
//
//            public Object getTarget() {
//                return null;
//            }
//
//            public Object getRawFieldValue(String field) {
//                return null;
//            }
//
//            public PropertyEditorRegistry getPropertyEditorRegistry() {
//                return null;
//            }
//
//            public Map<String, Object> getModel() {
//                return null;
//            }
//
//            public PropertyEditor findEditor(String field, Class<?> valueType) {
//                return null;
//            }
//
//            public void addError(ObjectError error) {
//            }
//        };
//        this.homeController.registerUser(user, result1, b, model, session);
//        Assert.assertTrue(true);
//    }
//}
