package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setCanal(100);
		tv1.canalDown();
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.setCanal(50);
		control.turnOn();
		control.canalUp();
		
		TV tv3 =  new TV(marca, false);
		tv2.setCanal(121);
		
		boolean ok = false;
		
		if(tv1.getCanal() == 99 && tv2.getCanal() == 2 && tv3.getCanal() == 1) {
			ok = true;
		}
	    System.out.println(ok);
	     System.out.println(tv1.getCanal());
	     System.out.println(tv2.getCanal());
	     System.out.println(tv3.getCanal());
	}
}
