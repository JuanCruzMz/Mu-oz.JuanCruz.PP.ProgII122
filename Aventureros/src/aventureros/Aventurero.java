package aventureros;

import java.util.Objects;


public abstract class Aventurero
{
    private String codigo;
    private String nombre;
    private Rango rango;

    
    public Aventurero(String codigo, String nombre, Rango rango)
    {
        if (codigo == null || codigo.isBlank())
        {
            throw new IllegalArgumentException("El código no puede ser nulo ni estar en blanco.");
        }
        else
        {
            this.codigo = codigo;
        }
        
        if (nombre == null || nombre.isBlank())
        {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni estar en blanco.");
        }
        else
        {
            this.nombre = nombre;
        }
        
        if (rango == null)
        {
            throw new IllegalArgumentException("El rango es obligatorio.");
        }
        else
        {
            this.rango = rango;
        }
    }

    
    public String getCodigo()
    {
        return codigo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public Rango getRango()
    {
        return rango;
    }
    
    
    public abstract void atacar();
    public abstract int calcularPoderDeCombate();

    
    @Override
    public int hashCode()
    {
        int hash = 3;
        
        hash = 23 * hash + Objects.hashCode(this.codigo);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof Aventurero))
        {
            return false;
        }
        
        final Aventurero other = (Aventurero) obj;
        
        
        if (!Objects.equals(this.codigo, other.codigo))
        {
            return false;
        }
        
        return Objects.equals(this.nombre, other.nombre);
    }
}
