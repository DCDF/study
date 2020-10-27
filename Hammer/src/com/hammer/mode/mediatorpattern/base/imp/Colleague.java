package com.hammer.mode.mediatorpattern.base.imp;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator _mediator) {
		this.mediator = _mediator;
	}
}
