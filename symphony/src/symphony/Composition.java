package symphony;

import java.util.ArrayList;

public class Composition {
    private Composer mComposer;
    private String mName;
    private int mId;
    private ArrayList<Soloist> mSoloistList;
    private ArrayList<Movement> mMovementList;

    public Composition(){
        
    }
    public Composition(Composer comp, 
                       String name, 
                       int id, 
                       ArrayList<Soloist> soloistList,
                       ArrayList<Movement> movementList
                       ){
        mComposer = comp;
        mName = name;
        mId = id;
        mSoloistList = soloistList;
        mMovementList = movementList;
    }

    public Composer getComposer(){
        return mComposer; 
    }

    public void setComposer(Composer comp){
        mComposer = comp;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName = name;
    }

    public int getId(){
        return mId;
    }

    public void setId(int id){
    	mId = id;
    }

    public void addSoloist(Soloist soloist){
        mSoloistList.add(soloist);
    }

    public Soloist getSoloist(int ID){
        for (Soloist s : mSoloistList)
        {
            if (s.getId() == ID)
                return s;
        }
        return null;
    }

    public void removeSoloist(Int ID){
        for (int i = 0; i< mSoloistList.length; i++)
        {
            if (mSoloistList[i].mId == ID)
                mSoloistList.remove(i);
        }
    }

    public void addMovement(Movement movement){
        mSoloistList.add(movement);
    }

    public Movement getMovement(Int ID){
        for (Soloist s : soloistList)
        {
            if (s.mId == ID)
                return s;
        }
        return null;
    }

    public void removeMovement(Int ID){
        for (int i = 0; i< mMovementList.length; i++)
        {
            if (mMovementList[i].mId == ID)
                mMovementList.remove(i);
        }
    }

}
