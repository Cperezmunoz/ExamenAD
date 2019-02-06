package es.fesac.noticias.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.User;


public interface IUserRepository  extends CrudRepository<User, Long> {

	@Query(value = "SELECT * FROM user WHERE EMAIL = :email AND PASSWORD = MD5(:password)",nativeQuery = true)
	public User getByEmailAndPassword(String email, String password);
}
