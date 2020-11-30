
package T7;


import java.io.Serializable;


public class PHONE implements Serializable {

  
    private static final long serialVersionUID = 1L;
    private final String name;
    private final int diagonal;
    public PHONE(int diagonal, String name) {
        this.name = name;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "PHONE{" + "diagonal=" + diagonal + ", name=" + name + '}';
    }

}

