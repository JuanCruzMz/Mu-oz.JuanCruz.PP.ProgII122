
package aventureros;

import java.util.List;
import java.util.ArrayList;

public class GremioAventureros
{
    private String nombreDelGremio;
    private List<Aventurero> listaDeAventureros;

    
    public GremioAventureros(String nombreDelGremio)
    {
        this.nombreDelGremio = nombreDelGremio;
        this.listaDeAventureros = new ArrayList<>();
    }
    
    
    /**
     * Agrega un aventurero al gremio.
     * Si ya existe uno igual (mismo código y nombre), lanza excepción.
     */
    public void agregarAventurero(Aventurero aventurero)
    {
        if (this.listaDeAventureros.contains(aventurero))
        {
            throw new AventureroDuplicadoException("Ya existe un aventurero registrado con los mismos datos: " 
                    + aventurero.getNombre() + " [" + aventurero.getCodigo() + "]");
        }
        
        this.listaDeAventureros.add(aventurero);
    }
    
    /**
     * Devuelve todos los aventureros registrados.
     */
    public List<Aventurero> obtenerAventureros()
    {
        return this.listaDeAventureros;
    }
    
    /**
     * Devuelve únicamente los aventureros del rango especificado.
     */
    public List<Aventurero> filtrarPorRango(Rango rango)
    {
        List<Aventurero> filtrados = new ArrayList<>();
        
        for (Aventurero a : this.listaDeAventureros)
        {
            if (a.getRango() == rango)
            {
                filtrados.add(a);
            }
        }
        
        return filtrados;
    }
    
    /**
     * Devuelve los aventureros cuyo poder sea mayor o igual al recibido.
     */
    public List<Aventurero> obtenerAventurerosPoderosos(int poderMinimo)
    {
        List<Aventurero> poderosos = new ArrayList<>();
        
        for (Aventurero a : this.listaDeAventureros)
        {
            if (a.calcularPoderDeCombate() >= poderMinimo)
            {
                poderosos.add(a);
            }
        }
        
        return poderosos;
    }
}
