package vn.hoidanit.laptopshop.repository;

import vn.hoidanit.laptopshop.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    List<User> findByEmailAndAddress(String email, String address);

    List<User> findByEmail(String email);

}
