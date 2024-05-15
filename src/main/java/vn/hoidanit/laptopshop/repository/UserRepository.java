package vn.hoidanit.laptopshop.repository;

import vn.hoidanit.laptopshop.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    void deleteById(long id);

    List<User> findByEmail(String email);

    User findById(long id);

    List<User> findAll();
}
