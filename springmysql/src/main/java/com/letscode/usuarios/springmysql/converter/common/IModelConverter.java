
package com.letscode.usuarios.springmysql.converter.common;

public interface IModelConverter<Q, M, S> {
    M requestToModel(Q request);

    S modelToResponse(M model);
}

