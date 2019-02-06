package es.fesac.noticias.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.mapping.List;

@Entity
public class Mensaje {

		private String contenido;
		@ManyToOne
	    User usuario = new User();
		/*
		@OneToOne
	    List<Comentario> comentarios = new List<Comentario>();
				*/
		
		public Mensaje() {
			super();
		}
		
		
		public Mensaje(String contenido, User usuario) {
			super();
			this.contenido = contenido;
			this.usuario = usuario;
		}


		public String getContenido() {
			return contenido;
		}
		public void setContenido(String contenido) {
			this.contenido = contenido;
		}
		public User getUsuario() {
			return usuario;
		}
		public void setUsuario(User usuario) {
			this.usuario = usuario;
		}
	    			
}
