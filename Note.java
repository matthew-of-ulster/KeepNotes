
public class Note {
	
	private String[] color;
	private boolean trashed;
	private boolean pinned;
	private boolean archived;
	private String textContent;
	private String title;
	private long lastEdit;
	private long created;
	
	
	
	public Note(String input) {
		super();
		String[] details = input.split(",");
		
		//If the text content includes a comma the array will split into more than 8 values
		if(details.length>8){
			int over = details.length-8;
			for(int i=0;i<over;i++) {
				details[4]+=details[4+i];
				for(int j=0;j<over;j++) {
					details[4+j]=details[4+(j+1)];
				}
			}
		}
		
		//{"color":"BROWN","isTrashed":false,"isPinned":false,"isArchived":false,"textContent":"Action\n-alert\n-nalert\n-accept\n-naccept\n-com\n-ncom\n\nStatus\n-na\n-def\n-ndef\n-auth\n-nauth\n-healthy\n-nhealthy\n\nMasurement\n-na\n-PR\n-RR\n-DA\n-IR\n-DR\n\n","title":"All outputs from simulator","userEditedTimestampUsec":1616694948530000,"createdTimestampUsec":1616694189610000}

	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTrashed() {
		return trashed;
	}
	public void setTrashed(boolean trashed) {
		this.trashed = trashed;
	}
	public boolean isPinned() {
		return pinned;
	}
	public void setPinned(boolean pinned) {
		this.pinned = pinned;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public String getTextContent() {
		return textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getLastEdit() {
		return lastEdit;
	}
	public void setLastEdit(long lastEdit) {
		this.lastEdit = lastEdit;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	
	

}