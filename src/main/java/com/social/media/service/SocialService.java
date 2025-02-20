package com.social.media.service;

import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {
    @Autowired
    SocialUserRepository socialUserRepository;
    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }


    public SocialUser saveUsers(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

    public SocialUser deleteUser(Long id) {
        SocialUser socialUser = socialUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        socialUserRepository.delete(socialUser);
        return socialUser;
    }
}
