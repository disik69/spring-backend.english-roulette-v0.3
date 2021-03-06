package ua.pp.disik.englishroulette.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.pp.disik.englishroulette.backend.entities.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
