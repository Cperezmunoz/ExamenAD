package es.fesac.noticias.dao;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.Mensaje;

public interface IPostRepository extends CrudRepository<Mensaje, Integer> {

}
