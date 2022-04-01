package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.LineaDetalle;
import modelo.Producto;
import modelo.Venta;

class VentaTest {

	@Test
	void test() {
		Producto p1 = new Producto ("aaa","AAA",100);
		Producto p2 = new Producto("bbb","BBB", 200);
		
		LineaDetalle id1 = new LineaDetalle(1,p1);
		LineaDetalle id2 = new LineaDetalle(2,p2);
		
		Venta venta = new Venta();
		venta.agregarLineaDetalle(id1);
		
		
		assertEquals(100, venta.calcularTotal());
		
		venta.agregarLineaDetalle(id2);
		
		assertEquals(500, venta.calcularTotal());
		
		
	}

}
