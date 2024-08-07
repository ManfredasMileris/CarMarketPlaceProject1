package com.ironhack.carmarketplaceproject1.service.impl;

import com.ironhack.carmarketplaceproject1.service.RoleService;
import com.ironhack.carmarketplaceproject1.model.Role;
import com.ironhack.carmarketplaceproject1.model.User;
import com.ironhack.carmarketplaceproject1.repository.RoleRepository;
import com.ironhack.carmarketplaceproject1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {


    private final UserRepository userRepository;


    private final RoleRepository roleRepository;

    /**
     * Saves a new role to the database
     *
     * @param role the role to be saved
     * @return the saved role
     */
    @Override
    public Role save(Role role) {
        if (roleRepository.findByName(role.getName()) == null) {
            log.info("Saving new role {} to the database", role.getName());
            return roleRepository.save(role);

        }
        return roleRepository.findByName(role.getName());
    }


    /**
     * Adds a role to the user with the given username
     *
     * @param username the username of the user to add the role to
     * @param roleName the name of the role to be added
     */
    @Override
    public void addRoleToUser(String username, String roleName) {

        log.info("Adding role {} to user {}", roleName, username);

        // Retrieve the user and role objects from the repository
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        if(!user.getRoles().contains(role)) {

            // Add the role to the user's role collection
            user.getRoles().add(role);

            // Save the user to persist the changes
            userRepository.save(user);
        }
    }
}
