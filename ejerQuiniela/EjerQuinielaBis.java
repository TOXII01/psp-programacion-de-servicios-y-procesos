package ejerQuiniela;
/*
 * @PSP
 * Primer Ejercicio - Quiniela [Solución más optimizada posible]
 * Yunyang Hu
 * 2 DAM - 14/09/18
 */
public class EjerQuinielaBis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'1','x','2'};int cont = 0;
		for (char i : chars) {//1
			for (char i2 : chars) {//2
				for (char i3 : chars) {//3
					for (char i4 : chars) {//4
						for (char i5 : chars) {//5
							for (char i6 : chars) {//6
								for (char i7 : chars) {//7
									for (char i8 : chars) {//8
										for (char i9 : chars) {//9
											for (char i10 : chars) {//10
												for (char i11 : chars) {//11
													for (char i12 : chars) {//12
														for (char i13 : chars) {//13
															for (char i14 : chars) {//14
																cont++;
																System.out.println(i + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6 + " " + i7 + " " + i8 + " " + i9 + " " + i10 + " "
															+ i11 + " " + i12 + " " + i13 + " " + i14 + " " + "Nº : " + cont);
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
