package es.vqs.adapter;

public class Ordenador {
	private SD ranuraSD;
	
	public void conectarSDaRanura(SD tarjeta) {
		this.ranuraSD = tarjeta;
	}

	public void leerDatosDeLaTarjetaSD() {
		this.ranuraSD.mandarDatosPorPinesSD();
	}
}