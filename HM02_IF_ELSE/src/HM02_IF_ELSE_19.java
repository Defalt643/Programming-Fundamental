import java.util.Scanner;
public class HM02_IF_ELSE_19 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int day = kb.nextInt();
		int month = kb.nextInt();
		
		if(month == 12 && day>21) {
			System.out.println("Capricorn");
		}else {
			if(month == 1 && day<20) {
				System.out.println("Capricorn");
			}else {
				if(month == 1 && day>19) {
					System.out.println("Aquarius");
				}else {
					if(month == 2 && day<19) {
						System.out.println("Aquarius");
					}else {
						if(month == 2 && day>18) {
							System.out.println("Pisces");
						}else {
							if(month == 3 &&day<21) {
								System.out.println("Pisces");
							}else {
								if(month == 3 && day>20) {
									System.out.println("Aries");
								}else {
									if(month == 4 && day<20) {
										System.out.println("Aries");
									}else {
										if(month == 4 && day>19) {
											System.out.println("Taurus");
										}else {
											if(month == 5 && day<21) {
												System.out.println("Taurus");
											}else {
												if(month == 5 && day>20) {
													System.out.println("Gemini");
												}else {
													if(month == 6 && day<22) {
														System.out.println("Gemini");
													}else {
														if(month == 6 && day>21) {
															System.out.println("Cancer");
														}else {
															if(month == 7 && day<23) {
																System.out.println("Cancer");
															}else {
																if(month == 7 && day>22) {
																	System.out.println("Leo");
																}else {
																	if(month == 8 && day<23) {
																		System.out.println("Leo");
																	}else {
																		if(month == 8 && day>22) {
																			System.out.println("Virgo");
																		}else {
																			if(month == 9 && day<23) {
																				System.out.println("Virgo");
																			}else {
																				if(month == 9 && day>22) {
																					System.out.println("Libra");
																				}else {
																					if(month == 10 && day<24) {
																						System.out.println("Libra");
																					}else {
																						if(month == 10 && day>23) {
																							System.out.println("Scorpio");
																						}else {
																							if(month == 11 && day<22) {
																								System.out.println("Scorpio");
																							}else {
																								if(month == 11 && day>21) {
																									System.out.println("Sagittarius");
																								}else {
																									if(month == 12 && day<22) {
																										System.out.println("Sagittarius");
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