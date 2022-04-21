import java.util.*;
public class Almacen {
  private List<User> listado;     
  public Almacen() {
     listado = new ArrayList<User>();      
  }
  public String getUserPass(String name){
    for(var i: listado){
      if( i.getName().equals(name))
         return i.getPass();
    }
    return null;
  }
  public boolean addUser(User user){
    return listado.add(user);  
  }
} 
