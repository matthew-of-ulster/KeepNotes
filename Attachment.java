
public class Attachment {

	private String FileType;
	private String MimeType;
	public Attachment(String fileType, String mimeType) {
		super();
		FileType = fileType;
		MimeType = mimeType;
	}
	public String getFileType() {
		return FileType;
	}
	public void setFileType(String fileType) {
		FileType = fileType;
	}
	public String getMimeType() {
		return MimeType;
	}
	public void setMimeType(String mimeType) {
		MimeType = mimeType;
	}
	
	
}
