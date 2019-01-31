package ejerQuiniela;
/*
 * @PSP
 * Primer ejercicio - Quiniela [todas las combinaciones]
 * Yunyang Hu
 * 2 DAM - 12/09/18
 * 
 */

public class ejerQuiniela {

	public static void main(String[] args) {
		int a = 1, b = 2, cont = 0;
		String x = "x";
		
		  for(int i1 = 0; i1 < 4782969;i1++) {
			  if(i1 < 1594323) {
				  System.out.print(a);
			  }
			  else if(i1 >= 1594323 && i1 < 3188646) {
				  System.out.print(x);
			  }
			  else {
				  System.out.print(b);
			  }
			for(int i2 = 0; i2 < 1; i2++) {
				int pos11 = i1 % 1594323;
				if(pos11 < 531441) {
					System.out.print(a);
				}
				else if(pos11 >= 531441 && pos11 < 1062882) {
					System.out.print(x);
				}
				else {
					System.out.print(b);
				}
				for(int i3 = 0; i3 < 1; i3++) {
					int pos10 = i1 % 531441;
					if(pos10 < 177147) {
						System.out.print(a);
					}
					else if(pos10 >= 177147 && pos10 < 354294) {
						System.out.print(x);
					}
					else {
						System.out.print(b);
					}
					for(int i4 = 0; i4 < 1;i4++) {
						int pos9 = i1 % 177147;
						if(pos9 < 59049) {
							System.out.print(a);
						}
						else if(pos9 >= 59049 && pos9 < 118098) {
							System.out.print(x);
						}
						else {
							System.out.print(b);
						}
						for(int i5 = 0; i5 < 1;i5++) {
							int pos8 = i1 % 59049;
							if(pos8 < 19683) {
								System.out.print(a);
							}
							else if(pos8 >= 19683 && pos8 < 39366) {
								System.out.print(x);
							}
							else {
								System.out.print(b);
							}
							for(int i6 = 0; i6 < 1;i6++) {
								int pos7 = i1 % 19683;
								if(pos7 < 6561) {
									System.out.print(a);
								}
								else if(pos7 >= 6561 && pos7 < 13122) {
									System.out.print(x);
								}
								else {
									System.out.print(b);
								}
								for(int i7 = 0; i7 < 1;i7++) {
									int pos6 = i1 % 6561;
									if(pos6 < 2187) {
										System.out.print(a);
									}
									else if(pos6 >= 2187 && pos6 < 4374) {
										System.out.print(x);
									}
									else {
										System.out.print(b);
									}
									for(int i8 = 0; i8 < 1;i8++) {
										int pos5 = i1 % 2187;
										if(pos5 < 729) {
											System.out.print(a);
										}
										else if(pos5 >= 729 && pos5 < 1458) {
											System.out.print(x);
										}
										else {
											System.out.print(b);
										}
										for(int i9 = 0; i9 < 1;i9++) {
											int pos4 = i1 % 729;
											if(pos4 < 243) {
												System.out.print(a);
											}
											else if(pos4 >= 243 && pos4 < 486) {
												System.out.print(x);
											}
											else {
												System.out.print(b);
											}
											for(int i10 = 0; i10 < 1;i10++) {
												int pos3 = i1 % 243;
												if(pos3 < 81) {
													System.out.print(a);
												}
												else if(pos3 >= 81 && pos3 < 162) {
													System.out.print(x);
												}
												else {
													System.out.print(b);
												}
												for(int i11 = 0; i11 < 1;i11++) {
													int pos2 = i1 % 81;
													if(pos2 < 27) {
														System.out.print(a);
													}
													else if(pos2 >= 27 && pos2 < 54) {
														System.out.print(x);
													}
													else {
														System.out.print(b);
													}
													
													for(int i12 = 0; i12 < 1;i12++) {
														 int pos1 = i1 % 27;
														  if (pos1 < 9) {
															  System.out.print(a);
														  }
														  else if(pos1 >= 9 && pos1 < 18) {
															  System.out.print(x);
														  }
														  else {
															  System.out.print(b);
														  }
														for(int i13 = 0; i13 < 1;i13++) {
															 if(i1 % 9 == 0  || i1 % 9 == 1 || i1 % 9 == 2) {
																 System.out.print(a);
															 }
															 else if(i1 % 9 == 3 ||i1 % 9 == 4 || i1 % 9 == 5) {
																 System.out.print(x);
															 }
															 else {
																 System.out.print(b);
															 }
															for(int i14 = 0; i14 < 1;i14++) {
																 if(i1 % 3 == 0) {
						 											System.out.print(a);
					 											}
																 else if(i1 % 3 == 1) {
																	 System.out.print(x);
																 }
																 else {
																	 System.out.print(b);
																 }
																 cont++;
															}
															System.out.println(" Nº : " + cont);
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
		  /*
		 for(int i0 = 0; i0 < 81; i0++) {
			 if(i0 < 27) {
				 System.out.print(a);
			 }
			 else if(i0 >= 27 && i0 < 54) {
				 System.out.print(x);
			 }
			 else {
				 System.out.print(b);
			 }
		  for(int i = 0; i < 1; i++) {
			  int pos = i0 % 27;
			  if(pos >= 0 && pos < 9) {
				  System.out.print(a);
			  }
			  else if(pos >= 9 && pos < 18) {
				  System.out.print(x);
			  }
			  else {
				  System.out.print(b);
			  }
			  for(int i1 = 0; i1 < 1; i1++) {
				  if(i0 % 9 == 0  || i0 % 9 == 1 || i0 % 9 == 2) {
					  System.out.print(a);
				  }
				  else if(i0 % 9 == 3 ||i0 % 9 == 4 || i0 % 9 == 5) {
					  System.out.print(x);
				  }
				  else {
					  System.out.print(b);
				  }
				  for(int i2 = 0; i2 < 1; i2++) {
					  if(i0 % 3 == 0) {
						  System.out.print(a);
					  }
					  else if(i0 % 3 == 1) {
						  System.out.print(x);
					  }
					  else {
						  System.out.print(b);
					  }
				  }
				  System.out.println();
			  }
			  
		  }
		}*/
	}
}
