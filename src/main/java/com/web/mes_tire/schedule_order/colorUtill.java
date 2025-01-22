package com.web.mes_tire.schedule_order;

import java.util.Random;

public class colorUtill {
	public static String getRandomColor() {
        Random random = new Random();
        // 랜덤 색상 생성 (Hex 코드 형식)
        return String.format("#%06x", random.nextInt(0xFFFFFF));
    }
}
