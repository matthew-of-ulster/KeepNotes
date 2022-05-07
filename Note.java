
public class Note {
	
	private String color;
	private boolean trashed;
	private boolean pinned;
	private boolean archived;
	private String textContent;
	private String title;
	private long lastEdit;
	private long created;
	
	
	
	public Note(String input) {
		super();
		String[] details=input.split(",");
        if(details.length>8){
			int over = details.length-8;
			for(int i=0;i<over;i++) {
				details[4]+=details[4+i];
				for(int j=0;j<over;j++) {
					details[5+j]=details[6+j];
				}
			}
			details[6]=details[details.length-2];
			details[7]=details[details.length-1];
			
			String[] shrinkArray=new String[8];
			
			for(int i=0;i<shrinkArray.length;i++) {
				shrinkArray[i] = details[i];
			}
			System.out.println(input);
			for(String s:details) {
				System.out.println(s);
			}
			System.out.println();
			
			details=shrinkArray;
			
			title = details[0];
			if(details[0].split(":")[1].equals("{\"attachments\"")){
					color = "\"Weird\"";
			}else {
			color = details[0].split(":")[1];
			}
			trashed = Boolean.parseBoolean(details[1].split(":")[1]);
			
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
