package tieto.at.PublicServices;

public class LoginResponse {
	private String access_token;
	private long expires;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public long getExpires() {
		return this.expires;
	}
	public void setExpires(long expires) {
		this.expires = expires;
	}

}
