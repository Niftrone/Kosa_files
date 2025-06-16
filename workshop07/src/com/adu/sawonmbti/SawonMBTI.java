package com.adu.sawonmbti;

public class SawonMBTI {

	private int[] mbtiType;
	private int maxCount;
	private int maxMBTI;

	public void inputMBTI(int[] pepole) {
		mbtiType = pepole;

		System.out.println("사원의 수 : " + mbtiType.length);
		System.out.println("각사람의 성격 유형");
		for (int type : mbtiType) {
			System.out.print(type + " ");
		}
		System.out.println();
	}

	public int maxDuplication() {
		maxCount = 0;
		maxMBTI = -1;
		for (int i = 0; i < mbtiType.length; i++) {
			if (mbtiType[i] == -1)
				continue;

			int count = 1;
			for (int j = i + 1; mbtiType.length > j; j++) {
				if (mbtiType[i] == mbtiType[j]) {
					count++;
					mbtiType[j] = -1;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				maxMBTI = mbtiType[i];
			}
		}

		return maxMBTI;
	}
	
}
