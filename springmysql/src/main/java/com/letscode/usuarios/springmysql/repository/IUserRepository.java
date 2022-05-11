

package com.letscode.usuarios.springmysql.repository;

import com.letscode.usuarios.springmysql.model.db.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Long> {

}