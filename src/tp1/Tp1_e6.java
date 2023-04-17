package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e6 {
	public static void main (String[] args) {
		String tipo_factura;
		int num_factura;
		String nombre_cliente;
		String producto1;
		float importe1 = (float) 0;
		String producto2;
		float importe2 = (float) 0;
		float importe_total = (float) 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Tipo de facura: ");
			tipo_factura = entrada.readLine();
			System.out.println("Ingrese numero de factura: ");
			num_factura = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese nombre del cliente: ");
			nombre_cliente = entrada.readLine();
			
			System.out.println("Ingrese el producto: ");
			producto1 = entrada.readLine();
			System.out.println("Ingrese el importe del producto1: ");
			importe1 = Float.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo producto: ");
			producto2 = entrada.readLine();
			System.out.println("Ingrese el importe del producto2: ");
			importe2 = Float.valueOf(entrada.readLine());
			importe_total = importe1+importe2;
			System.out.println("Factura\t\t "+tipo_factura+"\t N " +num_factura+ "\n");
			System.out.println("Nombre del cliente: "+nombre_cliente+ "\n");
			System.out.println("Producto\tImporte\n");
			System.out.println(producto1+"\t\t"+importe1+"\n");
			System.out.println(producto2+"\t\t"+importe2+"\n");
			System.out.println("Importe total:\t"+importe_total);
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
}
