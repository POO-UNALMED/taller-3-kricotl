package taller3.televisores;
public class TV {
	private Marca marca;
	public int canal= 1;
	private int precio= 500;
	public boolean estado;
	public int volumen= 1;
	private Control control;
	private static int numTV;
	public TV(Marca marc,boolean est){
		marca=marc;
		estado=est;
		numTV++;
	}
	public void setMarca(Marca mar) {
		marca= mar;
	}
	public static void setNumTV(int c) {
		numTV=c;
	}
	public void setControl(Control con) {
		control=con;
	}
	public void setPrecio(int prec) {
		precio=prec;
	}
	public void setVolumen(int vol) {
		volumen=vol;
	}
	public void setCanal(int can) {
		canal=can;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public static int getNumTV() {
		return numTV;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if ((this.getEstado()==true)&&this.getCanal()>=1&&this.getCanal()<120){
			this.canal++;
		}	
	}
	public void canalDown() {
		if ((this.getEstado()==true)&&this.getCanal()>1&&this.getCanal()<=120){
			this.canal--;
		}
	}
	public void volumenUp() {
		if ((this.getEstado()==true)&&this.getVolumen()>=1&&this.getVolumen()<7) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if ((this.getEstado()==true)&&this.getVolumen()>1&&this.getVolumen()<=7) {
			this.volumen--;
		}
	}
}
