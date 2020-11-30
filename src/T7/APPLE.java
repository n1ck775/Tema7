
package T7;

public class APPLE extends PHONE {

    private static final long serialVersionUID = 1L;
    private PHONE typeOfPHONE;

    public APPLE(int diagonal, String name) {
        super(diagonal, name);
        this.typeOfPHONE = null;

    }

  public void settypeOfTV(PHONE typeOfPHONE ) {
        this.typeOfPHONE = typeOfPHONE;
    }

    @Override
    public String toString() {
        return super.toString()+"PHONE{" + "typeOfPHONE=" + typeOfPHONE + '}';
    }

  

}
