package br.org.serratec.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.biblioteca.entities.Perfil;
import br.org.serratec.biblioteca.repositories.PerfilRepository;

@Service
public class PerfilService {
	
	@Autowired
	PerfilRepository perfilRepository;
	
	public List<Perfil> findAll() {
		return perfilRepository.findAll();
	}
	
	public Perfil findById(Integer id) {
		return perfilRepository.findById(id).orElse(null);
	}
	
	public Perfil save(Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	public Perfil update(Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	/*public void delete(Perfil perfil) {
		perfilRepository.delete(perfil);
	}*/
	
	/*public boolean delete(Perfil perfil) {
	    try {
	        perfilRepository.delete(perfil);
	        return true; 
	    } catch (Exception e) {
	        return false; 
	    }
	}*/
	
	public boolean deleteById2(Integer id) {
        if (perfilRepository.existsById(id)) {
            perfilRepository.deleteById(id);
            Perfil perfilDeletado = perfilRepository.findById(id).orElse(null);
            if(perfilDeletado == null) {
            	return true;
            } else {
            	return false;
            }
        } else {
            return false;
        }
    }
	
	//Não é CRUD, mas é interessante (serve p/ saber quantas páginas vai ter de resultado)
	public long count() {
		return perfilRepository.count();
	}
	
	
}
