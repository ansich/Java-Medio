
public class ArbolVacioExcepcion extends RuntimeException{
	public ArbolVacioExcepcion( String msg ){
		super(msg);
	}
	
	public ArbolVacioExcepcion(){
		super();
	}
}
