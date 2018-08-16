package Operaciones;

import Vista.*;
import Modelo.*;
import Controlador.*;

public class Operaciones {

	public static void main(String[] args) {
		Modelo objModelo = new Modelo();
		Vista objVista = new Vista();

		Controlador controlador = new Controlador(objVista, objModelo);
		controlador.iniciar_vista();
		objVista.setVisible(true);

	}

}
