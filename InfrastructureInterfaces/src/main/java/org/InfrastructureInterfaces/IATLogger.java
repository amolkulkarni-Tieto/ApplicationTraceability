package org.InfrastructureInterfaces;

public interface IATLogger {

	public void Trace(String message);
	public void Debug(String message);
	public void Error(String message, Exception ex);
}
