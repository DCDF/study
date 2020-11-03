package com.hammer.mode.observerpattern.a22_1;

public class spy extends Thread {
	private HanFeiZi hanFeizi;
	private LiSi lisi;
	private String type;

	public spy(HanFeiZi hanFeizi, LiSi lisi, String type) {
		this.hanFeizi = hanFeizi;
		this.lisi = lisi;
		this.type = type;
	}

	@Override
	public void run() {
		while (true) {
			if (this.type.equals("breakfast")) {// 监控吃饭
				if (this.hanFeizi.isHaveingBreakfast()) {// 韩非子吃饭了,通知李斯
					this.lisi.update("韩非子在恰饭");
					this.hanFeizi.setHaveingBreakfast(false);// 清除标识,继续监控
				}
			} else {
				if (this.hanFeizi.isHavingFun()) {
					this.lisi.update("韩非子在玩");
					this.hanFeizi.setHavingFun(false);
				}
			}
		}
	}
}
