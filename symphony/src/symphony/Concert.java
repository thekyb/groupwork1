package symphony;

public class Concert {

    private int mId;
    private String mName;
    public boolean isPerformed;
    private boolean enabled;

    public Concert(int id, String name, boolean performed){
        mId = id;
        mName = name;
        isPerformed = performed;
    }

	public int getId() {
		return mId;
	}

	public void setId(int mId) {
		this.mId = mId;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public boolean isPerformed() {
		return isPerformed;
	}

	public void setPerformed(boolean isPerformed) {
		this.isPerformed = isPerformed;
	}

	public void enable(boolean flag) {
		// TODO Auto-generated method stub
		enabled = flag;
	}

}
