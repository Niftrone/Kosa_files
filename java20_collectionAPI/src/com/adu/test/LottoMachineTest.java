package com.adu.test;

import java.util.TreeSet;

import com.adu.service.LottoMachineService;

public class LottoMachineTest {

	public static void main(String[] args) {
		LottoMachineService service = new LottoMachineService();
		
		TreeSet set = service.createLottoNumber();
	
		System.out.println("당신이 추첨한 Lotto Number ==>" + set);
	}

}
