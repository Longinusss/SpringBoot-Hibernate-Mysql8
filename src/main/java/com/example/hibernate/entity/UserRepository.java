package com.example.hibernate.entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * <p></p>
 *
 * @author : lon
 * @date : 2021-06-22 15:59
 **/
@Repository
public interface UserRepository extends CrudRepository<User,Integer>
{

        @Query(value = "SELECT u FROM User u WHERE h_name=:name")
    public User findNameHql(@Param("name") String name);

}