package taller3.televisores;
public class Control {
	public TV tv;
	public void setTv(TV n) {
		tv=n;
	}
	public TV getTv() {
		return tv;
	}
	public void enlazar(TV t) {
		setTv(t);
		t.setControl(this);
	}
	public void turnOn() {
		tv.estado=true;
	}
	public void turnOff() {
		tv.estado=false;
	}
	public void canalUp() {
		if ((tv.getEstado()==true)&&tv.getCanal()>=1&&tv.getCanal()<120){
			tv.canal++;
		}	
	}
	public void canalDown() {
		if ((tv.getEstado()==true)&&tv.getCanal()>1&&tv.getCanal()<=120){
			tv.canal--;
		}
	}
	public void volumenUp() {
		if ((tv.getEstado()==true)&&tv.getVolumen()>=1&&tv.getVolumen()<7) {
			tv.volumen++;
		}
	}
	public void volumenDown() {
		if ((tv.getEstado()==true)&&tv.getVolumen()>1&&tv.getVolumen()<=7) {
			tv.volumen--;
		}
	}
	public void setCanal(int c) {
		tv.setCanal(c);
	}
}