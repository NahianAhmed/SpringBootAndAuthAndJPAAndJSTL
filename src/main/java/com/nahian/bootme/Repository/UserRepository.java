package com.nahian.bootme.Repository;

        import com.nahian.bootme.Model.User;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
