package symphony;

public class Movement {
    private String mName;
    private String mComposerName;
	private int mNumber;

	public Movement(int num, String mName, String composer){
		mNumber = num;
		
	}

	public int getmNumber() {
		return mNumber;
	}

	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmComposerName() {
		return mComposerName;
	}

	public void setmComposerName(String mComposerName) {
		this.mComposerName = mComposerName;
	}

}
