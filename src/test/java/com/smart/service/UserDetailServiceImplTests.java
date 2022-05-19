//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.smart.service;

import com.smart.dao.UserRepository;
import com.smart.entities.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDetailServiceImplTests {
    @Autowired
    UserDetailsService userDetailService;
    @MockBean
    private UserRepository userRepository;

    public UserDetailServiceImplTests() {
    }

    @Test
    public void loadUserByUsernameTest() {
        User user = new User();
        user.setName("sam");
        user.setEmail("sam@123");
        Mockito.when(this.userRepository.getUserByUserName("sam")).thenReturn(user);
        UserDetails customUserDetails = this.userDetailService.loadUserByUsername("sam");
        Assert.assertNotNull(customUserDetails);
    }

    @Test
    public void loadUserByUsernameNullTest() {
        User user = new User();
        user.setName("sam");
        user.setEmail("sam");
        Mockito.when(this.userRepository.getUserByUserName("val")).thenReturn(user);
        this.userDetailService.loadUserByUsername("sam");
        Assert.assertTrue(true);
    }
}
