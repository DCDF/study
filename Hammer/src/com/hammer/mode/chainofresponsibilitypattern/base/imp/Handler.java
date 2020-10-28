package com.hammer.mode.chainofresponsibilitypattern.base.imp;

import java.util.logging.Level;

import com.hammer.mode.chainofresponsibilitypattern.base.Request;
import com.hammer.mode.chainofresponsibilitypattern.base.Response;

public abstract class Handler {
	private Handler nextHandler;

	// 每个处理者都必须对请求作出处理(结合模版模式,模版方法)
	public final Response HandleMessage(Request request) {
		Response response = null;
		// 判断是否是自己的处理级别
		if (this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		}else {
			if(this.nextHandler != null) {
				response = this.nextHandler.HandleMessage(request);
			}else {
				//没有适当的处理者,业务自行处理
			}
		}
		return response;
	}

	// 设置下一个处理者
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}

	// 每个处理者都有一个处理级别
	protected abstract Level getHandlerLevel();

	// 每个处理者都必须实现处理任务
	protected abstract Response echo(Request request);
}
