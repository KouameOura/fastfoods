package com.fastfood.fastfood.repository;

import com.fastfood.fastfood.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT user.emailId from User user")
    public List<String> getEmailIdList();

    @Query("SELECT user.mobileNumber from User user")
    public List<String> getMobileNumberList();

    public User findByEmailId(String emailId);



//    public Employee getEmployeeByEmail(String empEmail) {
//        Query query = sessionFactory.getCurrentSession().createQuery("from Employee where email = :email");
//        query.setParameter("email", empEmail);
//        return (Employee) query.list().get(0);
//
//        @Query("SELECT user.mobileNumber from User user")
//        public List<String> getUserByEmail();

}
