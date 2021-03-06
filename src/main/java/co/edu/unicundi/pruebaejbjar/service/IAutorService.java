/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service;
import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.exception.BussinessException;
import co.edu.unicundi.pruebaejbjar.exception.ResourceNotFoundException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ASUS
 */
@Local
public interface IAutorService {
    
    public List<Autor> listar();
    
    public Autor listarPorId(Integer id) throws ResourceNotFoundException;
    
    public void guardar(Autor obj);
    
    public void editar(Autor obj) throws BussinessException, ResourceNotFoundException;
    
    public void eliminar(Integer id)  throws ResourceNotFoundException;    
    
}
