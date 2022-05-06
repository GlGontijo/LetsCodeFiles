package com.letscode.usuarios.springmysql.model.client;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="usuario")
public class UserModel {
    private Long id;
    private String primeiroNome;
    private String sobrenome;
    private Date dataCadastro;
}
