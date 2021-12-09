package com.car_rental.car_rental_java_client.security.details;

import com.car_rental.car_rental_java_client.entities.Client;
import com.car_rental.car_rental_java_client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component(value = "customClientDetailsService")
public class ClientDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Client client = clientRepository.findByLogin(login);

        if (client != null)
        {
            return new ClientDetailsImpl(client);
        }
        else throw new UsernameNotFoundException("Client Not Found");
    }
}
