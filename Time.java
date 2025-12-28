import java.util.*;

public class Time {
	
	public static void main(String[] args) {
        int yue1;
        int yue2;
        int ri;
        int ri1;
        int ri2;
		System.out.print("请输入第一个年份:");
        Scanner time = new Scanner(System.in);
        int nian1 = time.nextInt();
        System.out.print("请输入第一个月份(范围为1∼12):");
        while (true) {
            yue1 = time.nextInt();
            if (yue1 >= 1 && yue1 <= 12) {
                break;
            } else {
                System.out.print("请重新输入第一个月份(范围为1∼12):");
            }
        }
        if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
            System.out.print("请输入第一个日份(范围为1∼31):");
        } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
            System.out.print("请输入第一个日份(范围为1∼30):");
        } else if (yue1 == 2) {
            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                System.out.print("请输入第一个日份(范围为1∼29):");
            } else {
                System.out.print("请输入第一个日份(范围为1∼28):");
            }
        }
        while (true) {
            ri1 = time.nextInt();
            if ((yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) && (ri1 >= 1 && ri1 <= 31)) {
                break;
            } else if ((yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) && (ri1 >= 1 && ri1 <= 30)) {
                break;
            } else if (yue1 == 2) {
                if (((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) && (ri1 >= 1 && ri1 <= 29)) {
                    break;
                } else if (ri1>=1 && ri1 <= 28) {
                    break;
                } else {
                    if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                        System.out.print("请重新输入第一个日份(范围为1∼29):");
                    } else {
                        System.out.print("请重新输入第一个日份(范围为1∼28):");
                    }
                }
            } else {
                if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                    System.out.print("请重新输入第一个日份(范围为1∼31):");
                } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                    System.out.print("请重新输入第一个日份(范围为1∼30):");
                }
            }
        }
        System.out.print("请输入第二个年份:");
        int nian2 = time.nextInt();
        System.out.print("请输入第二个月份(范围为1∼12):");
        while (true) {
            yue2 = time.nextInt();
            if (yue2 >= 1 && yue2 <= 12) {
                break;
            } else {
                System.out.print("请重新输入第二个月份(范围为1∼12):");
            }
        }
        if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
            System.out.print("请输入第二个日份(范围为1∼31):");
        } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
            System.out.print("请输入第二个日份(范围为1∼30):");
        } else if (yue2 == 2) {
            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                System.out.print("请输入第二个日份(范围为1∼29):");
            } else {
                System.out.print("请输入第二个日份(范围为1∼28):");
            }
        }
        while (true) {
            ri2 = time.nextInt();
            if ((yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) && (ri2 >= 1 && ri2 <= 31)) {
                break;
            } else if ((yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) && (ri2 >= 1 && ri2 <= 30)) {
                break;
            } else if (yue2 == 2) {
                if (((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) && (ri2 >= 1 && ri2 <= 29)) {
                    break;
                } else if (ri2>=1 && ri2 <= 28) {
                    break;
                } else {
                    if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                        System.out.print("请重新输入第二个日份(范围为1∼29):");
                    } else {
                        System.out.print("请重新输入第二个日份(范围为1∼28):");
                    }
                }
            } else {
                if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                    System.out.print("请重新输入第二个日份(范围为1∼31):");
                } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                    System.out.print("请重新输入第二个日份(范围为1∼30):");
                } 
            }
        }
        int oknian1 = nian1;
        int okyue1 = yue1;
        int okri1 = ri1;
        int oknian2 = nian2;
        int okyue2 = yue2;
        int okri2 = ri2;
        if (nian1 == nian2 && yue1 == yue2 && ri1 == ri2) {
            System.out.print(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:0天");
        } else if (nian1 == nian2 && yue1 == yue2 && ri1 != ri2) {
            if (ri1 > ri2) {
                ri = ri1 - ri2;
                System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
            } else if (ri1 < ri2) {
                ri = ri2 - ri1;
                System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
            }
        } else if (nian1 == nian2 && yue1 != yue2 && ri1 == ri2) {
            if (yue1 > yue2) {
                ri = 0;
                while (true) {
                    if (yue1 == yue2) {break;}
                    yue1 = yue1 - 1;
                    if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                        ri += 31;
                    } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                        ri += 30;
                    } else if (yue1 == 2) {
                        if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                            ri += 29;
                        } else {
                            ri += 28;
                        }
                    }
                }
                System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
            } else if (yue1 < yue2) {
                ri = 0;
                while (true) {
                    if (yue2 == yue1) {break;}
                    yue2 = yue2 - 1;
                    if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                        ri += 31;
                    } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                        ri += 30;
                    } else if (yue2 == 2) {
                        if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                            ri += 29;
                        } else {
                            ri += 28;
                        }
                    }
                }
                System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
            }
        } else if (nian1 != nian2 && yue1 == yue2 && ri1 == ri2) {
            if (nian1 > nian2) {
                ri = 0;
                while (true) {
                    if (nian1 == nian2) {break;}
                    nian1 = nian1 - 1;
                    if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                        ri += 366;
                    } else {
                        ri += 365;
                    }
                }
                if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                    ri -= 1;
                } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                    ri += 1;
                }
                System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
            } else if (nian1 < nian2) {
                ri = 0;
                while (true) {
                    if (nian2 == nian1) {break;}
                    nian2 = nian2 - 1;
                    if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                        ri += 366;
                    } else {
                        ri += 365;
                    }
                }
                if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                    ri -= 1;
                } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                    ri += 1;
                }
                System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
            }
        } else if (nian1 == nian2 && yue1 != yue2 && ri1 != ri2) {
            if (yue1 > yue2) {
                if (ri1 > ri2) {
                    ri = ri1 - ri2;
                    while (true) {
                        if (yue1 == yue2) {break;}
                        yue1 = yue1 - 1;
                        if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                            ri += 31;
                        } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                            ri += 30;
                        } else if (yue1 == 2) {
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri += 29;
                            } else {
                                ri += 28;
                            }
                        }
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                } else if (ri1 < ri2) {
                    ri = ri1 - ri2;
                    while (true) {
                        if (yue1 == yue2) {break;}
                        yue1 = yue1 - 1;
                        if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                            ri += 31;
                        } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                            ri += 30;
                        } else if (yue1 == 2) {
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri += 29;
                            } else {
                                ri += 28;
                            }
                        }
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                }
            } else if (yue1 < yue2) {
                if (ri1 > ri2) {
                    ri = ri2 - ri1;
                    while (true) {
                        if (yue2 == yue1) {break;}
                        yue2 = yue2 - 1;
                        if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                            ri += 31;
                        } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                            ri += 30;
                        } else if (yue2 == 2) {
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri += 29;
                            } else {
                                ri += 28;
                            }
                        }
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                } else if (ri1 < ri2) {
                    ri = ri2 - ri1;
                    while (true) {
                        if (yue2 == yue1) {break;}
                        yue2 = yue2 - 1;
                        if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                            ri += 31;
                        } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                            ri += 30;
                        } else if (yue2 == 2) {
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri += 29;
                            } else {
                                ri += 28;
                            }
                        }
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                }
            }
        } else if (nian1 != nian2 && yue1 == yue2 && ri1 != ri2) {
            if (nian1 > nian2) {
                if (ri1 > ri2) {
                    ri = ri1 - ri2;
                    while (true) {
                        if (nian1 == nian2) {break;}
                        nian1 = nian1 - 1;
                        if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                } else if (ri1 < ri2) {
                    ri = ri1 - ri2;
                    while (true) {
                        if (nian1 == nian2) {break;}
                        nian1 = nian1 - 1;
                        if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                }
            } else if (nian1 < nian2) {
                if (ri1 > ri2) {
                    ri = ri2 - ri1;
                    while (true) {
                        if (nian2 == nian1) {break;}
                        nian2 = nian2 - 1;
                        if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                } else if (ri1 < ri2) {
                    ri = ri2 - ri1;
                    while (true) {
                        if (nian2 == nian1) {break;}
                        nian2 = nian2 - 1;
                        if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                }
            }
        } else if (nian1 != nian2 && yue1 != yue2 && ri1 == ri2) {
            if (nian1 > nian2) {
                if (yue1 > yue2) {
                    ri = 0;
                    while (true) {
                        if (yue1 == yue2) {break;}
                        yue1 = yue1 - 1;
                        if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                            ri += 31;
                        } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                            ri += 30;
                        } else if (yue1 == 2) {
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri += 29;
                            } else {
                                ri += 28;
                            }
                        }
                    }
                    while (true) {
                        if (nian1 == nian2) {break;}
                        nian1 = nian1 - 1;
                        if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                } else if (yue1 < yue2) {
                    ri = 0;
                    while (true) {
                        if (yue2 == yue1) {break;}
                        yue2 = yue2 - 1;
                        if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                            ri -= 31;
                        } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                            ri -= 30;
                        } else if (yue2 == 2) {
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri -= 29;
                            } else {
                                ri -= 28;
                            }
                        }
                    }
                    while (true) {
                        if (nian1 == nian2) {break;}
                        nian1 = nian1 - 1;
                        if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                }
            } else if (nian1 < nian2) {
                if (yue1 > yue2) {
                    ri = 0;
                    while (true) {
                        if (yue1 == yue2) {break;}
                        yue1 = yue1 - 1;
                        if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                            ri -= 31;
                        } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                            ri -= 30;
                        } else if (yue1 == 2) {
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri -= 29;
                            } else {
                                ri -= 28;
                            }
                        }
                    }
                    while (true) {
                        if (nian2 == nian1) {break;}
                        nian2 = nian2 - 1;
                        if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                } else if (yue1 < yue2) {
                    ri = 0;
                    while (true) {
                        if (yue2 == yue1) {break;}
                        yue2 = yue2 - 1;
                        if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                            ri += 31;
                        } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                            ri += 30;
                        } else if (yue2 == 2) {
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri += 29;
                            } else {
                                ri += 28;
                            }
                        }
                    }
                    while (true) {
                        if (nian2 == nian1) {break;}
                        nian2 = nian2 - 1;
                        if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                            ri += 366;
                        } else {
                            ri += 365;
                        }
                    }
                    if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                        ri -= 1;
                    } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                        ri += 1;
                    }
                    System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                }
            }
        } else if (nian1 != nian2 && yue1 != yue2 && ri1 != ri2) {
            if (nian1 > nian2) {
                if (yue1 > yue2) {
                    if (ri1 > ri2){
                        ri = ri1 - ri2;
                        while (true) {
                            if (yue1 == yue2) {break;}
                            yue1 = yue1 - 1;
                            if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                                ri += 31;
                            } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                                ri += 30;
                            } else if (yue1 == 2) {
                                if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                    ri += 29;
                                } else {
                                    ri += 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian1 == nian2) {break;}
                            nian1 = nian1 - 1;
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    } else if (ri1 < ri2) {
                        ri = ri1 - ri2;
                        while (true) {
                            if (yue1 == yue2) {break;}
                            yue1 = yue1 - 1;
                            if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                                ri += 31;
                            } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                                ri += 30;
                            } else if (yue1 == 2) {
                                if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                    ri += 29;
                                } else {
                                    ri += 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian1 == nian2) {break;}
                            nian1 = nian1 - 1;
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    }
                } else if (yue1 < yue2) {
                    if (ri1 > ri2) {
                        ri = ri1 - ri2;
                        while (true) {
                            if (yue2 == yue1) {break;}
                            yue2 = yue2 - 1;
                            if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                                ri -= 31;
                            } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                                ri -= 30;
                            } else if (yue2 == 2) {
                                if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                    ri -= 29;
                                } else {
                                    ri -= 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian1 == nian2) {break;}
                            nian1 = nian1 - 1;
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    } else if (ri1 < ri2) {
                        ri = ri1 - ri2;
                        while (true) {
                            if (yue2 == yue1) {break;}
                            yue2 = yue2 - 1;
                            if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                                ri -= 31;
                            } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                                ri -= 30;
                            } else if (yue2 == 2) {
                                if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                    ri -= 29;
                                } else {
                                    ri -= 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian1 == nian2) {break;}
                            nian1 = nian1 - 1;
                            if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    }
                }
            } else if (nian1 < nian2) {
                if (yue1 > yue2) {
                    if (ri1 > ri2) {
                        ri = ri2 - ri1;
                        while (true) {
                            if (yue1 == yue2) {break;}
                            yue1 = yue1 - 1;
                            if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                                ri -= 31;
                            } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                                ri -= 30;
                            } else if (yue1 == 2) {
                                if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                    ri -= 29;
                                } else {
                                    ri -= 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian2 == nian1) {break;}
                            nian2 = nian2 - 1;
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    } else if (ri1 < ri2) {
                        ri = ri2 - ri1;
                        while (true) {
                            if (yue1 == yue2) {break;}
                            yue1 = yue1 - 1;
                            if (yue1 == 1 || yue1 == 3 || yue1 == 5 || yue1 == 7 || yue1 == 8 || yue1 == 10 || yue1 == 12) {
                                ri -= 31;
                            } else if (yue1 == 4 || yue1 == 6 || yue1 == 9 || yue1 == 11) {
                                ri -= 30;
                            } else if (yue1 == 2) {
                                if ((nian1 % 4 == 0 && nian1 % 100 !=0) || (nian1 % 400 == 0)) {
                                    ri -= 29;
                                } else {
                                    ri -= 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian2 == nian1) {break;}
                            nian2 = nian2 - 1;
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    }
                } else if (yue1 < yue2) {
                    if (ri1 > ri2) {
                        ri = ri2 - ri1;
                        while (true) {
                            if (yue2 == yue1) {break;}
                            yue2 = yue2 - 1;
                            if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                                ri += 31;
                            } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                                ri += 30;
                            } else if (yue2 == 2) {
                                if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                    ri += 29;
                                } else {
                                    ri += 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian2 == nian1) {break;}
                            nian2 = nian2 - 1;
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    } else if (ri1 < ri2) {
                        ri = ri2 - ri1;
                        while (true) {
                            if (yue2 == yue1) {break;}
                            yue2 = yue2 - 1;
                            if (yue2 == 1 || yue2 == 3 || yue2 == 5 || yue2 == 7 || yue2 == 8 || yue2 == 10 || yue2 == 12) {
                                ri += 31;
                            } else if (yue2 == 4 || yue2 == 6 || yue2 == 9 || yue2 == 11) {
                                ri += 30;
                            } else if (yue2 == 2) {
                                if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                    ri += 29;
                                } else {
                                    ri += 28;
                                }
                            }
                        }
                        while (true) {
                            if (nian2 == nian1) {break;}
                            nian2 = nian2 - 1;
                            if ((nian2 % 4 == 0 && nian2 % 100 !=0) || (nian2 % 400 == 0)) {
                                ri += 366;
                            } else {
                                ri += 365;
                            }
                        }
                        if (((oknian1 % 4 == 0 && oknian1 % 100 !=0) || (oknian1 % 400 == 0)) && ((oknian2 % 4 != 0 && oknian2 % 100 ==0) || (oknian2 % 400 != 0))) {
                            ri -= 1;
                        } else if (((oknian1 % 4 != 0 && oknian1 % 100 ==0) || (oknian1 % 400 != 0)) && ((oknian2 % 4 == 0 && oknian2 % 100 !=0) || (oknian2 % 400 == 0))) {
                            ri += 1;
                        }
                        System.out.println(oknian1+"年"+okyue1+"月"+okri1+"日"+"与"+oknian2+"年"+okyue2+"月"+okri2+"日共间隔:"+ri+"天");
                    }
                }
            }
        }
    }
    
}
