package RepositoryDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
