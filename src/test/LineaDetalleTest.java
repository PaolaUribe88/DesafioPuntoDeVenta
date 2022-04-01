package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.LineaDetalle;
import modelo.Producto;

class LineaDetalleTest {

	@Test
	void testCalcularSubtotal() {
		Producto p1 = new Producto();
		p1.setPrecio(200);
		
		LineaDetalle id= new LineaDetalle();
		id.setCantidad(2);
		id.setProducto(p1);
		
		assertEquals(400,id.calcularSubtotal());
		Producto p2 = new Producto();
		p2.setPrecio(200);
			
		LineaDetalle id2= new LineaDetalle();
		id2.setCantidad(1);
		id2.setProducto(p2);
		
		assertEquals(200,id2.calcularSubtotal());
	}

	
}
