package ejerQuiniela;
/*
 * Ejercicio con condiciones de la Quiniela
 * 21/09/2018
 * Yunyang Hu - Finalizado correctamente
 */
public class EjerQuiniela2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] posi = {"1","x","2"};
		int cont = 1,cont0 = 0, cont1 = 0, cont2 = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				for (int k = 0; k < 3; k++) {
					for (int k2 = 0; k2 < 3; k2++) {
						for (int l = 0; l < 3; l++) {
							for (int l2 = 0; l2 < 3; l2++) {
								for (int m = 0; m < 3; m++) {
									for (int m2 = 0; m2 < 3; m2++) {
										for (int n = 0; n < 3; n++) {
											for (int n2 = 0; n2 < 3; n2++) {
												for (int o = 0; o < 3; o++) {
													for (int o2 = 0; o2 < 3; o2++) {
														for (int p = 0; p < 3; p++) {
															for (int p2 = 0; p2 < 3; p2++) {
																int[] boleto = {j, i, k, k2, l, l2, m, m2, n, n2, o, o2, p, p2};
																for (int q = 0; q < boleto.length; q++) {
																	if(boleto[q] == 0) {
																		cont0++;
																	}
																	else if(boleto[q] == 1) {
																		cont1++;
																	}else {
																		cont2++;
																	}
																}
																/*
																for (int q = 0; q < boleto.length; q++) {
																	System.out.print(boleto[q]);
																}
																System.out.println();
																*/
																if((cont0 > 5 && cont0 < 11) && (cont1 > 2 && cont1 < 6) && (cont2 > 3 && cont2 < 9)) {
																System.out.print(posi[j] + " " + posi[i] + " " + posi[k] + " " + posi[k2] + " " + posi[l] + " " + posi[l2] + " " 
																+ posi[m] + " " + posi[m2] + " " + posi[n] + " " + posi[n2] + " " + posi[o] + " " + posi[o2] + " "
																		+ posi[p] + " " + posi[p2] + " Quiniela nº" + cont + "\t");
																
																System.out.print("Numero de 1 : " + cont0 + " ");
																System.out.print("Numero de x : " + cont1 + " ");
																System.out.println("Numero de 2 : " + cont2);
																cont++;
																
																}
																
																
																cont0 = 0; cont1 = 0; cont2 = 0;
																
															}
														}
													}
													}	
													
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
