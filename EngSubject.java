/* This is a custom object for Engineering subjects */
class EngSubject extends subject{

    int lecUnits;
    int labUnits;
    boolean hasPRC = false;

    public void setHasPRC(boolean flag){
        hasPRC = flag;
    }

    public boolean getHasPRC(){
        return hasPRC;
    }

	public void setUnits(int lab, int lec){
        labUnits = lab;
        lecUnits = lec;
	}

    public int getUnits(){
        return lecUnits + labUnits;
    }

    public int getLecUnits(){
        return lecUnits;
    }

    public int getLabUnits(){
        return labUnits;
    }
}